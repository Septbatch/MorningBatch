package com.automationframework.dropdownsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeTest3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement multidropdown =driver.findElement(By.id("multiple-select-example"));
		
		Select fruits= new Select(multidropdown);
		
		fruits.selectByIndex(0);
		fruits.selectByValue("peach");
		
		List<WebElement> selectedfruits=fruits.getAllSelectedOptions();
		
		for(WebElement fruit:selectedfruits) {
			System.out.println(fruit.getText());
		}
		
		fruits.deselectByValue("peach");
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}

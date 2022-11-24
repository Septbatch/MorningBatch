package com.automationframework.dropdownsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeTest2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement fruits=driver.findElement(By.id("fruits"));
		
		Select fruitslist= new Select(fruits);
		
		List<WebElement> fruitsdata =fruitslist.getOptions();
		
		for(WebElement fruit:fruitsdata) {
			
			if(fruit.getText().equalsIgnoreCase("mango")) {
				fruit.click();
				break;
			}
		}
		
		System.out.println("Select Fruit ::"+fruitslist.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	

}

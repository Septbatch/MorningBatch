package com.automationframework.dropdownsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeItTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement carsList = driver.findElement(By.id("carselect"));
		
		Select cars= new Select(carsList);
		
		cars.selectByVisibleText("Honda"); // Honda
		
		Thread.sleep(3000);
		
		cars.selectByIndex(0);  //BMW
		
		Thread.sleep(3000);
		
		cars.selectByValue("benz"); //benz
		
		WebElement selectOption=cars.getFirstSelectedOption();  //benz
		
		String selected_Option=selectOption.getText();
		
		System.out.println("Last Selected Car is ::"+selected_Option);
		
		Thread.sleep(3000);
		
		driver.close();
	}

}

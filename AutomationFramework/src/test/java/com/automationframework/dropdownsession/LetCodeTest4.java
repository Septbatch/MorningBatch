package com.automationframework.dropdownsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeTest4 {
	
	public void carsSelect(int cartoSelect) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://courses.letskodeit.com/practice");

		WebElement carslist = driver.findElement(By.id("carselect"));

		Select cars = new Select(carslist);

		cars.selectByIndex(cartoSelect);

		Thread.sleep(3000); // to halt execution

		driver.close();
		
	}
	
	public static void multiFruitSelect(String selectbyvisibleText, String deselectbyvalue) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement fruistlist=driver.findElement(By.xpath(" //select[@id='multiple-select-example']"));
		
		Select fruits= new Select(fruistlist);
		
		fruits.selectByVisibleText(selectbyvisibleText);
		
		Thread.sleep(3000);
		
		fruits.deselectByValue(deselectbyvalue);
		
		Thread.sleep(3000);
		
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		
		LetCodeTest4 test= new LetCodeTest4();
		
		test.carsSelect(2);//Honda
		
		multiFruitSelect("Orange", "orange");
		

	}

}

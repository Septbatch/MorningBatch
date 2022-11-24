package com.automationframework.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLoginLocators {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		
		driver.findElement(By.name("login")).sendKeys("testingtraining@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("G@testing2022");
		
		driver.findElement(By.linkText("Forgot password?")).click(); // will click on forgot password
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		driver.navigate().back();
		
		WebElement page_header_name=driver.findElement(By.tagName("h1"));
		
		String header =page_header_name.getText();
		
		System.out.println("Git hub page header is :: "+header);
	
		
	}

}

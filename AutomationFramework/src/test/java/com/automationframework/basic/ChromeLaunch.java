package com.automationframework.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();// This automatic approach
		// Above syntax replace below syntax
		
		//System.getProperty("webdriver.chrome.driver", "path of .exe file"); // This manual approach
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://github.com/");
		
		Thread.sleep(2000); // This will take milliseconds to halt execution
		
		driver.manage().window().maximize();
		//This syntax will maximize any opened browser
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}

package com.automationframework.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitLoginTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		
		driver.findElement(By.id("login_field")).sendKeys("ismailpashasyed@gmail.com");
		
		WebElement password_textbox =driver.findElement(By.name("password"));
		
		password_textbox.sendKeys("I@syed2030");
		
		driver.findElement(By.name("commit")).click();
		
		String page_title = driver.getTitle(); // IF we pass invalid credentials then still my
		// applciaiton in login page so we get same page title.
		
		System.out.println("Page title is ::"+page_title);
		
		String expected_title= "GitHub";
		
		if(expected_title.equals(page_title)) {
			System.out.println("Git Hub login successfully");
		}
		else {
			System.out.println("Github login failed");
		}
		
		Thread.sleep(4000);
		
		driver.close();
		

	}

}

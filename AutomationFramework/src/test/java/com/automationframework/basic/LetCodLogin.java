package com.automationframework.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://letcode.in/signin");

		WebElement username_textbox = driver.findElement(By.name("email"));

		username_textbox.sendKeys("testingtraining@gmail.com");

		WebElement password_textbox = driver.findElement(By.name("password"));

		password_textbox.sendKeys("G@testing2022");

		WebElement login_button = driver.findElement(By.xpath("//button[text()='LOGIN']"));

		login_button.click();

		Thread.sleep(12000);
		String expected_url = "https://letcode.in/";

		String actual_url = driver.getCurrentUrl(); // https://letcode.in/

		if (actual_url.equals(expected_url)) {  // True [if block executed]  // False [else block executed]
			System.out.println("LedCode application succesfully Logged in, Test Pass");
		}
		else {
			System.out.println("LedCode application not logged in, Test Fail");
		}
		

		  Thread.sleep(3000);
		
		// After login I want to test either application logged in successfully or not.

		driver.close();
	}

}

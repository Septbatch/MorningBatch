package com.automationframework.syncronizationsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeLoginWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.get("https://letcode.in/signin");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testingtraining@gmail.com");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("G@testing2022");

		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();

		WebElement toast_message = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		
		wait.until(ExpectedConditions.invisibilityOf(toast_message));

		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		
		WebElement byebye_toastmessage=driver.findElement(By.xpath("//div[@role='alertdialog']"));
	     
		wait.until(ExpectedConditions.visibilityOf(byebye_toastmessage));
		
		String actual_message=byebye_toastmessage.getText();
		
		String expected=" Bye! See you soon :) ";
		
		if(expected.contains(actual_message)) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		
	
	}

}

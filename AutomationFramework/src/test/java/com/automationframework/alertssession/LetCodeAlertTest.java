package com.automationframework.alertssession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeAlertTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("CloudNaradha");
		
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String alertmessage=alert.getText();
		
		System.out.println("Alert Message is ::"+alertmessage);
		
		alert.accept(); // This method will accept alert from webpage.
		
		Thread.sleep(3000);
		
		driver.close();
	}

}

package com.automationframework.syncronizationsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS); //global wait applicable for entire driver
		
		driver.get("https://letcode.in/waits");
		
		driver.findElement(By.xpath("//button[.='Simple Alert']")).click();
		
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alert.getText()); // This method is used to take text from alert.
		
		alert.accept();
		
		Thread.sleep(2000);
		
		driver.close();
	}
}



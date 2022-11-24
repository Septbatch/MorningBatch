package com.automationframework.actionssession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickClass {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Now I want to perform double click operation on specific element.
		
		WebElement double_click_btn =driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		
		Actions action= new Actions(driver);
		
		action.doubleClick(double_click_btn).perform();
		
		Alert alert=driver.switchTo().alert();
		
		String alert_message = alert.getText();
		
		System.out.println(alert_message);
		
		alert.accept();
	}

}

package com.automationframework.actionssession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement right_click_Option =driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(right_click_Option).perform();
		
		
		Thread.sleep(3000);
		
		WebElement paste_subOption=driver.findElement(By.xpath("//li/span[text()='Quit']"));
		
		paste_subOption.click();
		
		Alert alert=driver.switchTo().alert();
		
		String alert_message=alert.getText();
		
		System.out.println(alert_message);
		
		alert.accept();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}

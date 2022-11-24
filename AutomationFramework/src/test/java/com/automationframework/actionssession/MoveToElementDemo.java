package com.automationframework.actionssession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://courses.letskodeit.com/practice");
		
		//My requirement to move to specific position.
		
		WebElement mouse_hover_button=driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
		
		WebElement reload_button = driver.findElement(By.xpath("//a[text()='Reload']"));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(mouse_hover_button).click(reload_button).perform();

		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}

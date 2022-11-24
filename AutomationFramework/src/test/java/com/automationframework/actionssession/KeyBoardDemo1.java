package com.automationframework.actionssession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardDemo1 {
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement compendium_link =driver.findElement(By.linkText("compendiumdev"));
		
		Actions action= new Actions(driver);
		
		action.moveToElement(compendium_link).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
	}

}

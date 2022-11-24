package com.automationframework.framessession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class FramesTest {
	
		public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
	
			WebDriver driver = new ChromeDriver();
	
			driver.manage().window().maximize();
	
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
			driver.manage().deleteAllCookies();
	
			driver.get("https://jqueryui.com/droppable/");
			
			WebElement frame_page=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			
			driver.switchTo().frame(frame_page); // Now it is switching to frame based on webElement.
			
			WebElement drag_box = driver.findElement(By.xpath("//div[@id='draggable']"));
	
			WebElement drop_box = driver.findElement(By.xpath("//div[@id='droppable']"));
	
			Actions action = new Actions(driver);
			
			action.dragAndDrop(drag_box, drop_box).perform();
			
			driver.switchTo().defaultContent();
			
			driver.findElement(By.xpath("//a[text()='Download']")).click();
		}
		
		
	
	}

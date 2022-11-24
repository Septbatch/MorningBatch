package com.automationframework.windowhandlingsessions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://github.com/login");

		String parent_window = driver.getWindowHandle(); //One window

		String enter_action = Keys.chord(Keys.CONTROL, Keys.ENTER);

		driver.findElement(By.linkText("Forgot password?")).sendKeys(enter_action);
		
		//After this two windows is there in page. [Login page] [Forgot password page]
		  
		// How to get all the windows of the page
		
		Set<String> allwindows=driver.getWindowHandles(); // Two Windows
		
		for(String window:allwindows) {
			
			driver.switchTo().window(window); // login or password
			
			String page_url=driver.getCurrentUrl();
			
			if(page_url.equals("https://github.com/password_reset")) { // False // True
				driver.findElement(By.xpath("//input[@id='email_field']")).sendKeys("testingtraining@gmail.com");
			}
		}
		
		/*
		 * Thread.sleep(3000); driver.quit();
		 */ // All opened windows will close.
		
		
		  driver.switchTo().window(parent_window);
		  
		  String title=driver.getTitle();
		  
		  System.out.println(title);
		  
		  Thread.sleep(4000);
		  
		  driver.quit(); // Here only parent window will close, becoz driver instance
		  
		 
	}

}

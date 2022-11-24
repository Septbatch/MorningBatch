package com.automationframework.radiocheckboxsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeItDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
	   WebDriver driver= new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.manage().deleteAllCookies();
	   
	   driver.get("https://courses.letskodeit.com/practice");
	   
	   // Now I want to select radio buttons
	   
	
	   driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
	   
	   //here only benz get selected, because radio buttons allows to select only one value.
	   
	   Thread.sleep(3000);
	   
	   driver.close();
	}

}

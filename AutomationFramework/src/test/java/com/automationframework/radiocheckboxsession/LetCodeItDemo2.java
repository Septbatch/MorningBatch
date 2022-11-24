package com.automationframework.radiocheckboxsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeItDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.findElement(By.xpath("//input[@id='benzcheck']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='hondacheck']")).click();
		
		//Here both benz and honda get selected becoz checkbox allows to select more than one value.
		
		Thread.sleep(3000);
		
		driver.close();
	}

}

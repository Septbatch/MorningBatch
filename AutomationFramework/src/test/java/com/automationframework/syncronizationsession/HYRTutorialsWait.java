package com.automationframework.syncronizationsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HYRTutorialsWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
		
		Thread.sleep(10000);
		
		WebElement textbox1=driver.findElement(By.xpath("//p[text()='Click the below buttons to display the textboxes. ']/parent::div//h3/input"));
		
		textbox1.sendKeys("Cloud Naradha");
		
		driver.findElement(By.xpath("//button[text()='Add Textbox2']")).click();
		
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//p[text()='Click the below buttons to display the textboxes. ']/parent::div//h3/input[2]")).sendKeys("Cloud Naradha Testing");	
	}

}

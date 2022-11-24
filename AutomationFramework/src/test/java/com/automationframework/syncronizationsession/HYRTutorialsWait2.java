package com.automationframework.syncronizationsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HYRTutorialsWait2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
		
		WebElement textbox1=driver.findElement(By.xpath("//p[text()='Click the below buttons to display the textboxes. ']/parent::div//h3/input"));
		
		textbox1.sendKeys("Cloud Naradha");
		
		driver.findElement(By.xpath("//button[text()='Add Textbox2']")).click();
		
		driver.findElement(By.xpath("//p[text()='Click the below buttons to display the textboxes. ']/parent::div//h3/input[2]")).sendKeys("Cloud Naradha Testing");	
	}

}

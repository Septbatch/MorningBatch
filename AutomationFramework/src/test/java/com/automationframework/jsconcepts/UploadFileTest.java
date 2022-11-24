package com.automationframework.jsconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileTest {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		
		WebElement upload_button=driver.findElement(By.cssSelector("input#file-upload"));
		
		upload_button.sendKeys("C:\\Users\\gurum\\Desktop\\Cloud Sep Batch\\9th Nov 9 AM .txt");
		
		driver.findElement(By.cssSelector("input#file-submit")).click();
	}

}

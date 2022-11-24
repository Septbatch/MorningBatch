package com.automationframework.webtablesession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EntireData {
	
	// Entire data of the table
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.get("https://letcode.in/table");
		
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='shopping']//tr/td"));
		
		for(WebElement tabledata:table) {
			
			System.out.println(tabledata.getText());
		}
	}

}

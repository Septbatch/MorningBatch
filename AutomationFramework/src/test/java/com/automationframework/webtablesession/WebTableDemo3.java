package com.automationframework.webtablesession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo3 {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://letcode.in/table");
		
		WebElement table =driver.findElement(By.xpath("//label[text()='Sortable Tables']"));
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();", table);
		
		String path= "//label[text()='Sortable Tables']/parent::div//tr/td[text()='%s']/following-sibling::td[5]";
		
		String text= "Cupcake";
		
		
		String cholestorl=driver.findElement(By.xpath(String.format(path, text))).getText();
		System.out.println(text+" "+cholestorl);
	}

}

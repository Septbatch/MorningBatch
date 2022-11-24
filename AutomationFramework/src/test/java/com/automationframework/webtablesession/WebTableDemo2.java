package com.automationframework.webtablesession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://letcode.in/table");
		
		String  path= "//table[@id='simpletable']//tbody/tr/td[text()='%s']/following-sibling::td[3]/input";
		
		String text_enter="Yashwanth";
		
		
		driver.findElement(By.xpath(String.format(path, text_enter))).click();
		
		
	}

}

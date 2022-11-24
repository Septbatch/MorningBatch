package com.automationframework.csssession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeCSSSelector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://courses.letskodeit.com/practice");

		driver.findElement(By.cssSelector("input#name")).sendKeys("CloudNaradha");

		driver.findElement(By.cssSelector("input#alertbtn")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.accept();
		
		driver.findElement(By.cssSelector("input[value$=Confirm]")).click();
		
		
		Alert alert1=driver.switchTo().alert();
		
		alert1.accept();
		
		

	}

}

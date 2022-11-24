package com.automationframework.screeshotsession;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureImage {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://letcode.in/signin");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testingtraining@gmail.com");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("G@testing2022");

		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		Thread.sleep(5000);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File destFile = new File(
				"C:\\Users\\gurum\\Desktop\\Cloud Sep Batch\\TestingTrainingProjects\\AutomationFramework\\CapturePhoto\\login.jpg");

		FileUtils.copyFile(src, destFile);
	}

}

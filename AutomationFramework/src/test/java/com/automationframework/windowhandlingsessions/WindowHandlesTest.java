package com.automationframework.windowhandlingsessions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://letcode.in/windows");

		String parent_window = driver.getWindowHandle();

		driver.findElement(By.xpath("//button[text()='Muiltiple windows']")).click();

		Set<String> allwindows = driver.getWindowHandles();

		for (String window : allwindows) {
			driver.switchTo().window(window);

			String act_url = driver.getCurrentUrl();

			if (act_url.equals("https://letcode.in/alert")) {
				driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();

				Alert alert = driver.switchTo().alert();

				System.out.println(alert.getText());

				alert.accept();
			}

		}
		
		driver.switchTo().window(parent_window);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}

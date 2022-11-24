package com.automationframework.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.com");

		String opened_page_url = driver.getCurrentUrl();
		String opened_page_title = driver.getTitle();

		System.out.println(opened_page_title);  // opned page title print

		System.out.println(opened_page_url); // opened page url print

		Thread.sleep(2000);

		driver.navigate().back();

		driver.close();

	}

}

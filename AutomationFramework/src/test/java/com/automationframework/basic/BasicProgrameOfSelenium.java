package com.automationframework.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicProgrameOfSelenium {

	public static void main(String[] args) {

		// First we need to call .exe file location

		String projectlocation = System.getProperty("user.dir");
		// This set will get project location

		System.out.println(projectlocation);

		// System.getProperty("webdriver.chrome.driver", projectlocation + "\\chromedriver.exe");
		
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\gurum\\Desktop\\Cloud Sep Batch\\Softwars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");

	}

}

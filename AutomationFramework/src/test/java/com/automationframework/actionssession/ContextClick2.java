package com.automationframework.actionssession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick2 {

	public void clickOperation(String selectedvalue) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement right_click_btn = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions action = new Actions(driver);

		action.contextClick(right_click_btn).perform();

		List<WebElement> sub_options = driver.findElements(By.xpath("//li/span"));
		System.out.println(sub_options.size());

		for (WebElement option : sub_options) {
			System.out.println(option.getText());
			if (option.getText().equals(selectedvalue)) {
				option.click();
				break;
			}
		}

		Alert alert = driver.switchTo().alert();
		String alertmesage = alert.getText();

		System.out.println(alertmesage);

		alert.accept();
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		ContextClick2 demo = new ContextClick2();

		demo.clickOperation("Quit");
	}

}

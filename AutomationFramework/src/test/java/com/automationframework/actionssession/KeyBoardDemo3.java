package com.automationframework.actionssession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardDemo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://courses.letskodeit.com/practice");

		WebElement text_box = driver.findElement(By.xpath("//input[@name='enter-name']"));

		Actions action = new Actions(driver);

		action.click(text_box).keyDown(Keys.SHIFT).sendKeys("mohan").keyUp(Keys.SHIFT).perform();

	}

}

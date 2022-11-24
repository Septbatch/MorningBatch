package com.automationframework.radiocheckboxsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeItDemo3 {

	public void radioSelect(String cars) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://courses.letskodeit.com/practice");

		List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@type='radio']"));

		for (WebElement radiobutton : radiobuttons) {

			if (radiobutton.getAttribute("id").equals(cars)) {
				radiobutton.click();
			}
		}

		Thread.sleep(3000);

		driver.close();
	}

	public static void checkBoxSelect(String checkcars) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://courses.letskodeit.com/practice");

		List<WebElement> checkboxs = driver.findElements(By.xpath("//div[@id='checkbox-example-div']//input"));

		for (WebElement checkbox : checkboxs) {

			if (checkbox.getAttribute("value").equals(checkcars)) {
				checkbox.click();
			}
		}

		Thread.sleep(3000);

		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		LetCodeItDemo3 demo3 = new LetCodeItDemo3();

		demo3.radioSelect("bmwradio");

		checkBoxSelect("bmw");
	}

}

package com.automationframework.dropdownsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeTest1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies(); // This command will delete catche memory[unused memory]

		driver.get("https://courses.letskodeit.com/practice");

		WebElement cars = driver.findElement(By.id("carselect"));

		Select carsdata = new Select(cars);

		List<WebElement> carslist = carsdata.getOptions();

		// for(datatype ref1:ref){ here we print data}

		System.out.println("List of cars available");

		for (WebElement car : carslist) {

			System.out.println(car.getText());

			if (car.getText().equals("Honda")) {
				car.click();
				break;
			}
		}
		System.out.println(carsdata.getFirstSelectedOption().getText());
		
		Thread.sleep(3000);
		
		driver.close();
	}
}

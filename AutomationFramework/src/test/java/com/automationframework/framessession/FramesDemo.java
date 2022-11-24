package com.automationframework.framessession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		WebElement textbox=driver.findElement(By.xpath("//input[@class='frmTextBox']"));
		
		Actions action= new Actions(driver);
		action.moveToElement(textbox).perform();
		
		textbox.sendKeys("ClourNaradha");
		
		Thread.sleep(3000);

		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frm3']"));
		
		action.moveToElement(frame3).perform();

		driver.switchTo().frame(frame3);
		
		WebElement frame3_txtbox = driver.findElement(By.xpath("//input[@class='frmTextBox']"));
		
		frame3_txtbox.sendKeys("Testing");
		
		WebElement frame1_inframe3 =driver.findElement(By.xpath("//iframe[@id='frm1']"));
		
		driver.switchTo().frame(frame1_inframe3);
		
		WebElement menu_optins=driver.findElement(By.xpath("//select[@id='selectnav1']"));
		
		//action.moveToElement(menu_optins).perform();
		
		Select menu= new Select(menu_optins);
		
		menu.selectByVisibleText("Tutorials");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		//action.moveToElement(frame3_txtbox).perform();
		
		frame3_txtbox.clear();
		
		frame3_txtbox.sendKeys("Testing Training");
		
		driver.switchTo().defaultContent();
		
		textbox.clear();
		
		//action.moveToElement(textbox).perform();
		
		textbox.sendKeys("Cloud Naradha Testing");
		
	

	}

}

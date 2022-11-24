package com.automationframework.jsconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterTextTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://courses.letskodeit.com/practice");
		
		
		WebElement text_box=driver.findElement(By.cssSelector("div#alert-example-div>fieldset>input#name"));
		
		  JavascriptExecutor js= ((JavascriptExecutor)driver);
		  
		  js.executeScript("arguments[0].value='Cloudnaradha';", text_box);
		  
		  Thread.sleep(3000);
		  
		  WebElement button_houver=driver.findElement(By.cssSelector("button[id*=hover]"));
		  
		  js.executeScript("arguments[0].scrollIntoView();", button_houver);
		  
		  Thread.sleep(3000);
		  
		  WebElement top_button=driver.findElement(By.xpath("//a[text()='Top']"));
		  
		  js.executeScript("arguments[0].click();", top_button);
	}

}

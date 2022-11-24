package com.automationframework.dropdownsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeTest5 {
	
	public static void dropdownSelect(int selectbyindex, String selectbyvalue) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement heroslist=driver.findElement(By.xpath("//select[@id='fruits']"));
		
		Select heros= new Select(heroslist);
		
		  if(heros.isMultiple()) { // if it is true then it conclude its multi-selction dropdown
			 heros.selectByIndex(selectbyindex);
			 heros.selectByValue(selectbyvalue);
			  
			 List<WebElement> heroscount =heros.getAllSelectedOptions();
			 
			 for(WebElement hero:heroscount) {
				 System.out.println(hero.getText());
			 }
			 
		  }
		  else {
			  heros.selectByIndex(selectbyindex);
			  System.out.println(heros.getFirstSelectedOption().getText());
		  }
	}
	
	public static void main(String[] args) {
		dropdownSelect(3, "aq");
		
	}

}

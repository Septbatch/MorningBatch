package com.automationframework.dropdownsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookSignUpTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805640%7Cb%7Cfacebook%20new%20account%20create%7C&placement=&creative=550525805640&keyword=facebook%20new%20account%20create&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-21496185646%26loc_physical_ms%3D9062135%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwhsmaBhCvARIsAIbEbH5Tzcas4cCeYosnyl-3Ti-zL8QzrrN942JTs6w_911E9fSR8SS_L7oaAmNIEALw_wcB");

		driver.findElement(By.name("firstname")).sendKeys("Cloud");

		driver.findElement(By.name("lastname")).sendKeys("Naradha");

		driver.findElement(By.name("reg_email__")).sendKeys("7908768696");

		driver.findElement(By.id("password_step_input")).sendKeys("G@testing2022");

		WebElement birthdate = driver.findElement(By.name("birthday_day"));

		Select birthday = new Select(birthdate);

		birthday.selectByIndex(20);

		System.out.println("Selected Date is ::" + birthday.getFirstSelectedOption().getText());

		WebElement month_type = driver.findElement(By.id("month"));

		Select month = new Select(month_type);

		month.selectByValue("11");

		WebElement monthselected = month.getFirstSelectedOption();
		String monthselect = monthselected.getText();
		System.out.println("Month selected is ::" + monthselect);

		WebElement yeartype = driver.findElement(By.name("birthday_year"));

		Select year = new Select(yeartype);

		year.selectByVisibleText("2020");

		System.out.println("Year selected is ::" + year.getFirstSelectedOption().getText());

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		
		
		System.out.println("Title of the page is ::"+driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.close();
	}

}

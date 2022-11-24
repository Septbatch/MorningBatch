package com.automationframework.testngsession;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmLoginTest {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}

	@BeforeClass
	public void launchUrl() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@BeforeMethod
	public void loginOrangeHrm() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.cssSelector("button.oxd-button")).click();

	}

	@Test(priority = 1)
	public void assignLeave() throws InterruptedException {
		WebElement assign_leave_option = driver.findElement(By.xpath("//button[@title='Assign Leave']"));

		Actions action = new Actions(driver);
		action.moveToElement(assign_leave_option).perform();

		assign_leave_option.click();

		Thread.sleep(2000);
		String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/leave/assign";
		String actual_url = driver.getCurrentUrl();

		Assert.assertEquals(expected_url, actual_url);
	}

	@Test(priority = 2, enabled = true)
	public void adminNavigate() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();

		WebElement page_header = driver.findElement(By.xpath("//h6[1]"));

		String act_title = page_header.getText();

		String exp_title = "Admin";

		Assert.assertEquals(act_title, exp_title);
	}

	@Test(priority = 3)
	public void myInformation() {
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		String emp_name = driver.findElement(By.cssSelector("div[class$='employee-name']>h6")).getText();
		System.out.println("Login emp name is ::" + emp_name);
	}

	@AfterMethod
	public void captureFailedCase(ITestResult result) throws IOException {

		if (ITestResult.FAILURE == result.getStatus()) {
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File desti = new File(
					"C:\\Users\\gurum\\Desktop\\Cloud Sep Batch\\TestingTrainingProjects\\AutomationFramework\\CapturePhoto\\failed.jpg");
			FileUtils.copyFile(file, desti);

		}

	}

	@AfterMethod
	public void logOut() {
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

	@AfterTest
	public void reportGenearte() {
		System.out.println("Report Genenrated");
	}

}

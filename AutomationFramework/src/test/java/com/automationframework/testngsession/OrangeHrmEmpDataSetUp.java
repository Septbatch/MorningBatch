package com.automationframework.testngsession;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmEmpDataSetUp {
	 Properties pr;
	 
	 WebDriver driver;
	 
	 @DataProvider(name = "empdata")
	 public Object[][] readempData() {
		 Object [][] empdata= new Object[2][4];
		 
		 empdata[0][0]= "Ram";
		 empdata[0][1]= "Sitha";
		 empdata[0][2]= "Ramanayam";
		 empdata[0][3]= "20455";
		 
		 empdata[1][0]= "Krishna";
		 empdata[1][1]= "Sathya";
		 empdata[1][2]= "Gokulam";
		 empdata[1][3]= "20466";
		 
		 return empdata;
		 
		 
	 }

	@BeforeSuite
	public void properitesReader() throws IOException {
		String projectLocation = System.getProperty("user.dir"); // This line will get project location.
		String filelocation = projectLocation + "\\config.properties";
		File fi = new File(filelocation);
		BufferedReader reader = new BufferedReader(new FileReader(fi));

		pr = new Properties();
		pr.load(reader);
	}

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
		String applicaitonurl = pr.getProperty("url");
		driver.get(applicaitonurl);
	}

	@BeforeMethod
	public void loginOrangeHrm() throws InterruptedException {
		String username = pr.getProperty("username");
		String password = pr.getProperty("password");

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

		driver.findElement(By.cssSelector("button.oxd-button")).click();

	}
	
	@Test(dataProvider = "empdata" )
	public void addEmpdata(String fname, String mname, String lname, String empid) throws InterruptedException {
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//a[.='Add Employee']")).click();
		
		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("middleName")).sendKeys(mname);
		driver.findElement(By.name("lastName")).sendKeys(lname);
		driver.findElement(By.xpath("//label[text()='Employee Id']/parent::div/..//input")).sendKeys(empid);
		
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}
	
	
	@AfterMethod
	public void logOut() {
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}

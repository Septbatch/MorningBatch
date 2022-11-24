package com.automationframework.testngsession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGMethods {

	@Test(priority = 1)
	public void launchbrowser() {
		System.out.println("Browser Launched");
	}

	@Test(priority = 2)
	public void launchURL() {
		System.out.println("URL Launched");
	}

	@Test(priority = 3)
	public void login() {
		System.out.println("Login into applicaiton");

		String exptitle = "Home";
		String acttitle = "Home1";

		Assert.assertEquals(exptitle, acttitle);

	}

	@Test(priority = 4, enabled = false)
	public void addUser() {
		System.out.println("User succesfully added");
	} // If we pass enabled=false then that test-case won't get execute

	@Test(priority = 5)
	public void logOut() {
		System.out.println("LogOut successfully");
	}

	@Test(priority = 6)
	public void closeBrowser() {
		System.out.println("Close browser");
	}
}

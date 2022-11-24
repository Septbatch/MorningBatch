package com.automationframework.testngsession;

public class NormalMethods {

	
	public void launchbrowser() {
		System.out.println("Browser Launched");
	}
	
	public void launchURL() {
		System.out.println("URL Launched");
	}
	
	public void login() {
		System.out.println("Login into applicaiton");
	}
	
	public void addUser() {
		System.out.println("User succesfully added");
	}
	public void logOut() {
		System.out.println("LogOut successfully");
	}
	
	public void closeBrowser() {
		System.out.println("Close browser");
	}
	
	public static void main(String[] args) {
		NormalMethods apptest= new NormalMethods();
		
		apptest.launchbrowser();
		
		apptest.launchURL();
		
		apptest.login();
		
		apptest.addUser();
		
		apptest.logOut();
		
		apptest.closeBrowser();
		
		
	}
}

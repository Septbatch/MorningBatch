package com.automationframework.javasession;

public class MethodsDemo3 {

	public void addition() {
		int a = 12232;
		int b = 10456;

		int c = a + b;

		System.out.println("Additon of two numbers is ::" + c);
	}

	public static void subtraction() {

		int a = 24500;
		int b = 8600;

		int c = a - b;
		System.out.println("Subtraction of two numberes ::" + c);
	}

	public void addition(int a, int b) { // Method parameter concept
		int c=a+b;
		System.out.println("Addition value is "+c);
		
	}
	
	
	public void subtraction(int a, int b) {
		int c= a-b;
		System.out.println("Subtraction value is "+c);
	
	}

	

	public static void main(String[] args) {
		MethodsDemo3 demo3 = new MethodsDemo3();
		
		demo3.addition(129405, 33840);
		
		demo3.subtraction(30000, 9000);
		

	}

}

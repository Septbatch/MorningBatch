package com.automationframework.javasession;

public class MethodDemo2 {

	String name = "Cloud naradha"; // instance variable  non static

	static String location = "Hyderabad"; // static variable

	public void test() {

		String name1 = "Training"; // Local variable
		System.out.println(name);
		System.out.println(name1);
	} 

	public void test2() {
		System.out.println(name);

	}
	
	public static void test3() {
		System.out.println(location);
	}
	
	public static void main(String[] args) {
		
		MethodDemo2 demo2= new MethodDemo2();
		
		System.out.println(demo2.name); // non-static we need to create object
		
		System.out.println(location);; // static we can call directly
		
		demo2.test();
		
		demo2.test2();
		
		test3();
	}

}

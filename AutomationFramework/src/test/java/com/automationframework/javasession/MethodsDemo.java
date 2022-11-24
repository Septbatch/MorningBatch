package com.automationframework.javasession;

public class MethodsDemo {
	  
	int a=10; // instance varibale
	
	static int b=20; // static variable
	 
	public void addition() {
		 int c=30;
		System.out.println("addition done succesfully");
		System.out.println("Local variable value is "+c);
	} // Instance method
	
	public static void subtraction() {
		System.out.println("Subtraction executed");
	} // static method
	
	public static void main(String[] args) {
		
		//How to call static method, it will call directly with out object creation
		
		subtraction(); //Subtraction executed
		
		//addition(); //This is instance method memory not allocated can you please allocate memeroy
		
		// By object createion we can allocate memory
		
		//classname ref= new classname
		
		MethodsDemo  demo= new MethodsDemo();
		
		demo.addition();
		
		System.out.println("Instance varibale value is ::"+demo.a);
		
		System.out.println("Static variable value is ::"+b);
		
	
	}

}

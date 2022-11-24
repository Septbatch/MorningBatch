package com.automationframework.javaconcepts;

import java.util.ArrayList;
import java.util.List;

public class MyTesting {
	
	public static void main(String[] args) {
		
		//String [] data= {"Mohan", "ram", "Rahim", 123};
		
		//becoz array only accepts homogenius type of objects.
		
		List data= new ArrayList();
		
		data.add("Mohan");
		data.add("ram");
		data.add("Rahim");
		data.add(123);
		
		System.out.println(data); //arraylist will accept both homogenius and heterogenius data.
	}

}

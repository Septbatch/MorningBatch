package com.automationframework.javaconcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MyCode {
	
	public static void main(String[] args) {
		
		List students= new ArrayList();
		
		students.add("Mohan ");
		
		students.add("Ram");
		students.add("Rahim");
		students.add("Ram");//This method will allows duplicates in collections.
		
		System.out.println(students); // Mohan Ram. Rahim
		
		Set stddata= new HashSet();
		
		stddata.add("Mohan");
		stddata.add("Ram");
		stddata.add("Rahim");
		stddata.add("Ram");
		stddata.add("Sham");
		
		System.out.println(stddata);
		
		
		LinkedHashSet setdata= new LinkedHashSet();
		
		setdata.add("Mohan");
		setdata.add("Rahim");
		setdata.add("Robert");
		setdata.add("Ram");
		setdata.add("Rahim");
		
		System.out.println(setdata);
		
		
		
	}

}

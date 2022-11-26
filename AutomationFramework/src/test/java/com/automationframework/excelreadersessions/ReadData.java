package com.automationframework.excelreadersessions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fi= new FileInputStream("C:\\Users\\gurum\\Desktop\\Cloud Sep Batch\\Softwars\\EmpData.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		
		XSSFSheet sh= wb.getSheet("EmpNameData");
		
		int row=sh.getLastRowNum();
		
		String emprollnum =sh.getRow(1).getCell(0).getStringCellValue();
		
		
		String empname =sh.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(emprollnum+" "+empname);
		
		
		String emprollnum2 =sh.getRow(2).getCell(0).getStringCellValue();
		
		String empname2 =sh.getRow(2).getCell(1).getStringCellValue();
		
		System.out.println(emprollnum2+" "+empname2);
	}

}

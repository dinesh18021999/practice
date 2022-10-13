
package com.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {
	
	public static void mainnn(int cell,String olddata ,String newdata) throws InterruptedException, IOException {
		 
		File file =new File("C:\\Users\\91960\\eclipse-workspace\\FrameWorkClass1\\exceltask\\excel123.xlsx");
		FileInputStream stream =new FileInputStream(file);
		Workbook book =new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("1234");
		Row row2 = sheet.getRow(8);
		Cell cell2 = row2.getCell(cell);
		String stringCellValue = cell2.getStringCellValue();
		System.out.println(stringCellValue);
		if (stringCellValue.equals(olddata)) {
			cell2.setCellValue(newdata);
			
		}
		FileOutputStream out=new FileOutputStream(file);
		book.write(out);
		
		
		
}
public static void main(String[] args) throws InterruptedException, IOException {
	mainnn( 2, "dinesh", "arch");
}
}

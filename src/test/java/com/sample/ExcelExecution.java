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

public class ExcelExecution {
	
	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\91960\\eclipse-workspace\\FrameWorkClass1\\exceltask\\excel123.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("abc");
		Row row = sheet.createRow(5);
//		Cell cell = row.getCell(1);
//		System.out.println(cell);
		Cell createCell = row.createCell(1);
		createCell.setCellValue("string");
		FileOutputStream stream1=new FileOutputStream(file);
	    book.write(stream1);
		
		
	}

}

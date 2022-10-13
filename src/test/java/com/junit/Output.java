package com.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Output {
public  void main(String sheetname,int rownum,int cellnum,String data) throws IOException {
	
	
	File file=new File("C:\\Users\\91960\\eclipse-workspace\\FrameWorkClass1\\exceltask\\excel123.xlsx");
			FileInputStream inputstream= new FileInputStream(file);
	Workbook book =new XSSFWorkbook(inputstream);
	org.apache.poi.ss.usermodel.Sheet sheet = book.getSheet(sheetname);
	Row row = sheet.getRow(rownum);
	org.apache.poi.ss.usermodel.Cell createCell = row.createCell(cellnum);
	createCell.setCellValue(data);
	FileOutputStream stream=new FileOutputStream(file);
	book.write(stream); 
	
	}
public static void main(String[] args) throws IOException {
	Output o=new Output();
	o.main("1234", 8, 6, "dinesh");
	
}
}
	
	
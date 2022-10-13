package com.sample;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.WorkbookDocumentImpl;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Excelltaskday1 {
	
	

	public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\91960\\eclipse-workspace\\FrameWorkClass1\\exceltask\\excel123.xlsx");
	FileInputStream stream =new FileInputStream(file);
	Workbook book=new XSSFWorkbook(stream);
	Sheet sheet = book.getSheet("1234");
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(1);
	System.out.println(cell);

		}
		}
	
		
	



package com.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Exceltest {
	public static void main(String[] args) throws IOException  {
		
	File file=new File("C:\\Users\\91960\\eclipse-workspace\\FrameWorkClass1\\exceltask\\excel123.xlsx");
	FileInputStream stream=new FileInputStream(file);
	
	Workbook book =new XSSFWorkbook(stream);
	
	//Sheet sheet = book.getSheet("dinesh");
	
//	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//		Row row = sheet.getRow(i);
//		
//		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//			Cell cell = row.getCell(j);
//			
//			CellType cellType = cell.getCellType();
//			
//		switch (cellType) {
//		case STRING:
//			String cellValue = cell.getStringCellValue();
//			System.out.println(cellValue);
//		   break;
//		  
//		case NUMERIC:
//			
//			if (DateUtil.isCellDateFormatted(cell) )
//			{
//				Date dateCellValue = cell.getDateCellValue();
//				SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
//				String format2 = f.format(dateCellValue);
//				System.out.println(format2);
//			}else {
//				
//			double value = cell.getNumericCellValue();
//			BigDecimal d= BigDecimal.valueOf(value);
//			String string = d.toString();
//			System.out.println(string);
//		
//			
//			break;
//
//			}
//		default:
//			break;
//		}
	
	
//	Row row = sheet.getRow(5);
//	
//	Cell createCell = row.createCell(14);
//	
//	createCell.setCellValue("priyanka");
//	
//	
//	FileOutputStream stream1=new FileOutputStream(file);
//	

	
	

			
		}
		
	
	
		
	}



package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Read {
	
	public static void readAllData() throws IOException {
		
		File f = new File("E:\\PROGRAMMING PRACTICE\\MAVEN\\maven-archetype-quickstart\\LEADS.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType type = cell.getCellType();
				
				if (type.equals(CellType.STRING)) {
					
					String Value = cell.getStringCellValue();
					
					System.out.println(Value);
				}
				
				else if(type.equals(CellType.NUMERIC)) {
					
					double numericCellValue = cell.getNumericCellValue();
					
					int nc = (int) numericCellValue;
					
					System.out.println(nc);
					
				}
				
			}
			
					
		}
					
	}
	
	public static void main(String[] args) throws IOException {
		
		readAllData();
	}
	

}

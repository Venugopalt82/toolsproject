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

public class DataDriven_ReadSpecificData {

	public static void main(String[] args) throws IOException {
		
		File f = new File("E:\\PROGRAMMING PRACTICE\\MAVEN\\maven-archetype-quickstart\\LEADS.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet fsheet = wb.getSheetAt(0);
		
		Row frow = fsheet.getRow(4);
		
		Cell fcol = frow.getCell(0);
		
		CellType cellType = fcol.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			
			String value = fcol.getStringCellValue();
			
			System.out.println(value);
		}
		
		else if (cellType.equals(cellType.NUMERIC)) {
			
			double value = fcol.getNumericCellValue();
			
			int nvalue = (int) value;
			
			System.out.println(nvalue);
			
		}
	

	}

}

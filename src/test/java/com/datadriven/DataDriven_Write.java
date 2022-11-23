package com.datadriven;

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

public class DataDriven_Write {

	public static void main(String[] args) throws IOException {
		
		File f =  new File("E:\\PROGRAMMING PRACTICE\\MAVEN\\maven-archetype-quickstart\\LEADS.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet name = wb.createSheet("Name");
		
		Row frow = name.createRow(0);
		
		Cell fcell = frow.createCell(0);
		
		fcell.setCellValue("Venugopal");
		
		wb.getSheet("Name").getRow(0).createCell(1).setCellValue(143);
		
		wb.getSheet("Name").createRow(1).createCell(0).setCellValue("Vasanth");
		
		wb.getSheet("Name").getRow(1).createCell(1).setCellValue(007);
		
		wb.getSheet("Name").createRow(2).createCell(0).setCellValue("Rocky");
		
		wb.getSheet("Name").getRow(2).createCell(1).setCellValue(001);
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
	}

}

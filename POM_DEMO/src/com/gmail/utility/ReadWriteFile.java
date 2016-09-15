package com.gmail.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWriteFile {
	
	
	public String getData(String Path, String SheetName, int rowNum, int CellNum)throws Exception {
		FileInputStream fis = new FileInputStream(Path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(SheetName);
		String data = sheet.getRow(rowNum).getCell(CellNum).getStringCellValue();
		return data;
	}
	
	public int getLastRow(String Path,String SheetName) throws Exception{
		FileInputStream fis = new FileInputStream(Path);
		Workbook wb = WorkbookFactory.create(fis);
		int lastRow = wb.getSheet(SheetName).getLastRowNum();
		return lastRow;
	}
	public void writeData(String Path, String SheetName, int rowNum, int CellNum,String status) throws Exception{
		FileInputStream fis = new FileInputStream(Path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(SheetName);
		sheet.getRow(rowNum).createCell(CellNum).setCellValue(status);
		FileOutputStream fos = new FileOutputStream(Path);
		wb.write(fos);
	}
}

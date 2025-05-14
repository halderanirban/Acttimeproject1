package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileLibrary {

	public String getpropertydata(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commonData.property");

		Properties p=new Properties();

		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	
	//Excel file
	public String getExceldata(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Customerdata.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	return value;
	}
	
	
	
	//set data from property file
	public void setExceldata(String sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Customerdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		
		FileOutputStream fos=new FileOutputStream("./data/Customerdata.xlsx");
		wb.write(fos);
	}
}


	
		
		

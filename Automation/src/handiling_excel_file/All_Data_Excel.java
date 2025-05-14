package handiling_excel_file;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class All_Data_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis=new FileInputStream("./data/Customerdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		/**
		 * This process gave it us (All Row & Cell DATA) 
		 */
		int count = wb.getSheet("MultipleData").getLastRowNum();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			int count1 = wb.getSheet("MultipleData").getRow(0).getLastCellNum();
			for(int j=0;j<count1;j++)
			{
				String text = wb.getSheet("MultipleData").getRow(i).getCell(j).getStringCellValue();
				System.out.print(text+"  ");
			}
			System.out.println();
		}
	/*	int count = wb.getSheet("InvalidLogin").getLastRowNum();
		
		for(int i=0;i<count;i++)
		{
			wb.getSheet("InvalidLogin").getrow*/
		}

	}



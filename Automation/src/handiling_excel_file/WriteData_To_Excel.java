package handiling_excel_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData_To_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./data/Customerdata.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Create Customer").getRow(1).getCell(4).setCellValue("Anirban");
		
		FileOutputStream fos= new FileOutputStream("./data/Customerdata.xlsx");
		wb.write(fos);
		
		
		
		


	}

}


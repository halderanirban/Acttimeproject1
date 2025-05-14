 package handiling_excel_file;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multipal_data_read_excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("./data/Customerdata.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	
	int count = wb.getSheet("MultipleData").getLastRowNum();
	//System.out.println(count);
	/**
	 * This is only applicable for(if you want [All row] BUT any [Single value])
	 */
	for(int i=0;i<count;i++)
	{
		String un = wb.getSheet("MultipleData").getRow(i).getCell(0).getStringCellValue();
		String pw = wb.getSheet("MultipleData").getRow(i).getCell(1).getStringCellValue();
		System.out.println(un+" "+pw);
		
	}
	 

}
}

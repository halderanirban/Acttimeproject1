package handiling_excel_file;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.FileLibrary;

public class Actitime_login extends FileLibrary  {

	public static void main(String[] args) throws InterruptedException, IOException{
		FileLibrary f=new FileLibrary();


		String url = f.getpropertydata("url");
	
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		FileInputStream fis=new FileInputStream("./data/Customerdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		int count = wb.getSheet("InvalidLogin").getLastRowNum();
		//System.out.println(count);
		/**
		 * This is only applicable for(if you want [All row] BUT any [Single value])
		 */
		for(int i=1;i<=count;i++)
		{
			String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
			String pw = wb.getSheet("InvalidLogin").getRow(i).getCell(2).getStringCellValue();
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			
			String actualtitle = driver.getTitle();
			System.out.println(actualtitle);
		
	

		

		}
		}
	}


package file_upload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nakri_Demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/Nukri.html");
		
		File f=new File("./data/Resume.docx");
		String absolute = f.getAbsolutePath();
		Thread.sleep(500);
		driver.findElement(By.id("cv")).sendKeys(absolute);

	}

}

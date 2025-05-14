package takeScreenshort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShort_Demo {
	@Test
	public void takescreenshort() throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		//TYPCASTING
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("./screenShort/ss.png");
		
		
		FileUtils.copyFile(src, dest);
				
	}
	


}

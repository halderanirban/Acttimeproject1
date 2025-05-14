package assertion;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_Assertioon {
	@Test
	public void verifyTest() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		String etitle = "soogle";
		
		String atitle = driver.getCurrentUrl();
		
		if(atitle.equalsIgnoreCase(etitle))
		{
			Reporter.log("Test Pass title is match",true);
		}
		else
		{
			Reporter.log("Test fail title is match",true);
			
		}
	
		
	}

}

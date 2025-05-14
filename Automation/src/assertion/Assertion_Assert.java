package assertion;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion_Assert {
	@Test
	public void verifyTest() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		String etitle = "soogle";
		
		String atitle = driver.getCurrentUrl();
		/**
		 * DRAW BACK OF ASSERT(herd assert):-
		 * 
		 * Error occurs in line number 24 
		 * That's why you not execute remaining part (driver.close())
		 * To overcome these drawback we go for (soft Assert) 
		 */
		Assert.assertEquals(atitle, etitle);
		Reporter.log("test pass",true);
		driver.close();
				
		
	}


}

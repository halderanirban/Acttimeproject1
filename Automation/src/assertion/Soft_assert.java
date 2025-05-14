package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
	@Test
	public void verifyTest() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		String atitle = driver.getCurrentUrl();
		
		
		String etitle = "soogle";
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(atitle, etitle);
		driver.close();
		s.assertAll();   //Mandatory 
		

	}
}
 
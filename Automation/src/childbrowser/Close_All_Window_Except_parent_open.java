package childbrowser;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_All_Window_Except_parent_open {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");

		Set<String> alladd = driver.getWindowHandles();
		String pwh = driver.getWindowHandle();
		for(String wh:alladd)
		{
			driver.switchTo().window(wh);
			
			if(!pwh.equals(wh))
			{
				driver.close();
			}
			/*else
			{
				driver.close();
			}*/
		
		}
	}
}
package childbrowser;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWindow_WithoutQuit {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");

		Set<String> alladd = driver.getWindowHandles();


		for(String wh:alladd)
		{
			driver.switchTo().window(wh);
			System.out.println(wh);

			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}
		
	}
}

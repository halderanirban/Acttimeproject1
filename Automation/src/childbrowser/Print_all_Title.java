package childbrowser;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_all_Title {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");

		Set<String> alladd = driver.getWindowHandles();
		for(String wh:alladd)
		{
			//driver.switchTo().window(wh);
			System.out.println(wh);

			String alltitle = driver.getTitle();
			System.out.println(alltitle);
			Thread.sleep(500);
			//driver.quit();
			//driver.close();
		}
		//driver.quit();
		driver.close();


	}

}

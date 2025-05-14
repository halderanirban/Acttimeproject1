package childbrowser;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_All_Window_Using_Title {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");

		Set<String> alladd = driver.getWindowHandles();
		
		String title = driver.getTitle();//get only parent window title because control present in 1'st only
	
		System.out.println(title);
		for(String wh:alladd)
		{
			driver.switchTo().window(wh);

			String alltitle = driver.getTitle();
			System.out.println(alltitle);
			
			if(!title.equals(alltitle))
			{
				driver.close();
			}
		/*	else
			{
				driver.close();
			}*/
		}
	}

}

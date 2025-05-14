package childbrowser;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed_Alltitle_withoutQuit_close_all_window {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		driver.findElement(By.xpath("//span[.='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[.='Continue with Apple']")).click();
		Set<String> alladd = driver.getWindowHandles();
		for(String wh:alladd)
		{
			//String all = driver.switchTo().window(wh).getTitle();
			//System.out.println(all);
			
			driver.switchTo().window(wh);
	
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
			
		}

	}

}

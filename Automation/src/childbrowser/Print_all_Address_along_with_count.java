package childbrowser;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_all_Address_along_with_count {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
		
		Set<String> allpwh = driver.getWindowHandles();
		
		int count = allpwh.size();
		
		for(String wh:allpwh)
		{
			driver.switchTo().window(wh);
			System.out.println(wh);//------>Get all window address
			Thread.sleep(500);
			driver.close();
			
		}
		System.out.println("window present:"+count);

	}

}

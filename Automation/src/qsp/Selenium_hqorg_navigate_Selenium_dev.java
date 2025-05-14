package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_hqorg_navigate_Selenium_dev {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org/");
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/"))
		{
			System.out.println("URL navigation pass");
		}
		else
		{
			System.out.println("URL navigation fail");
		}
		driver.quit();
		}

}

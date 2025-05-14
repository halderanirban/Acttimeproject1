package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Google_com_navigate {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://gmail.com/");
	String url=driver.getCurrentUrl();
	if(url.equals("http://google.com/"))
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


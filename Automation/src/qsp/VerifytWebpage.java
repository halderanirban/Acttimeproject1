package qsp;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifytWebpage {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String actualtitle = driver.getTitle();
		
		String expectedtitle="GOOGLE";
		
		String acturalurl = driver.getCurrentUrl();
		
		String expectedurl="google.com";
		
		if(actualtitle.equalsIgnoreCase(expectedtitle)&&acturalurl.contains(expectedurl))
		{
			System.out.println("pass bouth match");
		}
		else
		{
			System.out.println("Fail bouth not match");
		}
	}
}

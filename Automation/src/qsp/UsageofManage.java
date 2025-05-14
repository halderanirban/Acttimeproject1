package qsp;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofManage {
	private static final Point point = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String pgsource = driver.getPageSource();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().setSize(new Dimension(252,333)); 
		
		driver.manage().window().setPosition(new Point(360,255));
		
		driver.manage().window().minimize();
		
		driver.quit();
		
		}

}

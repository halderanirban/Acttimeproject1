package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Demo {

	public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	System.out.println(driver.getTitle());
	driver.quit();
	
	}
	

}

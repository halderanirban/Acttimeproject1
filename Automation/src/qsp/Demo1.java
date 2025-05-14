package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		//FirefoxDriver driver1 = new FirefoxDriver();
		//driver.get("https://www.facebook.com");
	//EdgeDriver driver3 = new EdgeDriver();
			//driver3.get("https://www.facebook.com");
		
	}

}

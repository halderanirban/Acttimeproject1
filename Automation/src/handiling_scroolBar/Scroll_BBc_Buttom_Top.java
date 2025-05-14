package handiling_scroolBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_BBc_Buttom_Top {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor)driver;

		// Scroll To Bottom(last)
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		// Scroll To Top
		j.executeScript("window.scrollBy(0,0)");

	}

}

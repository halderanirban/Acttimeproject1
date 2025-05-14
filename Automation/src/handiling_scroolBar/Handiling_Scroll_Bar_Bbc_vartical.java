package handiling_scroolBar;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handiling_Scroll_Bar_Bbc_vartical {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bbc.com/");

		JavascriptExecutor j=(JavascriptExecutor)driver;
        //y axes(vartical)
		//j.executeScript("window.scrollTo(0,3000)");
		
		j.executeScript("window.scrollTo(3000,0)");



	}


}

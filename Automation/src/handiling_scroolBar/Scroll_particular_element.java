package handiling_scroolBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_particular_element {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int y = driver.findElement(By.xpath("//h2[text()='Watch']")).getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("Window.ScrollTO(0,"+y+")");
	}

}

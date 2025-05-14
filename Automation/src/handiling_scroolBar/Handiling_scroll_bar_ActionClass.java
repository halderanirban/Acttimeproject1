package handiling_scroolBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handiling_scroll_bar_ActionClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("//h2[.='Must watch']"));
		   
		Actions a=new Actions(driver);
		
		a.scrollByAmount(0,2537).perform();
		
		//a.scrollToElement(element).perform()
		
		
		
	}

}

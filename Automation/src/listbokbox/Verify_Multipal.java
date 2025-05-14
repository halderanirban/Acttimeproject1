package listbokbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Multipal {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/MTRbr.html");
		WebElement MRTlistbox = driver.findElement(By.id("mrt"));
		Thread.sleep(500);
		Select s=new Select(MRTlistbox);
		Thread.sleep(500);
		boolean mrt = s.isMultiple();
		Thread.sleep(500);
		System.out.println(mrt);
		driver.quit();
	}

}

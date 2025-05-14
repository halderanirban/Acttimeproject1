package handiling_Frams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handiling_Frams {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/iframe.html");

//we are using indexing;(int)
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("jsp");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("qsp");
		
		Thread.sleep(500);
		driver.quit();
	}

}

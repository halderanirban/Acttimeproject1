package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		Thread.sleep(200);
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/Demo.html");
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.tagName("a"));
		e.click();
		//driver.findElement(By.tagName("a")).clear();
		Thread.sleep(3000);
		driver.quit();

	}

}

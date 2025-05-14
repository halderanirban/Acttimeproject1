package handiling_Frams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handiling_fream_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/iframe.html");
		driver.findElement(By.id("t1")).sendKeys("a");

		//we are useing (String) ANY ATTRIBUTE VALUE OF IFREAM
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c");
		WebElement f2 = driver.findElement(By.id("f1"));
		Thread.sleep(500);
		//BY USING WEBELEMENT
		driver.switchTo().frame(f2);
		driver.findElement(By.id("t2")).sendKeys("d");




	}

}

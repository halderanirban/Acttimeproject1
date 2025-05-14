package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_locator_2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/Demo.html");
		driver.findElement(By.tagName("a"));
		driver.navigate().back();
		driver.findElement(By.id("d1"));
		driver.navigate().back();
		driver.findElement(By.name("n1"));
		driver.navigate().back();
		driver.findElement(By.className("c1"));
		
		
		

	}

}

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Email_Hight_Width {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//input[@type='text']"));
		WebElement email = driver.findElement(By.cssSelector("#email"));
		int heigh = email.getSize().getHeight();
		int width = email.getSize().getWidth();
		System.out.println(heigh);
		System.out.println(width);
		driver.quit();
	
	}

}

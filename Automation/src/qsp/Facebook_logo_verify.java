package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_logo_verify {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean logo = driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]")).isDisplayed();
		if(logo==true)
		{
			System.out.println("Logo button is displayed and pass");
		}
		else
		{
			System.out.println("Logo button not present and fail");
		}
		driver.quit();
		

	}

}

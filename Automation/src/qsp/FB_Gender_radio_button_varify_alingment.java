package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Gender_radio_button_varify_alingment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//driver.findElement(By.linkText("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		int y1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
		if(y1==y2&&y1==y3)
		{
			System.out.println("RADIO BUTTON PROPERLY ALINGMENT");	
		}
		else
		{
			System.out.println("RADIO BUTTON  NOT PROPERLY ALINGMENT");
		}
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		driver.quit();


	}

}

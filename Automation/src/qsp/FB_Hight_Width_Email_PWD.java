package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Hight_Width_Email_PWD {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement pass = driver.findElement(By.cssSelector("input[type='password']"));

		int e1 = email.getSize().getHeight();
		int e2 = email.getSize().getWidth();
		int p1=pass.getSize().getHeight();
		int p2=pass.getSize().getWidth();
		System.out.println(e1);
		System.out.println(p1);
		System.out.println(e2);
		System.out.println(p2);

		if(e1==p1&&p1==p2)
		{
			System.out.println("height & width same & pass");
		}
		else
		{
			System.out.println("height & width Not same ");
		}
		driver.quit();

	}

}

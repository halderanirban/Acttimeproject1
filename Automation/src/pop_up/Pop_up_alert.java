package pop_up;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up_alert {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary'][@onclick='confirmbox()']")).click();
		driver.switchTo().alert().dismiss();
		boolean display=driver.findElement(By.id("demo")).isDisplayed();
		if(display==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}
}

package disabledElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisableElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/DisableElement.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		boolean check = driver.findElement(By.id("d2")).isEnabled();


		RemoteWebDriver r=(RemoteWebDriver) driver;



		if(check==false)
		{
			r.executeScript("document.getElementById('d2').valu='manager'");
		}
		
	}

}

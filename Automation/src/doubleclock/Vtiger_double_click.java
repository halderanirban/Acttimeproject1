package doubleclock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger_double_click {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		driver.findElement(By.id("loginspan"));
		
		WebElement target = driver.findElement(By.id("loginspan"));
		Actions s=new Actions(driver);
		s.doubleClick(target).perform();
		
		String title = driver.getCurrentUrl();
		if(title.equalsIgnoreCase("https://crmaccess.vtiger.com/log-in/?mode=continue"))
		{
			System.out.println("LOGIN PAGE IS DISPLAY");
		}
		driver.quit();
	}

}

package listbokbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify {
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.linkText("Create new account")).click();
			WebElement monthlist = driver.findElement(By.id("month"));
			
			Select s=new Select(monthlist);
			s.selectByIndex(5);
			Thread.sleep(500);
			s.selectByValue("6");
			Thread.sleep(500);
			s.selectByVisibleText("Nov");
			Thread.sleep(500);
			boolean s1 = s.isMultiple();
			if(s1==true)
			{
				s.deselectByIndex(0);
				Thread.sleep(500);
				s.deselectByValue("6");
				Thread.sleep(500);
				s.deselectByVisibleText("Nov");
				Thread.sleep(500);
				
			}
			else
			{
				System.out.println("IT IS NOT A MULTISELECT LIST BOX");
			}
			driver.quit();
			
	}

}

package listbokbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Slv_all_Selected_option {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/MTRbr.html");
		WebElement slvlistbox = driver.findElement(By.id("slv"));
		
		Select s=new Select(slvlistbox);
		List<WebElement> alloption = s.getAllSelectedOptions();
		int count = alloption.size();
		for(int i=0;i<count;i++)
		{
			Thread.sleep(500);
			String text = alloption.get(i).getText();
			System.out.println(text);
		}
		driver.quit();

	}

}

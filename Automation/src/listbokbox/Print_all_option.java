package listbokbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_all_option {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/MTRbr.html");
		WebElement mrtlistbox = driver.findElement(By.id("mtr"));
		
		Select s=new Select(mrtlistbox);
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		for(int i=0;i<count;i++)
		{
			String text = alloption.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
		
		
	}

}

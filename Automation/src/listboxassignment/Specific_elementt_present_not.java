package listboxassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Specific_elementt_present_not {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/MTRbr.html");
		WebElement mrt = driver.findElement(By.id("mtr"));
		
		String expectedele="idly";
		Boolean res=false;
		
		Select s=new Select(mrt);
		List<WebElement> alloption = s.getOptions();
		
		for(WebElement ele:alloption)
		{
			String text = ele.getText();
			if(text.equalsIgnoreCase(expectedele))
			{
				res=true;
				break;
			}
		}
		if(res==true)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
		driver.quit();
	}

}

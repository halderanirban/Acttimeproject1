package listboxassignment;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Without_Duplicate {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/MTRbr.html");
		WebElement mrtlistbox = driver.findElement(By.id("mtr"));

		Select s=new Select(mrtlistbox);
		List<WebElement> alloption = s.getOptions();
		System.out.println("Before remove the duplicate");
		
		for(WebElement o: alloption)
		{
			System.out.println(o.getText());
		}
		
		TreeSet<String> option=new TreeSet<String>();
		
		System.out.println("==============================");
		System.out.println("After remove the duplicate");
		for(int i=0;i<alloption.size();i++)
		{
			option.add(alloption.get(i).getText());
			
		}
		for(String p:option)
		{
			System.out.println(p);
		}
	}
}
package listboxassignment;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ONLY_Duplicate {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/MTRbr.html");
		WebElement mrtlistlox = driver.findElement(By.id("mtr"));
		Select s=new Select(mrtlistlox);
		
		List<WebElement> alloption = s.getOptions();
		Set<String>option=new TreeSet<String>();
		
	for (WebElement string : alloption)
		{
			String ele = string.getText();
			
		for(int i=0;i<alloption.size();i++)
		{
			option.add(alloption.get(i).getText());
		}
		for(String text:option)
		{
			System.out.println(text);
		}
		
			
			
	
		if(option.add(ele))
			{
				System.out.println(ele);
			}			
		}
		
		
		
	}

}

package auttosuggation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auttosuggation_Facebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		List<WebElement> allautosuggation = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	int count= allautosuggation.size();
	System.out.println("Number of AutoSuggation is:"+count);
		
		for(int i=0;i<allautosuggation.size();i++)
		{
			String text = allautosuggation.get(i).getText();
				
			System.out.println(text);
		}
		allautosuggation.get(count-1).click();
	
		
		
		/*for(WebElement all:allautosuggation)
		{
			String text = all.getText();
			System.out.println(text);
		}*/
		
		
	}

}

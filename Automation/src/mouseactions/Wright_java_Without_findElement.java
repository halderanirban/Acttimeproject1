package mouseactions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wright_java_Without_findElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.get("https://www.google.com/");
		
		driver.switchTo().activeElement().sendKeys("java");//IMPORTANT
		
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(.,'java')]"));
		int count = autosugg.size();
		System.out.println("Count of AutoSuggation is:"+count);
		/*for(WebElement wh:autosugg)
		{
			Thread.sleep(5000);
			String text = wh.getText();
			System.out.println(text);
		}
		Thread.sleep(5000);
		String check = autosugg.get(0).getText();
		System.out.println(check);*/
		System.out.println("==========================");
		/*for(int i=0;i<count;i++)
		{

			String text2 = autosugg.get(i).getText();
			System.out.println(text2);
		}

		autosugg.get(count-1).click();*/
		//driver.quit();
	}

}

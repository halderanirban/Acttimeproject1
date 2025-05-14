package auttosuggation;

import java.io.ObjectInputStream.GetField;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbC_All_news_capture {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> allnews = driver.findElements(By.xpath("(//h2[@data-testid='ohio-title'])/../../../../../div[2]"));
	
		for(int i=0;i<allnews.size();i++)
		{
			String text1 = allnews.get(i).getText();
			System.out.println(text1);
		}
		System.out.println("==========================");
		for(WebElement news:allnews)
		{
			String text2 = news.getText();
			System.out.println(text2);
		}
		
	}
	}


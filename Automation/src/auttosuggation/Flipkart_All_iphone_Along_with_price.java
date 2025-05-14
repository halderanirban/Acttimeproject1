package auttosuggation;

import java.awt.RenderingHints.Key;
import java.security.AllPermission;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_All_iphone_Along_with_price {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14 pro max"+Keys.ENTER);
		
		List<WebElement> allmobile = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')and@class]"));
		
		List<WebElement> allmobileprice = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')and@class]/../../div[2]/div[1]/div[1]/div[1]"));
		/*for(int i=0;i<allmobile.size() &&i<allmobileprice.size();i++)
		{
			String mobile = allmobile.get(i).getText();
			String price = allmobileprice.get(i).getText();
			System.out.println(mobile+"==:>"+price);*/
		for(int i=0;i<allmobile.size();i++)
		{
		String text = allmobile.get(i).getText();
		System.out.println(text);
		}
		driver.quit();
	}
}


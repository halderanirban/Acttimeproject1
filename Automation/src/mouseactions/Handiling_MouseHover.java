package mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handiling_MouseHover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.get("https://www.vtiger.com/");
		
		WebElement target = driver.findElement(By.partialLinkText("Company")); //step=3
		Actions a=new Actions(driver);//step=1
		a.moveToElement(target).perform();//step=2
		
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String text = driver.findElement(By.xpath("//p[contains(.,'Bengaluru, India')]/../p[2]")).getText();
		System.out.println(text);
		driver.quit();
		
		

	}

}

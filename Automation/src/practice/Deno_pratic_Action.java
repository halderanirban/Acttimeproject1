package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Deno_pratic_Action {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.vtiger.com/");
	driver.manage().window().maximize();
	WebElement target = driver.findElement(By.cssSelector(a[id='navbarLandings'));
	Actions a=new Actions(driver);
	a.moveToElement(target).perform();
	driver.findElement(By.className("list-link")).click();
	}

}

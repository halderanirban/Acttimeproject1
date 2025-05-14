package mouseactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handiling_Right_click {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.get("http://localhost/login.do");

		WebElement link = driver.findElement(By.cssSelector("a[target=\"_blank\"]"));
		Actions a=new Actions(driver);
		a.contextClick(link).perform();


		Thread.sleep(500);	
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(600);
		driver.quit();

	}

}

package handiling_Frams;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Qspider_Ifream {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[.='Frames']")).click();
	driver.findElement(By.xpath("//section[.='iframes']")).click();
	driver.findElement(By.linkText("Nested iframe")).click();
	Thread.sleep(2000);
	
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	String email1 = driver.findElement(By.xpath("//p[.='Admin@gmail.com']")).getText();
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	driver.findElement(By.id("email")).sendKeys(email1);
	
	
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	String pwd = driver.findElement(By.xpath("//p[.='Admin@1234']")).getText();
	driver.switchTo().frame(0);
	driver.findElement(By.id("password")).sendKeys(pwd);
	


	
	driver.switchTo().parentFrame();
	String cpwd = driver.findElement(By.xpath("//p[.='Admin@1234']")).getText();
	driver.switchTo().frame(0);
	driver.findElement(By.id("confirm-password")).sendKeys(cpwd);
	
	
	
	driver.findElement(By.id("submitButton")).submit();
	
	
	
	

	
	
	
	}

}

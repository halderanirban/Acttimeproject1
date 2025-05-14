package anirban_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
String text = driver.findElement(By.className("//h3[text()='Open Source Billing']")).getText();
System.out.println(text);
	}

}

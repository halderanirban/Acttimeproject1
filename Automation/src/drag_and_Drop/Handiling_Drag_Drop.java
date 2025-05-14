package drag_and_Drop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handiling_Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		Thread.sleep(2000);

		WebElement target = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}

}

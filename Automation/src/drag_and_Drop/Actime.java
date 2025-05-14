package drag_and_Drop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div[@title='Learn More'])[1]")).click();
		 driver.findElement(By.xpath("//section[.='Mouse Actions']")).click();
		 driver.findElement(By.xpath("//section[.='Drag & Drop']")).click();
		 driver.findElement(By.xpath("//a[.='Drag Multiple']")).click();
		 
		WebElement src = driver.findElement(By.xpath("//div[.='Mobile Cover']"));
		src.click();
		WebElement src1 = driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		src1.click();
		WebElement target1= driver.findElement(By.id("dropZone1"));
		Actions s=new Actions(driver);
//		Thread.sleep(2000);
//		 s.dragAndDrop(src,target1).perform();
		 Thread.sleep(2000);
		 s.dragAndDrop(src1,target1).perform();
		 
		WebElement src2 = driver.findElement(By.xpath("//div[.='Laptop Cover']"));
		src2.click();
		WebElement src3 = driver.findElement(By.xpath("//div[.='Laptop Charger']"));
		src3.click();
		WebElement target2 = driver.findElement(By.id("dropZone2"));
          Actions s1=new Actions(driver);
		
		
		 s1.dragAndDrop(src2,target2).perform();
		// s1.dragAndDrop(src3,target2).perform();
		 
	
}}

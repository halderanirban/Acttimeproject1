package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Demo_print_color {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		String color = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("color");
		String front = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		String front1 = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-weight");
		String frontfam = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
		System.out.println(front);
		System.out.println(color);
		System.out.println(front1);
		System.out.println(frontfam);
		driver.quit();
	}

}

package data_Driver_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.j2objc.annotations.Property;

public class Handiling_property_file {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./data/commonData.property");
		
		Properties p=new Properties();
		
		p.load(fis);
		
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("pwd");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
		
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		
		


	}

}

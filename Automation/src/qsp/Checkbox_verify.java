package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_verify{
	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("http://localhost/login.do");
	boolean checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
	if(checkbox==true)
	{
		System.out.println("checkbox is selected");
	}
	else
	{
		System.out.println("checkbox is not selected");
	}
	driver.quit();
	}
}
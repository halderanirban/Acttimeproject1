package com.projectacttime.testscript;

import java.awt.Container;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Create_Customer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//div[(text()='Add New')]")).click();
		driver.findElement(By.xpath("//div[(text()='+ New Customer')]")).click();
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("HDFC_001");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Banking_project");
		driver.findElement(By.id("customerLightBox_customerSelectorPlaceholder")).click();
		driver.findElement(By.linkText("Our Company")).click();
		driver.findElement(By.xpath("//span[(text()='Create Customer')and@class='buttonTitle']")).click();
		Thread.sleep(3000);
		boolean res = driver.findElement(By.id("customerLightBox")).isDisplayed();
		if(res==false) {
			System.out.println("User has been created");
		}else {
			System.out.println("User already exists");
		}
		/*boolean atext1 = driver.findElement(By.xpath("//*[contains(text(),'has been')]")).isDisplayed();
		Assert.assertTrue(atext1);
		Reporter.log("customer is created",true);*/
		//String atext = driver.findElement(By.xpath("//*[contains(text(),'has been')]")).getText();

//		if(atext.contains("HDFC_001")) {
//			System.out.println("created customer");
//		}
//		else
//		{
//			driver.findElement(By.id("customerLightBox_cancelBtn")).click();
//			Alert a = driver.switchTo().alert();
//			a.accept();
//			System.out.println("customer is present in database");
//		}


	}
}
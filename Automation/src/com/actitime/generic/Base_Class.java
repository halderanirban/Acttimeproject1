package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class Base_Class {
	WebDriver driver;
//	@Parameters("browser")
	@BeforeClass (groups="smoke")
	
	//<parallel execution>
	public void openBrowser() {
		/*if(browser.equals("chrome")) {
			 driver=new ChromeDriver();
		}else if(browser.equals("Edge")) {
			driver=new EdgeDriver();
		}else if(browser.equals("firefox")) {
			 driver=new FirefoxDriver();
		}*/
		//</parallel execution>
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://localhost/login.do");
		Reporter.log("openBrowser",true);

	}
	@BeforeMethod (groups="smoke")
	public void login() {

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Reporter.log("login",true);
	}

	@AfterMethod (groups="smoke")
	public void logout() {

		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logout",true);
	}

	@AfterClass  (groups="smoke")
	public void closeBrowser() {
		driver.close();
		Reporter.log("closeBrowser",true);
	}

}
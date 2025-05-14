package com.Demoacttime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodCls {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		LoginPage l=new LoginPage(driver);

		l.setvalue("admin");
		l.setPassword("manager");
		l.setLogin();
		Thread.sleep(2000);
		//l.setLogout();
		HomePage h = new HomePage(driver);
		
		h.setLogout();

	
		
	}

}

package com.acttime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_method {
	@Test
	public void VerifyLogin() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		Login l=new Login();
		l.setvalue("admin","manager");
	}
}



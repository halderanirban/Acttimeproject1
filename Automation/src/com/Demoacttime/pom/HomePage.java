package com.Demoacttime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	private WebElement lgoutBbx;
	
	public HomePage(WebDriver driver) {
		lgoutBbx = driver.findElement(By.id("logoutLink"));
		
	}
	
	void setLogout() {
		lgoutBbx.click();
		
	}

}

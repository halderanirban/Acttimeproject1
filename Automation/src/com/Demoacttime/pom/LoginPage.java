package com.Demoacttime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebElement unTbx;                           //Declaration
	private WebElement pwTbx;
	private WebElement lgBbx;
	//private WebElement lgoutBbx;



	public LoginPage(WebDriver driver) {
		unTbx=driver.findElement(By.id("username"));   //Initialization 
		pwTbx=driver.findElement(By.name("pwd"));
		lgBbx=driver.findElement(By.xpath("//div[.='Login ']"));
		//lgoutBbx=driver.findElement(By.id("logoutLink"));
        
	}
	public void setvalue(String un) {
		unTbx.sendKeys(un);
	
	}
	
	public void setPassword(String pw) {
		pwTbx.sendKeys(pw);
	}

	public void setLogin() {
		lgBbx.click();
	}
	
	/*public void setLogout() {
		lgoutBbx.click();
	}*/
	
	
	
	


}

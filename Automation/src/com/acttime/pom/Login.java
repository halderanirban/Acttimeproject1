package com.acttime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(id="username")
	private WebElement unTbx;                           //Declaration
	@FindBy(name = "pwd")
	private WebElement pwTbx;
	@FindBy(xpath ="//div[.='Login ']")
	private WebElement lgBbx;


	//Initialization 

	public void LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//Business logic 

	public void setvalue(String un,String pw) {
		unTbx.sendKeys(un);
		pwTbx.sendKeys(pw);
		lgBbx.click();
	}
}

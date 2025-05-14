package com.Demoacttime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackpage {
	@FindBy(linkText = "TASKS")
	private WebElement task;
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	private WebElement logout;
	@FindBy(xpath = "//div[(text()='Add New')]")
	private WebElement addnew;
	@FindBy(xpath = "//div[(text()='+ New Customer')]")
	private WebElement newproject;
	@FindBy(id = "customerLightBox_nameField")
	private WebElement newcustomername;
	@FindBy(id = "customerLightBox_descriptionField")
	private WebElement description;
	@FindBy(id = "customerLightBox_customerSelectorPlaceholder")
	private WebElement dropdown;
	@FindBy(linkText = "Our Company")
	private WebElement ourcompany;
	
	public void homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	

}

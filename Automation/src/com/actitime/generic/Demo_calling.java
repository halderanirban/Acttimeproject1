package com.actitime.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_calling {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileLibrary f=new FileLibrary();
/**
 * calling property file elements (with the help of class name)
 */
		String url = f.getpropertydata("url");
		String un =f.getpropertydata("username");
		String pw =f.getpropertydata("pwd");
		
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		
		/**
		 * calling property Excel file elements (with the help of class name)
		 */
		
		String data = f.getExceldata("Create Customer",1, 4);
		System.out.println(data);
		String data1 = f.getExceldata("MultipleData", 3, 6);
		System.out.println(data1);
		
		f.setExceldata("InvalidLogin", 0, 2, "password");
		f.setExceldata("InvalidLogin", 1, 2, "fail");
	}
}
package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.tomlj.internal.TomlParser.FalseBoolContext;

import com.actitime.generic.Base_Class;
public class Customer_Module extends Base_Class{



	@Test(priority = 1,groups="smoke")
	public void createCustomer() {
		Reporter.log("createCustomer",true);

	}
	
	@Test(priority = 2)
	public void modifyCustomer() {
		//Assert.fail();
		Reporter.log("modifyCustomer",true);

	}
	
	@Test(priority = 3,dependsOnMethods = "modifyCustomer")
	public void deletCustomer() {
		Reporter.log("deletCustomer",true);

	}
}

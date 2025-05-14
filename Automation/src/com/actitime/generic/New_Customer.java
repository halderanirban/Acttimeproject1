package com.actitime.generic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners( com.actitime.generic.ListenerImplementation.class)
public class New_Customer extends Base_Class{
	
	@Test
	public void newCustomer(){
		
		Reporter.log("newCustomer",true);
		Assert.fail();
	}
	
	
	
}


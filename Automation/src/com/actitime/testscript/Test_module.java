package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.Base_Class;

public class Test_module extends Base_Class  {
	
	@Test(priority = 1,groups="smoke")
	public void createTest() {
		Reporter.log("createTest",true);

	}
	
	@Test(priority = 2)
	public void modifyTest() {
		Reporter.log("modifyTest",true);

	}
	
	@Test(priority = 3 )
	public void deletTest() {
		Reporter.log("deletTest",true);


}

}

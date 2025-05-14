package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import com.actitime.generic.Base_Class;

public class Project_module extends Base_Class  {


	@Test(groups="smoke")
	public void createProject() {
		Reporter.log("createProject",true);

	}
	
	@Test
	public void modifyProject() {
		Reporter.log("modifyProject",true);

	}
	
	@Test
	public void deletProject() {
		Reporter.log("deletProject",true);
	}


}

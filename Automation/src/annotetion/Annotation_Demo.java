package annotetion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Demo {
	@BeforeClass
	public void openbrowser() {
		Reporter.log("openbrowser",true);
	}

	@AfterClass
	public void closebrowser() {
		Reporter.log("closebrowser",true);
	}

	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}

	@Test(priority = 1)
	public void createCustomer() {
		Reporter.log("createCustomer",true);

	}

	@Test(priority = 2,dependsOnMethods = "createCustomer")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);

	}

	@Test(priority = 0)
	public void deletCustomer() {
		//Assert.fail();
		Reporter.log("deletCustomer",true);
	}
}


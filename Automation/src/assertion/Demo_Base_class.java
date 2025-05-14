package assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo_Base_class {
	
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser",true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
	}
	
	@Test(priority = 1)
	public void createcustome() {
		Reporter.log("createcustomer",true);
	}
	
	@Test(priority = 2)
	public void modifycustomer() {
		Reporter.log("modifycustomer",true);
	}
	
	@Test(priority = 3 )
	public void deletcustomer() {
		Reporter.log("deletcustomer",true);
	}
	
	
	
}


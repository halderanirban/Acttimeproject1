package assertion;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.generic.Base_Class;

public class Practice_Base_class extends Base_Class {
	
	@BeforeMethod
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@Test
	public void createcustomer() {
		Reporter.log("createcustomer",true);
	}
	
	@Test
	public void modifycustomer() {
		Reporter.log("modifycustomer",true);
	}

}

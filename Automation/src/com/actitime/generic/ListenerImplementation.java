package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends Base_Class implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		/**
		 * We are (extends Base_class so we can inherit all method in this class)
		 * OpenBrowser
		 * login actitime(by using un&pwd)
		 * logout
		 * close browser
		 */

	//WebDriver driver=new ChromeDriver();
	//driver.get("http://localhost/login.do");
		
		
		/**
		 *  FOR MULTIPAL SCREENSHORT (THEN WE HAVE TO Concatenate WITH NEW FILE PATH)
		 */
	//	String name = Math.random();
		
		/**
		 * FOR MULTIPAL SCREENSHORT(THEN WE HAVE TO Concatenate WITH NEW FILE PATH)
		 */
		String name = result.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("./screenShort/"+name+"ss.png");     
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {

}
}

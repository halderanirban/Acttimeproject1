package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Alignment_Acttime_un_pwd {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		int x1 = driver.findElement(By.xpath("//input[@name='username']")).getLocation().getX();
		int x2 = driver.findElement(By.xpath("//input[@name='pwd']")).getLocation().getX();
		if(x1==x2)
		{
			System.out.println("UN & Pwd text box properly Alinged and test pass");
		}
		else
		{
			System.out.println("UN & Pwd text box properly Not_Alinged and test fail");
		}
		System.out.println(x1);
		System.out.println(x2);
		driver.quit();


	}

}

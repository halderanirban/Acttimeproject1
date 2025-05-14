package childbrowser;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Address_window {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
		
		String parentadd = driver.getWindowHandle();
		Set<String> alladd = driver.getWindowHandles();
		System.out.println(alladd.size());
		
		//Another way:-
		//List<String> windowlist=new ArrayList<String>(alladd);
		
		//System.out.println(windowlist.get(0));
		
		System.out.println("parent window:"+parentadd);
		System.out.println(alladd);
		driver.quit();


	}

}

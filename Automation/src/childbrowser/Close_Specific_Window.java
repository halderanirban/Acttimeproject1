package childbrowser;

import java.util.Scanner;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Specific_Window {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("ENTER WINDOW TITLE");
		
		String etitle = sc.nextLine();	
		
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");

		Set<String> allwindow = driver.getWindowHandles();

	//	String etitle="Screen 2";

		for(String wh:allwindow)
		{
			// Approch:-1
			/*driver.switchTo().window(wh);
				String alltitle = driver.getTitle();*/

			//Approch:-2
			
			String alltitle = driver.switchTo().window(wh).getTitle();


			//if(!(alltitle.equals(etitle))) // This is one, for open particular screen
			if(alltitle.equals(etitle)) // This is one for close particular screen
			{
				driver.close();
			}
				/*else
				{
					driver.close();
				}*/
		}
	}
}

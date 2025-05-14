package listboxassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alphabaticalorder {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/ANIRBAN/OneDrive/Desktop/MTRbr.html");
		WebElement mrtlistbox = driver.findElement(By.id("mtr"));

		Select s=new Select(mrtlistbox);

		List<WebElement> alloption = s.getOptions();
		List<String> option=new ArrayList<>();

		for(int i=0;i<alloption.size();i++) {
			option.add(alloption.get(i).getText());
		}
		Collections.sort(option);

		for(String a1:option)
		{
			System.out.println(a1);
		}

	}

}

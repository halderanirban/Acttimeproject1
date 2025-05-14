package qsp;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tage_Name_Attributs_herf {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		String tagname = driver.findElement(By.id("licenseLink")).getTagName();
		String hrfe = driver.findElement(By.id("licenseLink")).getAttribute("href");
		System.out.println(tagname);
		System.out.println(hrfe);
		driver.quit();

	}

}

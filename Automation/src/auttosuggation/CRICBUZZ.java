package auttosuggation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRICBUZZ {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/102108/nz-vs-pak-2nd-odi-pakistan-tour-of-new-zealand-2025");
		
		List<WebElement> allname = driver.findElements(By.xpath("(//span[contains(.,'Innings')])[1]/../../div/div[1]/a"));
		List<WebElement> allruns = driver.findElements(By.xpath("(//span[contains(.,'Innings')])[1]/../../div/div[1]/a/../../div[3]"));
		
		for(int i=0;i<allname.size()&&i<allruns.size();i++)
		{
			String players = allname.get(i).getText();
			String runs = allruns.get(i).getText();
			System.out.println(players+"====>"+runs);
		}
		driver.quit();
	}

}


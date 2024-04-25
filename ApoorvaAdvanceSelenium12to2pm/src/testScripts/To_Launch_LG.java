package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Launch_LG 
{
	@Test(groups = "mobile")
	public void LG()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lg.com/in/offers/mobile/");
		driver.quit();
	}
}

package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Launch_LakmeIndia 
{
	@Test(groups = "beauty")
	public void LakmeIndia()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lakmeindia.com/");
		driver.quit();
	}
}

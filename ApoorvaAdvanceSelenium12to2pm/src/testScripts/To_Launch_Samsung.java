package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Launch_Samsung 
{
	@Test(groups = "mobile")
	public void Samsung()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.samsung.com");
		driver.quit();
	}
}

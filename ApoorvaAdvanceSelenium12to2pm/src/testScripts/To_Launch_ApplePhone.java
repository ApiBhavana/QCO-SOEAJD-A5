package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Launch_ApplePhone
{
	@Test(groups = "mobile")
	public void ApplePhone()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com/");
		driver.quit();
	}
}

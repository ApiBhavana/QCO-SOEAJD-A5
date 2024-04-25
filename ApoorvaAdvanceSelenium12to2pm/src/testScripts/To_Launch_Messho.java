package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Launch_Messho
{
	@Test(groups = "ecom")
	public void messho()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		driver.quit();
	}
}

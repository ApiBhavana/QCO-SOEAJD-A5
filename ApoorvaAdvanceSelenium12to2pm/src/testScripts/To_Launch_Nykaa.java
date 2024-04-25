package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Launch_Nykaa 
{
	@Test(groups = "beauty")
	public void Nykaa()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.quit();
	}
}

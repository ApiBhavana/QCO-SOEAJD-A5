package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Launch_Mamaearth 
{
	@Test(groups = "beauty")
	public void Mamaearth()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://mamaearth.in/");
		driver.quit();
	}
}

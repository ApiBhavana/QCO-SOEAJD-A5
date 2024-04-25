package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Launch_Xaiomi
{
	@Test(groups = "mobile")
	public void Xaiomi()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mi.com/in/");
		driver.quit();
	}
}

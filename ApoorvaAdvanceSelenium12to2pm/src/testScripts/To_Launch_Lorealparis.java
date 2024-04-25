package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Launch_Lorealparis
{
	@Test(groups = "beauty")
	public void Lorealparis()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lorealparis.co.in/");
		driver.quit();
	}
}

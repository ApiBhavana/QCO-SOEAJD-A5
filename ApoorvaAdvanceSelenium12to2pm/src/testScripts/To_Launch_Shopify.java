package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Launch_Shopify
{
	@Test(groups = "ecom")
	public void shopify()
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopify.com/in");
		driver.quit();
	}
}

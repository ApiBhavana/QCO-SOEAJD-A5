package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Launch_Myntra 
{
@Test(groups = "ecom")
public void Myntra()
{
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.quit();
}
}

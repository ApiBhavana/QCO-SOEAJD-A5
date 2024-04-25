package WorkingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WirkingWithTimeOutAttribute 
{
//@Test(timeOut = 2000)
	//@Test(invocationCount = 2,threadPoolSize = 2)//it will execute the tc parallely for 2 times
//@Test(threadPoolSize = 3)
//@Test(invocationCount = 3,threadPoolSize = 2)
	@Test(invocationCount = 3,threadPoolSize = 3)
	public void run() throws InterruptedException
{
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyundai.com/in/en");
	Thread.sleep(3000);
	driver.quit();
}
	

}

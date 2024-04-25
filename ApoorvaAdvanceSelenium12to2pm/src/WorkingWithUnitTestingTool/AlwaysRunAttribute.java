package WorkingWithUnitTestingTool;

import org.testng.annotations.Test;

public class AlwaysRunAttribute 
{
@Test(priority = 1)
public void openBrowser()
{
	System.out.println("User is able to open browser");
}
@Test(priority = 2)
public void enterURL()
{
	System.out.println("User is able to enter URL");
}
@Test(alwaysRun = true)//working is it will execute even if any of the method fails
public void closeBrowser()
{
	System.out.println("User is able to close browser");
}

	

}

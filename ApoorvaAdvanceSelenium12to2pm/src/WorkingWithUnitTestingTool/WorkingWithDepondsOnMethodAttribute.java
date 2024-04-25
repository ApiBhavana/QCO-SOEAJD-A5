package WorkingWithUnitTestingTool;

import org.testng.annotations.Test;

public class WorkingWithDepondsOnMethodAttribute
{
@Test
public void openBrowser()
{
	System.out.println("User is able to open browser");
}
@Test(dependsOnMethods = {"openBrowser","closedBrowser"})
public void enterUrl()
{
	System.out.println("User is able to enter url ");
}
@Test(dependsOnMethods = "enterUrl")
public void enterEmailId()
{
	System.out.println("User is able to enter email id");
}
@Test(dependsOnMethods = "openBrowser")
public void enterPassword()
{
	System.out.println("User is able to enter password");
}


@Test
public void closeBrowser()
{
	System.out.println("User is able to close browser");
}



}

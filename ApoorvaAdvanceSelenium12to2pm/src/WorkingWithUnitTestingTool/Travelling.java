package WorkingWithUnitTestingTool;

import org.testng.annotations.Test;

public class Travelling {
//default priority value is 0
	@Test (priority = 0)
	public void register()
	{
	System.out.println("User is able to register");	
    }
	@Test(enabled = false)
	public void login()
	{
		System.out.println("User is able to login ");
	}
	@Test(priority = 2)
	public void selDate()
	{
		System.out.println("User is able to select date ");
	}
	@Test(priority = -1)
	public void selPayment()
	{
		System.out.println("User is able to do payment ");
	}
	@Test(priority = -2)
	public void confromMsg()
	{
		System.out.println("User is able to get confrim message ");
	}
	

}

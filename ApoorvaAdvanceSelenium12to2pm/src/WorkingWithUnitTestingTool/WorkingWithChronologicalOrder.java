package WorkingWithUnitTestingTool;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithChronologicalOrder 
{@BeforeSuite
	public void beforeSuite()
	{
	System.out.println("Hello I am Before Suite");
	System.out.println("Database Connection is start");
	}
@AfterSuite
public void afterSuite()
{
System.out.println("Hello I am After Suite");
System.out.println("Database Connection is closed");
}

@Test
public void test()
{
System.out.println("Hello I am Test");
}

@AfterClass
public void afterClass()
{
System.out.println("Hello I am After Class");
}
@BeforeClass
public void beforeClass()
{
System.out.println("Hello I am Before class");
}
@Test
public void run()
{
System.out.println("Hello I am Run");
}
@AfterTest
public void afterTest()
{
System.out.println("Hello I am After Test");
}
@BeforeTest
public void beforeTest()
{
System.out.println("Hello I am before test");
}
@AfterMethod
public void afterMethod()
{
System.out.println("Hello I am After Method");
}

@BeforeMethod
public void beforeMethod()
{
System.out.println("Hello I am before Method");
}
@Test
public void practice()
{
System.out.println("Hello I am Practice Method");
}

	

}

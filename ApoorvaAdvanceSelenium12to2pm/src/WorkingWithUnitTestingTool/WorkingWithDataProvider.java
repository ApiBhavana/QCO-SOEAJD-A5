package WorkingWithUnitTestingTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider 
{
	@DataProvider(name="test")
public String[][] getdata()
{
	
	String[][] data=new String[2][5];
	data[0][0]="Shriyan";
	data[0][1]="Bandurkar";
	data[0][2]="Shriyan@gmail.com";
	data[0][3]="Shriyan1208";
	data[0][4]="Shriyan1208";
	
	data[0][0]="Bhavana";
	data[0][0]="Junghari";
	data[0][0]="junghari@gmail.com";
	data[0][0]="Shr123";
	data[0][0]="Shr123";
	return data;
}
@Test(dataProvider = "test")

public void dataDemo(String FN,String LN,String EMAILID,String PWD,String CONFIRMPWD)
{
	System.out.println("FN");
	System.out.println("LN");
	System.out.println("EMAILID");
	System.out.println("PWD");
	System.out.println("CONFIRMPWD");
}
}

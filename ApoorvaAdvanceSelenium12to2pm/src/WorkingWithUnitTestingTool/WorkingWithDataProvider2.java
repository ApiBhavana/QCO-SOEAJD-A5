package WorkingWithUnitTestingTool;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider2
{
	@DataProvider(name="test")
	public String[][] getdata()
	{
		
		String[][] data=new String[3][5];
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

	public void dataDemo(String regData[])
	{
		System.out.println(regData[0]);
		System.out.println(regData[1]);
		System.out.println(regData[2]);
		System.out.println(regData[3]);
		System.out.println(regData[4]);
}
}

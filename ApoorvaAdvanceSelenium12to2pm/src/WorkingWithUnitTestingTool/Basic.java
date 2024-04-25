package WorkingWithUnitTestingTool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic {//tc_id

	 
		 @Test
		public void run()//tc_case_scenarios
		{
			 System.out.println("Hello TestNg");
			 Reporter.log("Hello TESTNG",true);
		}

	

}

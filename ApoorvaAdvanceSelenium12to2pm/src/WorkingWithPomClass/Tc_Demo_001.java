package WorkingWithPomClass;

import org.testng.annotations.Test;

public class Tc_Demo_001 extends BaseClassPom {
@Test
public void validatethatUserIsAbleToRegister() {
	RegisterPagePom rp=new RegisterPagePom(driver);
	
	rp.getRegisterLink().click();
	rp.getFemaleRadioButton().click();
	rp.getFirstNameTextBox().sendKeys("Shriyan");
	rp.getLastNameTextBox().sendKeys("Bhavana Bandurkar");
			
}
}

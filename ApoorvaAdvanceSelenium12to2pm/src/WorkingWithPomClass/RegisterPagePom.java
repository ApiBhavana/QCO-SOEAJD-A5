package WorkingWithPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPagePom 
{
public RegisterPagePom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(linkText = "Register")
 private WebElement registerLink;

@FindBy(id = "gender-female")
private WebElement felmaleRadioButton;

@FindBy(id = "FirstName")
private WebElement firstNameTextBox;
@FindBy(id = "LastName")
private WebElement lastNameTextBox;

public WebElement getRegisterLink() {
	return registerLink;
}
public WebElement getFemaleRadioButton() {
	return felmaleRadioButton;
}
public WebElement getFirstNameTextBox() {
	return firstNameTextBox;
}
public WebElement getLastNameTextBox() {
	return lastNameTextBox;
}





}

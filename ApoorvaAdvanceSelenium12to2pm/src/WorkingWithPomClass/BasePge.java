package WorkingWithPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePge
{
public BasePge(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(id="small-searchterms")
private WebElement searchTextButton;

@FindBy(xpath="//input[@value='Search']")
private WebElement searchButton;

public WebElement getSearchTextButton() {
	return searchTextButton;
}


public WebElement getSearchButton() {
	return searchButton;
}




}

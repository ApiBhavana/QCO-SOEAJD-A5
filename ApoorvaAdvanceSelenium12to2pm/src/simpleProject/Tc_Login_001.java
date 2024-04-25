package simpleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc_Login_001 {

	public static void main(String[] args) 
	{
		
	String actualUrl = "https://demowebshop.tricentis.com/ ";
	String actualTitlePage = "Demo Web Shop";
	String actualLoginPage = "https://demowebshop.tricentis.com/login";
	String EmailID = "jungharibhavna@gmail.com";
	String Password = "Shriyan@1208";
	boolean actualCheckBox = true;
	
	
		//Step:1->Open browser
		WebDriver driver =new EdgeDriver();
		System.out.println("User is able to open empty broswer");
		driver.manage().window().maximize();
		System.out.println("User is able to maximize browser");
		
		//Step:2->Enter the url
		driver.get("https://demowebshop.tricentis.com/");
		String tileOfThePage = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		if(actualUrl.equals(currentUrl))
		{
			System.out.println("User is able to open demo webshop ");
		}
		else
		{
			System.out.println("User is not able to open demo webshop");
		}
		if(actualTitlePage.equals(tileOfThePage))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is not correct");
		}
		
		////Step:3->Click on login link
		driver.findElement(By.linkText("Log in")).click();
		String LoginPageURL = driver.getCurrentUrl();
		if(actualLoginPage.equals(LoginPageURL))
		{
			System.out.println("User is able to land on login page");
		}
		else
		{
			System.out.println("User is not able to click on login page");
		}
		///Step:4->Enter valid Email ID
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.sendKeys(EmailID);
		String value = emailTextBox.getAttribute("value");
		if(EmailID.equals(value))
		{
			System.out.println("User is able to send email id");
		}
		else
		{
			System.out.println("User is not able to send valid data");
		}
		
		///Step:5->Enter valid Password
		WebElement PwdTextBox = driver.findElement(By.id("Password"));
		PwdTextBox.sendKeys(Password);
		String value1 = PwdTextBox.getAttribute("value");
		if(Password.equals(value1))
		{
			System.out.println("User is Able to send Password ");
		}
		else
		{
			System.out.println("User is not able to send valid password");
		}
		///Step:6->Click on Check box
		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		checkBox.click();
		boolean flag = checkBox.isSelected();
		if(checkBox.isSelected())
		{
			System.out.println("User is able to click on check box");
		}
		else
		{
			System.out.println("User is not able to click on check box");
		}

		///Step:6->Click on Login Button
		 WebElement loginButton = driver.findElement(By.className("button-1 login-button"));
         loginButton.click();
        
        //System.out.println("User is able to Click on Login button");
       		//step:7->
		//driver.quit();
		//System.out.println("User is able to quit the browser");
		
		

	}

}

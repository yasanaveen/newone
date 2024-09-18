package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends parentConstuctor{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	private @FindBy(name="email")
	WebElement txtusername;
	
	private @FindBy(name="password")
	WebElement txtpwd;
	
	private @FindBy(xpath = "//input[@value='Login']")
	WebElement clickLoginbutton;
	
	
	
	
	public void username(String uname)
	{
		txtusername.sendKeys(uname);
	}
	public void pwd(String paswd)
	{
		txtpwd.sendKeys(paswd);
	}
	public void clklogin()
	{
		clickLoginbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

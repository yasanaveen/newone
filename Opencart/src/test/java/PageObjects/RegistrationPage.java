package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends parentConstuctor {
	
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	private @FindBy(name = "firstname") WebElement txtFirstName;
	private @FindBy(name = "lastname") WebElement txtlastName;
	private @FindBy(name = "email") WebElement txtEmail;
	private @FindBy(name="telephone") WebElement txtTelephonenumber;
	private @FindBy(name="password") WebElement txtpassword;
	private @FindBy(name = "confirm") WebElement txtConformpassword;
	private @FindBy(name = "agree") WebElement chkboxprivacypolicy;
	private @FindBy(xpath ="//input[@value='Continue']") WebElement btncontinue;
	private @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement cnfMsge;
	
	
	public void setFirstname(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastname(String lname)
	{
		txtlastName.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setMobilenumber(String mNumber)
	{
		txtTelephonenumber.sendKeys(mNumber);
	}
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void cPassword(String Cpwd)
	{
		txtConformpassword.sendKeys(Cpwd);
	}
	
	public void checkBox()
	{
		chkboxprivacypolicy.click();
	}
	
	public void continueButton()
	{
		btncontinue.click();
	}
	
	public String acountcreatedMsge()
	{
		try
		{
			
		return cnfMsge.getText();
		
		}catch(Exception e)
		{
			return (e.getMessage());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

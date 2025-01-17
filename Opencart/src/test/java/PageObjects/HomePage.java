package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends parentConstuctor{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	 @FindBy(xpath = "//a[@title='My Account']")
	 private WebElement lnkMyAccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	private WebElement lnkRegister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	private WebElement lgnButton;
	
	public void clickMyAccount()
	{
		lnkMyAccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLgnbutton()
	{
		lgnButton.click();
	}
	

}

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAcountPage extends parentConstuctor{
	
	public MyAcountPage(WebDriver driver) 
	{
		super(driver);
	}
	
	private @FindBy(xpath = "//h2[normalize-space()='My Account']")
	WebElement msgeHeading;
	
	private @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement clklogout;
	
	public boolean isMyAccountExist() {
		try {
			return msgeHeading.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickonlogout()
	{
		clklogout.click();
	}

}

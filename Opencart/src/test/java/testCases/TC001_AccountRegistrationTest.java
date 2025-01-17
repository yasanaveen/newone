package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegistrationPage;

public class TC001_AccountRegistrationTest extends BaseTest {
	
	@Test
	public void verify_account_registration()
	{
		
		logger.info("****** started TC001_AccountRegistrationTest ****");
		
		try
		{
		HomePage hm = new HomePage(driver);
		hm.clickMyAccount();
		logger.info("****** click on my account ****");
		hm.clickRegister();
		logger.info("****** click on register button ****");
		
		RegistrationPage reg= new RegistrationPage(driver);
		logger.info("****** Enter customer details ****");
		
		reg.setFirstname(randomString().toUpperCase());
		reg.setLastname(randomString().toUpperCase());
		reg.setEmail(randomString()+"@gmail.com");
		reg.setMobilenumber(randomNumber());
		String password=randomAlphaNumeric();
		reg.setPassword(password);
		reg.cPassword(password);
		
		reg.checkBox();
		reg.continueButton();
		
		logger.info("*****  validating expected msge  *******");
		String confirmmsge=reg.acountcreatedMsge();
		Assert.assertEquals(confirmmsge, "Your Account Has Been Created!","conform msge mismatch..");
		logger.info("****** Test Passed ****");
		
		}
		 catch(Exception e)
		{
			logger.error("Test Faied:"+e.getMessage());
			Assert.fail("Test Failed:"+e.getMessage());
		}
		finally 
		{
		  logger.info("****** Finished TC001_AccountRegistrationTest ****");
		}
		
	
	

}
}

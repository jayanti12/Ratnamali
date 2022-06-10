package Ratnamali.quotes;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Ratnamali.GenericLib.BaseTest;
import Ratnamali.Login.ValidLogin;
import Ratnamali.pages.HomePage;

//open the browser, enter the url and verify
@Listeners(Ratnamali.GenericLib.MyListeners.class)
public class VerifyQuotesTab extends BaseTest{

	@Test
	public void verifyQuotesTabTest() throws Throwable
	{
		//enter valid login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on quotes tab and verify
		HomePage hp = new HomePage();
		hp.clickQuotesElement();
		
	}
}

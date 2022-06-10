package Ratnamali.Accounts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Ratnamali.GenericLib.BaseTest;
import Ratnamali.GenericLib.WebDriverCommonLib;
import Ratnamali.Login.ValidLogin;
import Ratnamali.pages.AccountsPage;
import Ratnamali.pages.HomePage;
@Listeners(Ratnamali.GenericLib.MyListeners.class)
//open the browser, enter url, verify
public class VerifyAccountsTab extends BaseTest{

	@Test
	public void verifyAccountsTabTest() throws Throwable
	{
		//enter login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on accountstab and verify
		HomePage hp = new HomePage();
		hp.clickAccountsTab();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		AccountsPage ap = new AccountsPage();
		wlib.elementIsDisplayedOrNot(ap.getAccountsTextAddress(),"Accounts Text");
	}
}

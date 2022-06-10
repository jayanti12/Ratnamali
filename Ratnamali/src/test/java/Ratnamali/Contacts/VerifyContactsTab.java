package Ratnamali.Contacts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Ratnamali.GenericLib.BaseTest;
import Ratnamali.GenericLib.WebDriverCommonLib;
import Ratnamali.Login.ValidLogin;
import Ratnamali.pages.ContactsPage;
import Ratnamali.pages.HomePage;
@Listeners(Ratnamali.GenericLib.MyListeners.class)
//open the browser enter the url and verify
public class VerifyContactsTab extends BaseTest{
	@Test
	public void verifyContactsTabTest() throws Throwable
	{
		//enter login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on contactstab and verify
		HomePage hp = new HomePage();
		hp.clickContactsTab();
		
		ContactsPage cp = new ContactsPage();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.elementIsDisplayedOrNot(cp.getContactsTextAddress(), "Contacts Text");
		
	}

}

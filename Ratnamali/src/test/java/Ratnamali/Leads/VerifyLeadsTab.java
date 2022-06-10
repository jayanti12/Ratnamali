package Ratnamali.Leads;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Ratnamali.GenericLib.BaseTest;
import Ratnamali.GenericLib.WebDriverCommonLib;
import Ratnamali.Login.ValidLogin;
import Ratnamali.pages.HomePage;
import Ratnamali.pages.LeadsPage;
//Open the browser, enter the test url, verify loginpage is displayed 
@Listeners(Ratnamali.GenericLib.MyListeners.class)
public class VerifyLeadsTab extends BaseTest{
	@Test
	public void verifyLeadsTabtest() throws Throwable
	{
		//Login to app verify home page is displayed
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//Click on leadstab
		HomePage hp = new HomePage();
		hp.clickLeadsTab();
		
		//verify leads text is displayed
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		LeadsPage lp = new LeadsPage();
		wlib.elementIsDisplayedOrNot(lp.getLeadsTextAddress(), "LeadsText");
		
		
		
	}

}

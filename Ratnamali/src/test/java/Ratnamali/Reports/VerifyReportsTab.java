package Ratnamali.Reports;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Ratnamali.GenericLib.BaseTest;
import Ratnamali.GenericLib.WebDriverCommonLib;
import Ratnamali.Login.ValidLogin;
import Ratnamali.pages.HomePage;
import Ratnamali.pages.ReportsPage;

//open the browser, enter the url, and verify
@Listeners(Ratnamali.GenericLib.MyListeners.class)
public class VerifyReportsTab extends BaseTest{
	
	@Test
	public void verifyReportsTabTest() throws Throwable
	{
		//enter valid login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on reports tab and verify
		HomePage hp = new HomePage();
		hp.clickReportsTab();
		ReportsPage rp = new ReportsPage();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.elementIsDisplayedOrNot(rp.getReportsTextAddress(), "Reports text");
	}

}

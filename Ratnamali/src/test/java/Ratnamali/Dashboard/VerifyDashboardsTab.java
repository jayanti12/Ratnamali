package Ratnamali.Dashboard;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Ratnamali.GenericLib.BaseTest;
import Ratnamali.GenericLib.WebDriverCommonLib;
import Ratnamali.Login.ValidLogin;
import Ratnamali.pages.DashboardsPage;
import Ratnamali.pages.HomePage;

//open the browser, enter the url and verify
@Listeners(Ratnamali.GenericLib.MyListeners.class)
public class VerifyDashboardsTab extends BaseTest{
	
	@Test
	public void verifyDashboardsTabTest() throws Throwable
	{
		//enter valid login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on dashboards and verify
		HomePage hp = new HomePage();
		hp.clickDashboardTab();
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		DashboardsPage dp = new DashboardsPage();
		
		wlib.elementIsDisplayedOrNot(dp.getDashboardsTextAddress(), "Dashboard text");
	}

}

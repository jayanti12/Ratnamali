package Ratnamali.Campaigns;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Ratnamali.GenericLib.BaseTest;
import Ratnamali.GenericLib.WebDriverCommonLib;
import Ratnamali.Login.ValidLogin;
import Ratnamali.pages.CampaignsPage;
import Ratnamali.pages.HomePage;

@Listeners(Ratnamali.GenericLib.MyListeners.class)
//open the browser, enter url and verify
public class VerifyCampaignsTab extends BaseTest{
	
	@Test
	public void verifyCampaignsTabTest() throws Throwable
	{
		//enter valid login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on campaigns tab and verify
		HomePage hp = new HomePage();
		hp.clickCampaignsTab();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		CampaignsPage cp = new CampaignsPage();
		wlib.elementIsDisplayedOrNot(cp.getcampaignsTextAddress(), "Campaigns text");
		
	}
	

}

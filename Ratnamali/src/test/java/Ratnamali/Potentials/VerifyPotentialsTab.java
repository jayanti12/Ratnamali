package Ratnamali.Potentials;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Ratnamali.GenericLib.BaseTest;
import Ratnamali.GenericLib.WebDriverCommonLib;
import Ratnamali.Login.ValidLogin;
import Ratnamali.pages.HomePage;
import Ratnamali.pages.PotentialsPage;
//open the browser enter url and verify

@Listeners(Ratnamali.GenericLib.MyListeners.class)
public class VerifyPotentialsTab extends BaseTest{

	@Test
	public void verifyPotentialstabTest() throws Throwable
	{
		//enter valid login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on potentials tab and verify
		HomePage hp = new HomePage();
		hp.clickPotentialsTab();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		PotentialsPage pp = new PotentialsPage();
		wlib.elementIsDisplayedOrNot(pp.getPotentialsTextAddress(),"Potentials Text");
	}
}

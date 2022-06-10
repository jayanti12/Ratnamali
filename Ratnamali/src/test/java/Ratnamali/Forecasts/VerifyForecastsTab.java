package Ratnamali.Forecasts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Ratnamali.GenericLib.BaseTest;
import Ratnamali.GenericLib.WebDriverCommonLib;
import Ratnamali.Login.ValidLogin;
import Ratnamali.pages.ForecastsPage;
import Ratnamali.pages.HomePage;

//open the browser and enter the url
@Listeners(Ratnamali.GenericLib.MyListeners.class)
public class VerifyForecastsTab extends BaseTest {
	
	@Test
	public void verifyForecastsTabTest() throws Throwable 
	{
		//enter valid login details and verify
		ValidLogin vl = new ValidLogin();
		vl.validLoginTest();
		
		//click on forecasts tab and verify
		HomePage hp = new HomePage();
		hp.clickForecastsTab();
		ForecastsPage fp = new ForecastsPage();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.elementIsDisplayedOrNot(fp.getForecastsTextAddress(), "Forecasts Text");
		
	}

}

package Ratnamali.Login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Ratnamali.GenericLib.BaseTest;
import Ratnamali.GenericLib.FileLib;
import Ratnamali.GenericLib.WebDriverCommonLib;
import Ratnamali.pages.SignInPage;

@Listeners(Ratnamali.GenericLib.MyListeners.class)
public class ValidLogin extends BaseTest{

	@Test
	public void validLoginTest() throws Throwable {
		
		//Open the browser
		//Enter the test URL
		//Verify LoginPage is Displayed
		FileLib flib=new FileLib();
		//Login to App
		SignInPage lp=new SignInPage();
		lp.login(flib.readPropertyData(PROP_PATH, "username"), 
				flib.readPropertyData(PROP_PATH, "password"));
		//Verify Home Page is Displayed
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH, "homeTitle"));
		wlib.verify(wlib.getPageTitle(),
				flib.readPropertyData(PROP_PATH, "homeTitle"),
				"Lexnod Home page");
	}
}

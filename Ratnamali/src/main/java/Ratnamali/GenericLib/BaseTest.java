package Ratnamali.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//return in global report(Github)
public class BaseTest implements IAutoConsts{

	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		String browserName = flib.readPropertyData(PROP_PATH, "browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Enter Proper Browser Name");
		}
		String appURL = flib.readPropertyData(PROP_PATH, "url");
		driver.manage().window().maximize();
		driver.get(appURL);
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), 
				flib.readPropertyData(PROP_PATH, "loginTitle"),
				"Sign in Page");
		
	}
	
	@AfterClass(enabled=true)
	public void closeBrowser()
	{
		driver.quit();
	}
}

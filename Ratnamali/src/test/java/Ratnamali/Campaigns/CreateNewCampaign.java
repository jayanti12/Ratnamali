package Ratnamali.Campaigns;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Ratnamali.GenericLib.BaseTest;

@Listeners(Ratnamali.GenericLib.MyListeners.class)
//open the browser enter the url and verify
public class CreateNewCampaign extends BaseTest {
	@Test
	public void createNewCampaignTest() throws Throwable
	{
		//enter valid details and verify
		//click on campaigns tab and verify
		VerifyCampaignsTab vf = new VerifyCampaignsTab();
		vf.verifyCampaignsTabTest();
		
		
		
		
		
	}

}

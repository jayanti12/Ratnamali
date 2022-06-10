package Ratnamali.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ratnamali.GenericLib.BaseTest;

public class CampaignDetailsPage {
	
	@FindBy(xpath = "//td[@id='Campaign Name']/following-sibling::td[@id='mouseArea__Campaign Name']") private WebElement campaignName;
	
	
	public CampaignDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getCampaignName() {
		return campaignName;
	}
	
	public String getCampaignNameText() {
		return campaignName.getText();
	}

}

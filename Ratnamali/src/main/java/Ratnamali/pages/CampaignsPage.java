package Ratnamali.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ratnamali.GenericLib.BaseTest;

public class CampaignsPage {
	
	@FindBy(xpath = "//td[contains(text(),'Campaigns: ')]") private WebElement campaignsText;
	@FindBy(xpath = "//input[@value = 'New Campaign']") private WebElement newCamapignButton;
	
	
	public CampaignsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getcampaignsTextAddress() {
		return campaignsText;
	}
	
	public String getCampaignsText() {
		return campaignsText.getText();
	}
	
	public WebElement getNewCampaignButton() {
		return newCamapignButton;
	}
	
	public void clickNewCampaignButton() {
		newCamapignButton.click();
	}

}

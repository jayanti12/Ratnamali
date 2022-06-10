package Ratnamali.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ratnamali.GenericLib.BaseTest;

public class LeadDetailPage {
	
	@FindBy(xpath = "//td[contains(text(),'Lead Name')]/following-sibling::td") private WebElement leadName;
	
	
	public LeadDetailPage()
	{
		PageFactory.initElements(BaseTest.driver , this);
	}
	
	public WebElement getLeadname() {
		return leadName;
	}

	public String getLeadNameText() {
		return leadName.getText();
	}
}

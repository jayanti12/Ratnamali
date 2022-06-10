package Ratnamali.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ratnamali.GenericLib.BaseTest;

public class ContactsPage {
	
	@FindBy(xpath = "//td[contains(text(),'Contacts: ')]") private WebElement conatctsText;
	
	
	public ContactsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getContactsTextAddress() {
		return conatctsText;
	}
	
	public String getContactsText()
	{
		return conatctsText.getText();
	}

}

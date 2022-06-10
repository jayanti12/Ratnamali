package Ratnamali.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ratnamali.GenericLib.BaseTest;

public class AccountsPage {
	
	@FindBy(xpath = "//td[contains(text(),'Accounts: ')]") private WebElement accountsText;
	
	
	public AccountsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getAccountsTextAddress() {
		return accountsText;
	}
	
	public String getAccountsText()
	{
		return accountsText.getText();
	}
	

}

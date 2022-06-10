package Ratnamali.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ratnamali.GenericLib.BaseTest;

public class SignInPage {

	@FindBy(id="userName") private WebElement userNameTextbox;
	@FindBy(id="passWord") private WebElement passwordTextbox;
	@FindBy(xpath = "//input[@title=\"Sign In\"]")
	private WebElement signinButton;

	
	public SignInPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}


	public void login(String un, String pw)
	{
		userNameTextbox.sendKeys(un);
		passwordTextbox.sendKeys(pw);
		signinButton.click();
	}
	
	public WebElement getUserNameTextbox() {
		return userNameTextbox;
	}


	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}


	public WebElement getSigninButton() {
		return signinButton;
	}
	
	
	
}












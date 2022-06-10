package Ratnamali.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ratnamali.GenericLib.BaseTest;
import Ratnamali.GenericLib.WebDriverCommonLib;

public class CreateNewLeadPage {
	
	@FindBy(name="property(First Name)") private WebElement firstNameTextBox;
	@FindBy(name="property(Last Name)") private WebElement lastNameTextBox;
	@FindBy(name="property(Company)") private WebElement companyTextBox;
	@FindBy(xpath = "//td[contains(text(),'Lead Information')]/ancestor::table/preceding-sibling::table//input[@type='submit']")
	private WebElement saveButton;
	@FindBy(name="property(saltName)") private WebElement salutationDropDown;
	
	public CreateNewLeadPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getCompanyTextBox() {
		return companyTextBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createNewLead(String salutationText, String firstname,String lastname, String companyname)
	{
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.selectOption(salutationText, salutationDropDown);
		firstNameTextBox.sendKeys(firstname);
		lastNameTextBox.sendKeys(lastname);
		companyTextBox.sendKeys(companyname);
		saveButton.click();
	}
	
	

}

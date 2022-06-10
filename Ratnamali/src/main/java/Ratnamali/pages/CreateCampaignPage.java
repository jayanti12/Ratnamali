package Ratnamali.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ratnamali.GenericLib.BaseTest;
import Ratnamali.GenericLib.FileLib;
import Ratnamali.GenericLib.WebDriverCommonLib;

public class CreateCampaignPage {
	
	@FindBy(name="property(Campaign Name)") private WebElement campaignNameTextBox;
	@FindBy(name="property(Start Date)") private WebElement startDateTextBox;
	@FindBy(name="property(Expected Revenue)") private WebElement expectedRevenueTextBox;
	@FindBy(name="property(Actual Cost)") private WebElement actualCostTextBox;
	@FindBy(name="property(Type)") private WebElement typeDropDown;
	@FindBy(name="property(Status)") private WebElement statusDropDown;
	@FindBy(name="property(End Date)") private WebElement endDateTextBox;
	@FindBy(name="property(Budgeted Cost)") private WebElement budgetedCostTextBox;
	@FindBy(name="property(Description)") private WebElement descriptionTextBox;
	@FindBy(xpath = "//td[contains(text(),'Description Information')]/ancestor::table[@id='secHead2']/following-sibling::table[@cellspacing='0']//child::input[@type='submit']")
	private WebElement saveButton;
	
	
	public CreateCampaignPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void campaignInformation(String campaignName, String typeText, String statusText, String startDate, String endDate,
			String expectedRevenue, String budgetCost, String actualCost, String description)
	{
		FileLib flib = new FileLib();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		campaignNameTextBox.sendKeys(campaignName);
		wlib.selectOption(typeText,typeDropDown);
		wlib.selectOption(statusText, statusDropDown);
		startDateTextBox.sendKeys(startDate);
		endDateTextBox.sendKeys(endDate);
		expectedRevenueTextBox.sendKeys(expectedRevenue);
		budgetedCostTextBox.sendKeys(budgetCost);
		actualCostTextBox.sendKeys(actualCost);
		descriptionTextBox.sendKeys(description);
	}

	public WebElement getCampaignNameTextBox() {
		return campaignNameTextBox;
	}


	public WebElement getStartDateTextBox() {
		return startDateTextBox;
	}


	public WebElement getExpectedRevenueTextBox() {
		return expectedRevenueTextBox;
	}


	public WebElement getActualCostTextBox() {
		return actualCostTextBox;
	}


	public WebElement getTypeDropDown() {
		return typeDropDown;
	}


	public WebElement getStatusDropDown() {
		return statusDropDown;
	}


	public WebElement getEndDateTextBox() {
		return endDateTextBox;
	}


	public WebElement getBudgetedCostTextBox() {
		return budgetedCostTextBox;
	}


	public WebElement getDescriptionTextBox() {
		return descriptionTextBox;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	
	

}

package Ratnamali.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ratnamali.GenericLib.BaseTest;

public class ReportsPage {
	
	@FindBy(xpath = "//td[text()='Reports']") private WebElement reportsText;
	
	
	public ReportsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getReportsTextAddress() {
		return reportsText;
	}
	
	public String getReportsText() {
		return reportsText.getText();
	}

}

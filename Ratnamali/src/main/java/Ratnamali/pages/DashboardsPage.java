package Ratnamali.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ratnamali.GenericLib.BaseTest;

public class DashboardsPage {
	
	@FindBy(xpath = "//td[text()='Dashboards']") private WebElement dashboardsText;
	
	
	public DashboardsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getDashboardsTextAddress() {
		return dashboardsText;
	}
	
	public String getDashboardsText()
	{
		return dashboardsText.getText();
	}
	

}

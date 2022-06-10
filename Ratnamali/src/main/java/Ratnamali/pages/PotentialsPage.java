package Ratnamali.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ratnamali.GenericLib.BaseTest;

public class PotentialsPage {
	
	@FindBy(xpath = "//td[contains(text(),'Potentials: ')]") private WebElement potentialsText;
	
	
	public PotentialsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getPotentialsTextAddress() {
		return potentialsText;
	}
	
	public String getPotentialsText() {
		return potentialsText.getText();
	}
	

}

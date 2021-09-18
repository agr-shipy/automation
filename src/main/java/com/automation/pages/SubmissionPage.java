package com.automation.pages;


import static com.automation.base.DriverInstance.getDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public  class SubmissionPage {
	public SubmissionPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//div[contains(@class,'alert-success')]")
	public WebElement successAlert;
	
}

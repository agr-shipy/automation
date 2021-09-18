package com.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.base.DriverInstance.getDriver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[@href='#/contact']")
	public WebElement contactPage;

	@FindBy(xpath = "//a[@href='#/shop']")
	public WebElement shopPage;
	
	@FindBy(xpath = "//h1")
	public WebElement headerTitle;

}

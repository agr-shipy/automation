package com.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.automation.base.DriverInstance.getDriver;

import java.util.List;

public class ContactPage {
	public ContactPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[text()='Submit']")
	public WebElement submitBtn;

	@FindBy(xpath = "//input[@id='forename']")
	public WebElement ForeName;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement Email;

	@FindBy(xpath = "//textarea[@id='message']")
	public WebElement Message;

	@FindBy(xpath = "//span[@id='forename-err']")
	public WebElement foreNameValdation;

	@FindBy(xpath = "//span[@id='email-err']")
	public WebElement emailValidation;

	@FindBy(xpath = "//span[@id='message-err']")
	public WebElement messageValidation;

	@FindBy(xpath = "//div[contains(@class,'alert-error')]")
	public WebElement formValidation;
	
	@FindBy(xpath = "//span[@id='forename-err']")
	public List<WebElement> forenameValidationCount;
	
	@FindBy(xpath = "//span[@id='email-err']")
	public List<WebElement> emailValidationCount;
	
	@FindBy(xpath = "//span[@id='message-err']")
	public List<WebElement> messageValidationCount;
	
}
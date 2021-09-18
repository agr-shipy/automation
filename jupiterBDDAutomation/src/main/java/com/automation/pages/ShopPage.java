package com.automation.pages;


import static com.automation.base.DriverInstance.getDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public  class ShopPage {
	public ShopPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//h4[text()='Funny Cow']/..//a")
	public WebElement funnyCow;
	
	@FindBy(xpath = "//h4[text()='Fluffy Bunny']/..//a")
	public WebElement fluffyBunny;
	
	@FindBy(xpath = "//a[@href='#/cart']")
	public WebElement cart;
	
	@FindBy(xpath = "//*[contains(text(),'Funny')]/following-sibling::td[2]/input")
	public WebElement funnyCowCount;
	
	@FindBy(xpath = "//*[contains(text(),'Fluffy')]/following-sibling::td[2]/input")
	public WebElement fluffyBunnyCount;

}

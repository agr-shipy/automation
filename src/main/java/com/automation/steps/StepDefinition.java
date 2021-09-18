package com.automation.steps;


import com.automation.pages.ContactPage;
import com.automation.pages.HomePage;
import com.automation.pages.ShopPage;
import com.automation.pages.SubmissionPage;

import cucumber.api.java.en.*;
import static com.automation.base.CommonUtils.clickOnElement;
import static com.automation.base.CommonUtils.sendKeysTo;
import static com.automation.base.AssertionUtils.assertEquals;
import static com.automation.base.AssertionUtils.assertNotPresent;
import static com.automation.base.AssertionUtils.assertEqualsGetAttribute;

public class StepDefinition {

	ContactPage contactPage = new ContactPage();
	HomePage homePage = new HomePage();
	ShopPage shopPage = new ShopPage();
	SubmissionPage submissionPage = new SubmissionPage();

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		assertEquals(homePage.headerTitle, "Jupiter Toys");
	}

	@Given("^User Navigates to Contact page$")
	public void user_Navigates_to_Contact_page() throws Throwable {
		clickOnElement(homePage.contactPage);
	}

	@When("^I click on Submit button$")
	public void i_click_on_Submit_button() throws Throwable {
		clickOnElement(contactPage.submitBtn);
	}

	@Then("^I get mandatory fields validation$")
	public void i_get_mandatory_fields_validation() throws Throwable {
		assertEquals(contactPage.foreNameValdation, "Forename is required");
		assertEquals(contactPage.emailValidation, "Email is required");
		assertEquals(contactPage.messageValidation, "Message is required");
		assertEquals(contactPage.formValidation,
				"We welcome your feedback - but we won't get it unless you complete the form correctly.");
	}

	@Then("^I enter data in all mandatory fields$")
	public void i_enter_data_in_all_mandatory_fields() throws Throwable {
		sendKeysTo(contactPage.ForeName, "joseph");
		sendKeysTo(contactPage.Email, "joseph.1234@gmail.com");
		sendKeysTo(contactPage.Message, "I am ready to submit");
		clickOnElement(contactPage.submitBtn);
	}

	@Then("^Validate errors are gone$")
	public void validate_errors_are_gone() throws Throwable {
		assertNotPresent(contactPage.forenameValidationCount);
		assertNotPresent(contactPage.emailValidationCount);
		assertNotPresent(contactPage.messageValidationCount);
	}

	@Then("^successful submission message appears$")
	public void successful_submission_message_appears() throws Throwable {
		assertEquals(submissionPage.successAlert, "we appreciate your feedback.");
	}

	@Then("^I enter invalid data in all mandatory fields$")
	public void i_enter_invalid_data_in_all_mandatory_fields() throws Throwable {
		sendKeysTo(contactPage.ForeName, " ");
		sendKeysTo(contactPage.Email, "joseph .com");
		sendKeysTo(contactPage.Message, " ");
		clickOnElement(contactPage.submitBtn);
	}

	@Then("^I get validation errors$")
	public void i_get_validation_errors() throws Throwable {
		assertEquals(contactPage.foreNameValdation, "Forename is required");
		assertEquals(contactPage.emailValidation, "Please enter a valid email");
		assertEquals(contactPage.messageValidation, "Message is required");
		assertEquals(contactPage.formValidation,
				"We welcome your feedback - but we won't get it unless you complete the form correctly.");
	}

	@And("^User Navigates to Shop page$")
	public void User_Navigates_to_Shop_page() throws Throwable {
		clickOnElement(homePage.shopPage);
	}

	@And("^User clicks on Buy button to add items$")
	public void User_clicks_on_Buy_button_to_add_items() throws Throwable {
		clickOnElement(shopPage.funnyCow);
		clickOnElement(shopPage.funnyCow);
		clickOnElement(shopPage.fluffyBunny);
		clickOnElement(shopPage.cart);
	}

	@Then("^Verify the items in the cart$")
	public void Verify_the_items_in_the_cart() throws Throwable {

		assertEqualsGetAttribute(shopPage.funnyCowCount, "value", "2");
		assertEqualsGetAttribute(shopPage.fluffyBunnyCount, "value", "1");

	}

}

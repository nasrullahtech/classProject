package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import pageObjects.LoginPageObject;
import utilities.UtilityClass;

public class LoginStepDefinitions extends Base {

	LoginPageObject LogPageObject = new LoginPageObject();

	@Given("user is on Retail website")
	public void user_is_on_retail_website() {
		String actualPageTitile = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitile);
		logger.info("Actual Title is matching with expected title");
		UtilityClass.takeScreenShot();

	}

	@When("user click on Myaccount")
	public void user_click_on_myaccount() {
		LogPageObject.clickOnMyAccount();
		logger.info("User clicked on my account");
		UtilityClass.takeScreenShot();

	}

	@And("User click on Login")
	public void user_click_on_login() {
		LogPageObject.clickOnLogin();
		logger.info("User clicked on login");
		UtilityClass.takeScreenShot();


	}
	
	
	@When("User enter email {string} and password {string}")
	public void user_enter_email_and_password_hawks(String string) {
		LogPageObject.enterEmailAndPassword(string, string);
	   
		


	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		LogPageObject.clickOnLoginButton();
		logger.info("User clicked on login Button");
		UtilityClass.takeScreenShot();

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		LogPageObject.myAccountTextisPresent();
		Assert.assertTrue(LogPageObject.myAccountTextisPresent());
		logger.info("User is able to see the myaccount text.");
		UtilityClass.takeScreenShot();

		

	}
	
	
	
}

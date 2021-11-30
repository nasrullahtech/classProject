//package stepDefinitions;
//
//import org.junit.Assert;
//
//import core.Base;
//import io.cucumber.java.en.*;
//import pageObjects.LoginPageObject;
//
//public class StepDefinitions extends Base {
//	
//	LoginPageObject loginPageObject = new LoginPageObject();
//
//	@Given("^user is on Retail website$")
//	public void user_is_on_Retail_website() {
//		String actualPageTitile = driver.getTitle();
//		String expectedPageTitle = "TEK SCHOOL";
//		// Assertion is to verify actual meets the expected
//		// if actual does not equals to expected value then execution will stop
//		// and test step will fail.
//		Assert.assertEquals(expectedPageTitle, actualPageTitile);
//		logger.info("Actual Title is matching with expected title");
//	}
//
//	@When("^user click on Myaccount$")
//	public void user_click_on_Myaccount() {
//		loginPageObject.clickOnMyAccount();
//		logger.info("user clicked on MyAccount");
//
//	}
//
//	@And("^user click on Login option$")
//	public void user_click_on_Login_option() {
//		loginPageObject.clickOnLogin();
//		logger.info("user clicked on Login Option");
//	}
//
//	@And("^user enter userName '(.+)' and password '(.+)'$")
//	public void user_enter_userName_and_password(String uName, String pass) {
//		loginPageObject.enterEmailAndPassword(uName, pass);
//		logger.info("user Enter " + uName + "and password " + pass);
//	}
//
//	@And("^user click on Login Button$")
//	public void user_click_login_Button() {
//		loginPageObject.clickOnLoginButton();
//		logger.info("user clicked on Login Button");
//	}
//
//	@Then("^user should be logged in to Myaccount dashboard$")
//	public void user_should_be_logged_in_to_Myaccount_dashbaord() {
//		// if MyAccountText is present it will pass
//		// if myAccountText is not present or displayed it will fail
//		Assert.assertTrue(loginPageObject.myAccountTextisPresent());
//		logger.info("user is logged in to MyAccount Dashboard");
//	}
//
//}

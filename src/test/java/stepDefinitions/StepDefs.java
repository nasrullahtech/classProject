//package stepDefinitions;
//
//import core.Base;
//import io.cucumber.java.en.*;
//import pageObjects.LoginPageObject;
//
//public class StepDefs extends Base{
//	
//	LoginPageObject pageObject = new LoginPageObject();
//	
//	@Given("user is on Retail website")
//	public void user_is_on_retail_website() {
//		pageObject.myAccountTextisPresent();
//	   
//	}
//	@When("user click on Myaccount")
//	public void user_click_on_myaccount() {
//		pageObject.clickOnMyAccount();
//	 
//	}
//	@When("user click on Login option")
//	public void user_click_on_login_option() {
//		pageObject.clickOnLogin();
//
//	}
//	@When("user enter userName {string} and password {string}")
//	public void user_enter_user_name_and_password(String uName, String pass) {
//		pageObject.enterEmailAndPassword(uName, pass);
//	  
//	}
//	@When("user click on Login Button")
//	public void user_click_on_login_button() {
//		pageObject.clickOnLoginButton();
//	  
//	}
//	@Then("user should be logged in to Myaccount dashboard")
//	public void user_should_be_logged_in_to_myaccount_dashboard() {
//	  
//	}
//
//
//}

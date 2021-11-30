//package stepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//
//import core.Base;
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.*;
//import pageObjects.RegisterAsAffiliatePageObject;
//import utilities.UtilityClass;
//
//public class RegisterAsAffiliateStepDefinitions extends Base {
//
//	RegisterAsAffiliatePageObject affiliatePageObject = new RegisterAsAffiliatePageObject();
//
//	@Given("User is on Retail website")
//	public void user_is_on_retail_website() {
//		String acturalPageTitle = driver.getTitle();
//		String expectedPageTitle = "TEK SCHOOL";
//		Assert.assertEquals(acturalPageTitle, expectedPageTitle);
//		logger.info("The actual Page Title matches the expected one");
//		System.out.println(expectedPageTitle);
//		UtilityClass.takeScreenShot();
//	}
//
//	@When("User click on ‘Register for an Affiliate Account’ link")
//	public void user_click_on_register_for_an_affiliate_account_link() {
//		affiliatePageObject.clickOnAffiliate();
//
//	}
//
//	@And("User sees the affiliate account page")
//	public void user_sees_the_affiliate_account_page() {
//		affiliatePageObject.affiliateProgramTextIsPresent();
//
//	}
//
//	@And("User clicks on Continue button under New Affiliate")
//	public void user_clicks_on_continue_button_under_new_affiliate() {
//		affiliatePageObject.clickOnFarwardButton();
//
//	}
//
//	@When("User fill affiliate form with below information")
//	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
//		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
//		affiliatePageObject.enterFirstName(info.get(0).get("firstName"));
//		affiliatePageObject.enterLastName(info.get(0).get("lastName"));
//		affiliatePageObject.enterEmail(info.get(0).get("email"));
//		affiliatePageObject.enterPhone(info.get(0).get("telephone"));
//		affiliatePageObject.enterCompany(info.get(0).get("company"));
//		affiliatePageObject.enterWebsite(info.get(0).get("website"));
//		affiliatePageObject.enterTaxId(info.get(0).get("taxID"));
////		affiliatePageObject.chequeIsSelected(info.get(0).get("cheque")
//		
//		
//		
//
////		List<Map<String, String>> info = dataTable.asMaps(String.class,String.class);
////		reviewPageObject.enteryourtName(info.get(0).get("yourname"));
////		reviewPageObject.enteryourReview(info.get(0).get("yourReview"));
////		reviewPageObject.enterRating(info.get(0).get("Rating"));
////		logger.info("User did enter the requested info" + info.toString());
////		UtilityClass.takeScreenShot();
////	}
////
//	}
//	@And("User selects cheque as the paymnet method")
//	public void user_selects_cheque_as_the_paymnet_method() {
//		affiliatePageObject.chequeIsSelected();
//
//	}
//
//	@And("User enters name")
//	public void user_enters_name() {
//		affiliatePageObject.enterPayeeName("Alex");
//
//	}
//
//	@And("User enters password")
//	public void user_enters_password() {
//		affiliatePageObject.enterPassword("password");
//
//	}
//
//	@And("User confirms password")
//	public void user_confirms_password() {
//		affiliatePageObject.enterPasswordConfirm("password");
////		String actualPassword = "Tek@2021";
////		String expectedPassword = "Tek@2021";
////		Assert.assertEquals(actualPassword, expectedPassword);
//
//	}
//
//	@And("User check on About us check box")
//	public void user_check_on_about_us_check_box() {
//		affiliatePageObject.selectaboutUsButton();
//
//	}
//
//	@And("User click on Continue button")
//	public void user_click_on_continue_button() {
//		affiliatePageObject.clickOncontiueButton();
//
//	}
//
//	@Then("User should see a success message")
//	public void user_should_see_a_success_message() {
//		affiliatePageObject.getSuccessMessage();
//
//	}
//}

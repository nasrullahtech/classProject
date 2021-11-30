//package stepDefinitions;
//
//
//
//import java.util.List;
//import java.util.Map;
//
//import org.junit.Assert;
//
//import core.Base;
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.LeavingReviewPageObject;
//import utilities.UtilityClass;
//
//public class ReviewStepDefinitions extends Base {
//
//	LeavingReviewPageObject reviewPageObject = new LeavingReviewPageObject();
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
//	@When("User click on Desktops tab")
//	public void user_click_on_desktops_tab() {
//		reviewPageObject.clickOnDesktops();
//		logger.info("user did click on the desktops");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@And("User click on Show all desktops")
//	public void user_click_on_show_all_desktops() {
//		reviewPageObject.clickOnshowAll();
//		logger.info("user did click on show all");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@And("User click on Canon EOS 5D item")
//	public void user_click_on_canon_eos_5d_item() {
//		reviewPageObject.openThePage();
//		logger.info("User did open the page");
//		UtilityClass.takeScreenShot();
//	}
//
//	@And("User click on write a review link")
//	public void user_click_on_write_a_review_link() {
//		reviewPageObject.clickOnwriteAReview();
//		logger.info("User did click on the write review");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@And("user fill the review information with below information")
//	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
//		
//		List<Map<String, String>> info = dataTable.asMaps(String.class,String.class);
//		reviewPageObject.enteryourtName(info.get(0).get("yourname"));
//		reviewPageObject.enteryourReview(info.get(0).get("yourReview"));
//		reviewPageObject.enterRating(info.get(0).get("Rating"));
//		logger.info("User did enter the requested info" + info.toString());
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@And("User click on Continue Button")
//	public void user_click_on_continue_button() {
//		reviewPageObject.clickOnContinue();
//		logger.info("User did click on the continue button");
//		UtilityClass.takeScreenShot();
//
//		
//
//	}
//
//	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
//	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
//		reviewPageObject.sucessMessage();
//		logger.info(" Thank you for your review. It has been submitted to the webmaster for approval");
//		UtilityClass.takeScreenShot();
//
//		
//		
//
//	}
//
//}

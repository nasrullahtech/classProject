//package stepDefinitions;
//
//import org.junit.Assert;
//
//import core.Base;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.CartPageObject;
//import utilities.UtilityClass;
//
//public class CartStepDefinitions extends Base {
//
//	CartPageObject cartPageObject = new CartPageObject();
//
//	@Given("User is on Retail website")
//	public void user_is_on_retail_website() {
//		String acturalPageTitle = driver.getTitle();
//		String expectedPageTitle = "TEK SCHOOL";
//		Assert.assertEquals(acturalPageTitle, expectedPageTitle);
//		logger.info("The actual Page Title matches the expected one");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@When("User click on Desktops tab")
//	public void user_click_on_desktops_tab() {
//		cartPageObject.clickDesktops();
//		logger.info("user did click on the desktops");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@And("User click on Show all desktops")
//	public void user_click_on_show_all_desktops() {
//		cartPageObject.clickOnShowAll();
//		logger.info("user did click on show all");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@And("User click  ADD TO CART option on ‘HP LP3065’ item")
//	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
//		cartPageObject.clickOnCart();
//		logger.info("User did click on cart");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@And("User select quantity {int}")
//	public void user_select_quantity(Integer quantity) {
//		cartPageObject.clickOnCart();
//		logger.info("User entered quamtity");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@And("User click add to Cart button")
//	public void user_click_add_to_cart_button() {
//		cartPageObject.addToCart();
//		logger.info("User added to car");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
//	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
//		cartPageObject.successMessage();
//		UtilityClass.takeScreenShot();
//
//	}
//
//}

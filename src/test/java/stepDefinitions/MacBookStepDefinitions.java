//package stepDefinitions;
//
//import org.junit.Assert;
//
//import core.Base;
//import io.cucumber.java.en.*;
//import pageObjects.MacBookPageObject;
//import utilities.UtilityClass;
//
//public class MacBookStepDefinitions extends Base {
//
//	MacBookPageObject MacPageObject = new MacBookPageObject();
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
//	@When("User click on Laptop &NoteBook tab")
//	public void user_click_on_laptop_note_book_tab() {
//		MacPageObject.clickOnLaptops();
//		logger.info("Step 1");
//		UtilityClass.takeScreenShot();
//
//
//	}
//
//	@When("User click on Show all Laptop &NoteBook option")
//	public void user_click_on_show_all_laptop_note_book_option() {
//		MacPageObject.clickOnShowAll();
//		logger.info("Step 2");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@When("User click on MacBook  item")
//	public void user_click_on_mac_book_item() {
//		MacPageObject.clickOnMacBook();
//		logger.info("Step 3");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@When("User click add to Cart button")
//	public void user_click_add_to_cart_button() {
//		MacPageObject.clickOnAddToCart();
//		logger.info("Step 4");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
//	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
//		MacPageObject.successMessage();
//		logger.info("Step 5");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@Then("User should see ‘{int} tem\\(s){double}’ showed to the cart")
//	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
//		MacPageObject.itemPresent();
//		logger.info("Step 6");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@Then("User click on cart option")
//	public void user_click_on_cart_option() {
//		MacPageObject.clickOnCartTotal();
//		logger.info("Step 7");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@Then("user click on red X button to remove the item from cart")
//	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
//		MacPageObject.clickOnremoveButton();
//		logger.info("Step 8");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
//	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
//		MacPageObject.emptyCartPresent();
//		logger.info("Step 9");
//		UtilityClass.takeScreenShot();
//
//	}
//
//}

//package stepDefinitions;
//
//import org.junit.Assert;
//
//import core.Base;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.*;
//import io.cucumber.java.en.When;
//import pageObjects.WishlistPageObject;
//import utilities.UtilityClass;
//
//public class WishListStepDefinitions extends Base {
//
//	WishlistPageObject wishPageObject = new WishlistPageObject();
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
//		wishPageObject.clickOnLaptops();
//		logger.info("Step 1");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@And("User click on Show all Laptop &NoteBook option")
//	public void user_click_on_show_all_laptop_note_book_option() {
//		wishPageObject.clickOnShowAll();
//		logger.info("Step 2");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
//	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
//		wishPageObject.ClickOnAddToWishList();
//		logger.info("Step 3");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
//	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
//		wishPageObject.alertMessageIsPresent();
//		String actualAlertMessage = "You must login or create an account to save Sony VAIO to your wish list!";
//		String expectedAlertMessage = "You must login or create an account to save Sony VAIO to your wish list!";
//		Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
//		logger.info("The actual alert message matches the expected one");
//		System.out.println(actualAlertMessage);
//		logger.info("Step 4");
//		UtilityClass.takeScreenShot();
//
//	}
//
//}

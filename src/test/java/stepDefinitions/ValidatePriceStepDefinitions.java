//package stepDefinitions;
//
//import org.junit.Assert;
//
//import core.Base;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.*;
//import io.cucumber.java.en.When;
//import pageObjects.ValidatePricePageObject;
//import utilities.UtilityClass;
//
//public class ValidatePriceStepDefinitions extends Base {
//
//	ValidatePricePageObject pricePageObject = new ValidatePricePageObject();
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
//		pricePageObject.clickOnLaptops();
//		logger.info("Step 1");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@And("User click on Show all Laptop &NoteBook option")
//	public void user_click_on_show_all_laptop_note_book_option() {
//		pricePageObject.clickOnShowAll();
//		logger.info("Step 2");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@And("User click on ‘MacBook Pro’ item")
//	public void user_click_on_mac_book_pro_item() {
//		pricePageObject.clickOnMacBookPro();
//		logger.info("Step 3");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@Then("User should see  ‘${double}’ price tag is present on UI.")
//	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
//		pricePageObject.priceTagIsPresent();
//		String actualPriceTage = "2000";
//		String expectedPriceTag = "2000";
//		Assert.assertEquals(actualPriceTage, expectedPriceTag);
//		logger.info("actualPriceTag = ExpectedPriceTag");
//		System.out.println(expectedPriceTag);
//		UtilityClass.takeScreenShot();
//
//	}
//
//}

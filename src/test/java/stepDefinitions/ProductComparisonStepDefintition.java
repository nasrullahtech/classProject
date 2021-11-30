//package stepDefinitions;
//
//import org.junit.Assert;
//
//import core.Base;
//import io.cucumber.java.en.*;
//import io.cucumber.java.en.When;
//import pageObjects.ProductComparisonPageObjects;
//import utilities.UtilityClass;
//
//public class ProductComparisonStepDefintition extends Base {
//	
//	ProductComparisonPageObjects comparisonPageObject = new ProductComparisonPageObjects();	
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
//		comparisonPageObject.clickOnLaptops();
//		logger.info("Step 1");
//		UtilityClass.takeScreenShot();
//
//
//	}
//
//	@And("User click on Show all Laptop &NoteBook option")
//	public void user_click_on_show_all_laptop_note_book_option() {
//		comparisonPageObject.clickOnShowAll();
//		logger.info("Step 2");
//		UtilityClass.takeScreenShot();
//}
//	
//	@And("User click on product comparison icon on ‘MacBook’")
//	public void user_click_on_product_comparison_icon_on_mac_book() {
//		comparisonPageObject.clickOnCompareMac();
//		logger.info("Step 3");
//		UtilityClass.takeScreenShot();
//
//	   
//	}
//
//	@And("User click on product comparison icon on ‘MacBook Air")
//	public void user_click_on_product_comparison_icon_on_mac_book_air() {
//		comparisonPageObject.clickOnCompareMacAir();
//		logger.info("Step 4");
//		UtilityClass.takeScreenShot();
//
//	 
//	}
//
//	@And("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
//	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
//		comparisonPageObject.successMessageIsPresent();
//		logger.info("Step 5");
//		UtilityClass.takeScreenShot();
//
//
//	 
//	}
//
//	@And("User click on Product comparison link")
//	public void user_click_on_product_comparison_link() {
//		comparisonPageObject.clickOnProductCompare();
//		logger.info("Step 6");
//		UtilityClass.takeScreenShot();
//
//
//	}
//
//	@Then("User should see Product Comparison Chart")
//	public void user_should_see_product_comparison_chart() {
//		comparisonPageObject.comparisobChartIsPresent();
//		logger.info("Step 7");
//		UtilityClass.takeScreenShot();
//
//
//	   
//	}
//}

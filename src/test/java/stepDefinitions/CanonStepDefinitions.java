//package stepDefinitions;
//
//import org.junit.Assert;
//
//import core.Base;
//import io.cucumber.java.en.*;
//import pageObjects.CanonPageObject;
//import utilities.UtilityClass;
//
//public class CanonStepDefinitions extends Base{
//	
//	CanonPageObject canonPageObject = new CanonPageObject();
//	
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
//		canonPageObject.clickOnDesktops();
//		logger.info("user did click on the desktops");
//		UtilityClass.takeScreenShot();
//
//	}
//
//	@And("User click on Show all desktops")
//	public void user_click_on_show_all_desktops() {
//		canonPageObject.clickOnshowAll();
//		logger.info("user did click on show all");
//		UtilityClass.takeScreenShot();
//
//}
//	
//	@And("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
//	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
//		canonPageObject.clickOnaddToCart();
//		logger.info("User added to cart");
//		UtilityClass.takeScreenShot();
//
//	   
//	}
//
//	@And("User select color from dropdown ‘Red’")
//	public void user_select_color_from_dropdown_red() {
//		canonPageObject.chooseRedColor();
//		logger.info("user picked the color");
//		UtilityClass.takeScreenShot();
//
//	   
//	}
//
//	@And("User select quantity {int}")
//	public void user_select_quantity(Integer quantity) {
//		canonPageObject.Clickselect();
//		logger.info("user picked the quantity");
//		UtilityClass.takeScreenShot();
//
//	 
//	}
//
//	@And("User click add to Cart button")
//	public void user_click_add_to_cart_button() {
//		canonPageObject.clicktoCart();
//		logger.info("user clicked on the add to cart");
//		UtilityClass.takeScreenShot();
//
//		
//	  
//	}
//
//	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
//	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
//			canonPageObject.successMessage();
//			logger.info("user can see the success message");
//			UtilityClass.takeScreenShot();
//
//			
//
//	}
//
//	}

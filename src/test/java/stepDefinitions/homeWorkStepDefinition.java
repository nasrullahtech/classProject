//package stepDefinitions;
//
//import org.junit.Assert;
//
//import core.Base;
//import io.cucumber.java.en.*;
//import pageObjects.HomeworkPageObject;
//
//public class homeWorkStepDefinition extends Base  {
//	
//	HomeworkPageObject homeworkPageObject = new HomeworkPageObject();
//
//	
//	@Given("User is on Retail website")
//	public void user_is_on_retail_website() {
//		System.out.println("Step One");
//		String actualPageTitle = driver.getTitle();
//		String expectedPageTitle = "TEK SCHOOL";
//		Assert.assertEquals(actualPageTitle, expectedPageTitle);
//		logger.info("Actual Title is Matching with Expected Title");
////		UtilityClass.takeScreenShot();
//		
//	  
//	}
//	@When("User click on Desktops tab")
//	public void user_click_on_desktops_tab() {
//		homeworkPageObject.clickDesktops();
//		logger.info("user clicked on desktops");
//		
//		
//System.out.println("Step Two");
//		
//		}
//
//
//	@And("User click on Show all desktops")
//	public void user_click_on_show_all_desktops() {
//		homeworkPageObject.clickOnShowAll();
//		logger.info("user clicked on show all desktops");
//		System.out.println("Step Three");
//	 
//	}
//	@Then("User should see all items are present in Desktop page")
//	public void user_should_see_all_items_are_present_in_desktop_page() {
//		homeworkPageObject.categoryDescriptionPresent();
//		logger.info("user could see all items present in the desktop page");
//		System.out.println("Step Four");
//		
//
//	  
//	}
//
//}

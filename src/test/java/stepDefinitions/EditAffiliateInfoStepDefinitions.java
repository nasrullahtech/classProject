package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.EditAffiliateInfoPageObject;
import utilities.UtilityClass;

public class EditAffiliateInfoStepDefinitions extends Base {

	EditAffiliateInfoPageObject affilaiteInfoPage = new EditAffiliateInfoPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String acturalPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(acturalPageTitle, expectedPageTitle);
		logger.info("The actual Page Title matches the expected one");
		System.out.println(expectedPageTitle);
		UtilityClass.takeScreenShot();
		
	}

	@When("User clicks on  Affiliate Account link")
	public void user_clicks_on_affiliate_account_link() {
		affilaiteInfoPage.clickOnAffiliateLink();
		logger.info(" User did click on the affiliate accountlink");
		UtilityClass.takeScreenShot();


	}

	@When("User enters email {string}")
	public void user_enters_email(String string) {
		affilaiteInfoPage.enterEmail("alexjones3232@gmail.com");
		logger.info("User did enter the email address");
		UtilityClass.takeScreenShot();

	    
	}

	@When("User enters password {string}")
	public void user_enters_password(String string) {
		affilaiteInfoPage.enterPassword("Tek@2021");
		logger.info("User did enter the password");
		UtilityClass.takeScreenShot();

		
	   

	}

	@And("User clicks on login")
	public void user_clicks_on_login() {
		affilaiteInfoPage.clickOnLogin();
		logger.info("User did click on the login");
		UtilityClass.takeScreenShot();


	}

	@And("User clicks on ‘Edit your affiliate informationlink")
	public void user_clicks_on_edit_your_affiliate_informationlink() {
		affilaiteInfoPage.clickOnEditAffiliateInfo();
		logger.info("User did click on the edit your affiliate informationlink");
		UtilityClass.takeScreenShot();


	}

	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		affilaiteInfoPage.SelectbankPaymentMethod();
		logger.info("User did click on Bank Transfer radio button" );
		UtilityClass.takeScreenShot();


	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {

		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		affilaiteInfoPage.enterbankName(info.get(0).get("bankName"));
		affilaiteInfoPage.enterBranchNumber(info.get(0).get("abaNumber"));
		affilaiteInfoPage.enterSwiftCode(info.get(0).get("swiftCode"));
		affilaiteInfoPage.enterAccountName(info.get(0).get("accountName"));
		affilaiteInfoPage.enterAccountNumber(info.get(0).get("accountNumber"));
		logger.info("User did fill the Bank information with above information");
		UtilityClass.takeScreenShot();


	}
	
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		affilaiteInfoPage.clickOnContinueButton();
		logger.info("User did click on Continue button");
		UtilityClass.takeScreenShot();

	 
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		affilaiteInfoPage.successMessageIspresent();
		logger.info("User can see the success message");
		UtilityClass.takeScreenShot();

	}

}

package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class EditAffiliateInfoPageObject extends Base {

	public EditAffiliateInfoPageObject() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[contains(text(),'Affiliate')]")
	private WebElement affiliateLink;
	@FindBy(id = "input-email")
	private WebElement email;
	@FindBy(id = "input-password")
	private WebElement password;
	@FindBy(xpath = "//input[@Value = 'Login']")
	private WebElement login;
	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement editAffiliateInfo;
	@FindBy(xpath = "//input[@Value= 'bank']")
	private WebElement bankPaymentMethod;
	@FindBy(id = "input-bank-name")
	private WebElement bankName;
	@FindBy(id = "input-bank-branch-number")
	private WebElement branchNumber;
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;
	@FindBy(id = "input-bank-account-name")
	private WebElement accountName;
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumber;
	@FindBy(xpath = "//input[@Value= 'Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//*[@id=\"account-account\"]/div[1]")
	private WebElement successMessage;

	public void clickOnAffiliateLink() {
		affiliateLink.click();
	}

	public void enterEmail(String e_mail) {
		email.sendKeys(e_mail);

	}

	public void enterPassword(String passwordValue) {
		password.sendKeys(passwordValue);
	}

	public void clickOnLogin() {
		login.click();

	}

	public void clickOnEditAffiliateInfo() {
		editAffiliateInfo.click();
	}

	public void SelectbankPaymentMethod() {
		bankPaymentMethod.isSelected();
	}

	public void enterbankName(String bank) {
		bankName.sendKeys(bank);

	}

	public void enterBranchNumber(String branchNumberValue) {
		branchNumber.sendKeys(branchNumberValue);

	}

	public void enterSwiftCode(String swiftCodeValue) {
		swiftCode.sendKeys(swiftCodeValue);
	}

	public void enterAccountName(String acctName) {
		accountName.sendKeys(acctName);

	}

	public void enterAccountNumber(String accountNumberValue) {
		accountNumber.sendKeys(accountNumberValue);

	}

	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public void successMessageIspresent() {
		successMessage.isDisplayed();
	}
}

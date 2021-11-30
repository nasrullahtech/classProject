//package pageObjects;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import core.Base;
//
//public class RegisterAsAffiliatePageObject extends Base {
//
//	public RegisterAsAffiliatePageObject() {
//
//		PageFactory.initElements(driver, this);
//
//	}
//
//	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
//	private WebElement title;
//	@FindBy(xpath = "//a[contains(text(),'Affiliate')]")
//	private WebElement affiliate;
//	@FindBy(xpath = "//h1[contains(text(),'Affiliate Program')]")
//	private WebElement affiliateProgramText;
//	@FindBy(xpath = "//a[contains(text(),'Continue')]")
//	private WebElement forwardButton;
//	@FindBy(id = "input-firstname")
//	private WebElement firstName;
//	@FindBy(id = "input-lastname")
//	private WebElement lastName;
//	@FindBy(id = "input-email")
//	private WebElement email;
//	@FindBy(id = "input-telephone")
//	WebElement phone;
//	@FindBy(id = "input-company")
//	private WebElement company;
//	@FindBy(id = "input-website")
//	private WebElement website;
//	@FindBy(id = "input-tax")
//	private WebElement taxId;
//	@FindBy(xpath = "//input[@Value= 'cheque']")
//	private WebElement cheque;
//	@FindBy(xpath = "//input[@id='input-cheque']")
//	private WebElement payeeName;
//	@FindBy(xpath = "//input[@id='input-password']")
//	private WebElement password;
//	@FindBy(xpath = "//input[@id='input-confirm']")
//	private WebElement confirmPassword;
//	@FindBy(xpath = "//input[@Name= 'agree']")
//	private WebElement aboutUsButton;
//	@FindBy(xpath = "//input[@Value= 'Continue']")
//	private WebElement contiueButton;
//	@FindBy(xpath = "//p[contains(text(),'Congratulations! Your new account has been success')]")
//	private WebElement successMessage;
//
//	public boolean titlePresent() {
//		if (title.isDisplayed())
//			return true;
//		else
//			return false;
//
//	}
//
//	public void clickOnAffiliate() {
//		affiliate.click();
//	}
//
//	public void affiliateProgramTextIsPresent() {
//		affiliateProgramText.isDisplayed();
//	}
//
//	public void clickOnFarwardButton() {
//		forwardButton.click();
//
//	}
//
//	public void enterFirstName(String fName) {
//		firstName.sendKeys(fName);
//	}
//
//	public void enterLastName(String lName) {
//		lastName.sendKeys(lName);
//	}
//
//	public void enterEmail(String e_mail) {
//		email.sendKeys(e_mail);
//
//	}
//
//	public void enterPhone(String phoneValue) {
//		phone.sendKeys(phoneValue);
//
//	}
//
//	public void enterCompany(String companyName) {
//		company.sendKeys(companyName);
//
//	}
//
//	public void enterWebsite(String websiteUrl) {
//		website.sendKeys(websiteUrl);
//	}
//
//	public void enterTaxId(String taxIdValue) {
//		taxId.sendKeys(taxIdValue);
//
//	}
//
//	public void chequeIsSelected() {
//		cheque.isSelected();
//		
//
//	}
//
//	public void enterPayeeName(String fName) {
//		payeeName.sendKeys(fName);
//
//	}
//
//	public void enterPassword(String passwordValue) { 
//		password.sendKeys(passwordValue);
//	}
//
//	public void enterPasswordConfirm(String PasswordConfirmValue) {
//		confirmPassword.sendKeys(PasswordConfirmValue);
//		
//
//	}
//
//
//	
//	public void selectaboutUsButton() {
//		aboutUsButton.click();
//
//	}
//
//	public void clickOncontiueButton() {
//		contiueButton.click();
//	}
//
//	public String getSuccessMessage() {
//		return successMessage.getText();
//
//	}
//
//}

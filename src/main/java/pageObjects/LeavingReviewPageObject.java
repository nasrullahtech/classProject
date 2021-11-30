package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LeavingReviewPageObject extends Base {

	public LeavingReviewPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement title;

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktops;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAll;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
	private WebElement page;

	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement writeAReview;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement yourName;

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement yourReview;

	@FindBy(xpath = "//input[@value= \"5\"]")
	private WebElement rating;

	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButton;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
	private WebElement sucessMessage;

	public boolean titlePresent() {
		if (title.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnDesktops() {
		desktops.click();
	}

	public void clickOnshowAll() {
		showAll.click();

	}

	public void openThePage() {
		page.click();

	}

	public void clickOnwriteAReview() {
		writeAReview.click();
	}

	public void enteryourtName(String yName) {
		yourName.sendKeys(yName);

	}

	public void enteryourReview(String Yreview) {
		yourReview.sendKeys(Yreview);

	}

	public void enterRating(String ratingValue) {
		rating.click();
	}

	public void clickOnContinue() {
		continueButton.click();

	}

	public void sucessMessage() {
		sucessMessage.isDisplayed();

	}

}

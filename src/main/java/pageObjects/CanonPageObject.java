package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CanonPageObject extends Base {

	public CanonPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement title;

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktops;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAll;

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement addToCart;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")
	private WebElement select;

	@FindBy(xpath = "//option[contains(text(),'Red')]")
	private WebElement color;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantity;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement toCart;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMessage;

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

	public void clickOnaddToCart() {
		addToCart.click();
	}

	public void Clickselect() {
		select.click();
	}

	public void chooseRedColor() {
		color.click();
	}

	public void enterQuantity(String quantityValue) {
		quantity.sendKeys(quantityValue);
	}

	public void clicktoCart() {
		toCart.click();
	}

	public boolean successMessage() {
		if (successMessage.isDisplayed())
			return true;
		else
			return false;

	}
}

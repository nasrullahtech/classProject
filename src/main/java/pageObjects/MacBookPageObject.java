//package pageObjects;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import core.Base;
//
//public class MacBookPageObject extends Base {
//
//	public MacBookPageObject() {
//
//		PageFactory.initElements(driver, this);
//	}
//
//	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
//	private WebElement title;
//	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
//	private WebElement laptops;
//	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
//	private WebElement showAll;
//	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
//	private WebElement macBook;
//	@FindBy(xpath = "//button[@id='button-cart']")
//	private WebElement cart;
//	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
//	private WebElement successMessage;
//	@FindBy(xpath = "//h2[contains(text(),'$602.00')]")
//	private WebElement item;
//	@FindBy(xpath = "//span[@id='cart-total']")
//	private WebElement cartTotal;
//	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]/i[1]")
//	private WebElement removeButton;
//	@FindBy(xpath = "//span[@id='cart-total']")
//	private WebElement emptyCart;
//
//	public boolean titlePresent() {
//		if (title.isDisplayed())
//			return true;
//		else
//			return false;
//
//	}
//
//	public void clickOnLaptops() {
//		laptops.click();
//	}
//
//	public void clickOnShowAll() {
//		showAll.click();
//	}
//
//	public void clickOnMacBook() {
//		macBook.click();
//	}
//
//	public void clickOnAddToCart() {
//		cart.click();
//	}
//
//	public void successMessage() {
//		successMessage.isDisplayed();
//
//	}
//
//	public void itemPresent() {
//		item.isDisplayed();
//	}
//
//	public void clickOnCartTotal() {
//		cartTotal.click();
//	}
//
//	public void clickOnremoveButton() {
//		removeButton.click();
//	}
//
//	public void emptyCartPresent() {
//		emptyCart.isDisplayed();
//	}
//
//}

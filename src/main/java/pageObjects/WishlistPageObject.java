//package pageObjects;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import core.Base;
//
//public class WishlistPageObject extends Base {
//	
//	public WishlistPageObject() {
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
//	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]/i")
//	private WebElement wishlist;
//    @FindBy(xpath = "//body/div[@id='product-category']/div[1]")
//    private WebElement alertMessage;
//    
//    public boolean titlePresent() {
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
//	public void ClickOnAddToWishList() {
//		wishlist.click();
//	}
//	
//	public void alertMessageIsPresent() {
//		alertMessage.isDisplayed();
//	}
//	
//	
//	
//	
//	
//
//}

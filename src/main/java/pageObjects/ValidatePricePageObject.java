package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ValidatePricePageObject extends Base {
	
	public ValidatePricePageObject (){
		
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement title;
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement laptops;
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAll;
	@FindBy (css = "body:nth-child(2) div.container:nth-child(4) > ul.breadcrumb")
	private WebElement macBookPro;
	@FindBy (xpath ="//h2[contains(text(),'$2,000.00')]")
	private WebElement priceTag;
	
	public boolean titlePresent() {
		if (title.isDisplayed())
			return true;
		else
			return false;

	}

	public void clickOnLaptops() {
		laptops.click();
	}

	public void clickOnShowAll() {
		showAll.click();
	}
	
	public void clickOnMacBookPro() {
		macBookPro.click();
	}
	
	public void priceTagIsPresent() {
		macBookPro.isDisplayed();
	}
	
	

}

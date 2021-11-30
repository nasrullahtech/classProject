package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomeworkPageObject extends Base {
	
	public HomeworkPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath= "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement title;
	
	@FindBy(xpath= "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktops;
	
	@FindBy(xpath= "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAll;
	@FindBy(xpath= "//p[contains(text(),'Example of category description text')]")
	private WebElement categoryDescription;
	
	public boolean titlePresent() {
		
		if (title.isDisplayed())
			return true;
			else 
				return false;
		}
	
	public void clickDesktops() {
		desktops.click();
	}
	
	public void clickOnShowAll() {
		showAll.click();
		
		
	}
	public boolean categoryDescriptionPresent() {
		if (categoryDescription.isDisplayed())
			return true;
		else
			return false;
	}
}
	


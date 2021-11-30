//package pageObjects;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import core.Base;
//
//public class ProductComparisonPageObjects extends Base {
//	
//	public ProductComparisonPageObjects(){
//		
//		PageFactory.initElements(driver, this);
//		
//	}
//	
//	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
//	private WebElement title;
//	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
//	private WebElement laptops;
//	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
//	private WebElement showAll;
//	
//	@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[3]")
//	private WebElement compareMac;
//	
//	@FindBy (xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]/i")
//	private WebElement compareMacAir;
//	
//	@FindBy (xpath = "//body/div[@id='product-category']/div[1]")
//	private WebElement successMessage;
//	
//	@FindBy (xpath = "//a[@id='compare-total']")
//	private WebElement productCompare;
//	
//	@FindBy (xpath = "//h1[contains(text(),'Product Comparison')]")
//	private WebElement comparisonChart;
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
//	public void clickOnCompareMac() {
//		compareMac.click();
//	}
//		
//	public void clickOnCompareMacAir() {
//		compareMacAir.click();
//	}
//	 public void successMessageIsPresent() {
//		 successMessage.isDisplayed();
//	 }
//	 
//	 public void clickOnProductCompare() {
//		 productCompare.click();
//	 }
//		public void comparisobChartIsPresent() {
//			comparisonChart.click();
//		}
//		
//	}
//	
//
//

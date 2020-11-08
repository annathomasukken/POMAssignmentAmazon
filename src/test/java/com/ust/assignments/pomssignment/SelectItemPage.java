package com.ust.assignments.pomssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectItemPage {
	
	 @FindBy(xpath="(//span[@class='a-label a-checkbox-label'])[7]")
	 private WebElement filterByBrand;
	 @FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	 private WebElement filterByRating;
	 @FindBy(xpath="(//span[@class='a-size-base a-color-base'])[16]")
	 private WebElement filterByPrice;
	   @FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]") 
	   	private WebElement selectItem;
	   
	   @FindBy(xpath="//span[@class='a-dropdown-prompt']")
	   private WebElement sortByCategory;
	 //  @FindBy(id="//a[@id='dropdown1_0']")
	   @FindBy(linkText="Newest")
	   private WebElement newestCategory;
	   @FindBy(xpath="//select[@class='a-spacing-top-mini']")
	   private WebElement sortByFeature;
	   @FindBy(xpath="//select[@class='a-spacing-top-mini']//option[4]")
	   private WebElement avgCustomer;
	   @FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	   private WebElement selectSecondItem;
	   static WebDriver driver;
		public SelectItemPage(WebDriver driver) {
			driver =this.driver;
		}
		public void filterByBrandClick() {
			
			filterByBrand.click();
				}
       public void filterByRatingClick() {
			
	       filterByRating.click();
				}
       public void filterByPriceClick() {
	
	        filterByPrice.click();
		}
	
	  public void selectItemuClick() {
				
		  selectItem.click();
			}
	  
	  public void sortByCategoryClick() {
			
		  sortByCategory.click();
			}
	  public void newestCategoryClick() {
			
		  newestCategory.click();
			}
	  public void sortByFeatureClick() {
			
		  sortByFeature.click();
			}
	  public void avgCustomerClick() {
			
		  avgCustomer.click();
			}
	  public void selectSecondItemClick() {
			
		  selectSecondItem.click();
			}
}



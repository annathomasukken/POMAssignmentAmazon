package com.ust.assignments.pomssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//i[@class='hm-icon nav-sprite']")
	private WebElement hamburgerMenu;
	
	@FindBy(linkText="Mobiles, Computers")
	private WebElement hamburgerSubMenu;
	

   @FindBy(linkText="All Mobile Phones")
   private WebElement selectMenuItem;
   
   static WebDriver driver;
	public HomePage(WebDriver driver) {
		driver =this.driver;
	}
  public void hambergerMenuClick() {
			
			hamburgerMenu.click();
		}
		
   public void hambergerSubMenuClick() {
			
	hamburgerSubMenu.click();
		}
		
   public void selectMenuItemClick() {
		
	   selectMenuItem.click();
			}

}

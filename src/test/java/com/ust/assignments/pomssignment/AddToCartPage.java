package com.ust.assignments.pomssignment;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage {

	@FindBy(xpath="//input[@class='a-button-input attach-dss-atc']")
	private WebElement addToCart;

	@FindBy(xpath="//a[@id='attach-close_sideSheet-link']")
	private WebElement closeAddToCart;
	
	@FindBy(id="nav-cart-count")
	private WebElement addToCartLink;
	
	@FindBy(xpath="(//span[@class='a-dropdown-label'])[1]")
	private WebElement increaseQuantity;
	
	@FindBy(xpath="//a[@id='dropdown1_3']")
	private WebElement increaseQuantityNumber;
	@FindBy(id="add-to-cart-button")
	private WebElement addToCartSecond;
	static WebDriver driver;
	public AddToCartPage(WebDriver driver) {
		driver =this.driver;
	}
	
  public void addToCartClick() {			
	  addToCart.click();
	  closeAddToCart.click();

		}
  
  public void addToCartLinkClick() {
		
	  addToCartLink.click();
		}
  public void increaseQuantityClick() {
		
	  increaseQuantity.click();
		}
  public void increaseQuantityNumberClick() {
		
	  increaseQuantityNumber.click();
		}
  public void addToCartSecondClick() {
		
	  addToCartSecond.click();
		}
}

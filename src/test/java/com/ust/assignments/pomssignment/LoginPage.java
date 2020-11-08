package com.ust.assignments.pomssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	

	
	@FindBy(xpath="(//span[@class='nav-line-1'])[2]")
	private WebElement signinMouseHover;
	
	
	@FindBy(id="ap_email")
	private WebElement emailLogin;
	@FindBy(id="continue")
	private WebElement continueButton;
	@FindBy(id="ap_password")
	private WebElement passwordLogin;
	@FindBy(id="signInSubmit")
	private WebElement loginSubmit;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOut;
	static WebDriver driver;
	public LoginPage(WebDriver driver) {
		driver =this.driver;
		// TODO Auto-generated constructor stub
	}
	
//	601067373
	
	public void hoverMouseLogin(){
	//Actions actions = new Actions(driver);
	// actions.moveToElement(signinMouseHover).perform();
		signinMouseHover.click();
		
	}
	
	public void loginEmail() {
		emailLogin.sendKeys("*****************@gmail.com");
		continueButton.click();
	}
	
	public void loginPassword() {
		passwordLogin.sendKeys("********");
	}
	public void loginButton() {
		loginSubmit.click();
	}
	
	public void signoutButton(){
	signOut.click();
	}
}

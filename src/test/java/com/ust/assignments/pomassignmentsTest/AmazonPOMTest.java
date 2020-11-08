package com.ust.assignments.pomassignmentsTest;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ust.assignments.pomssignment.AddToCartPage;
import com.ust.assignments.pomssignment.HomePage;
import com.ust.assignments.pomssignment.LoginPage;
import com.ust.assignments.pomssignment.SelectItemPage;


public class AmazonPOMTest {

	static WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	SelectItemPage selectItemPage;
	AddToCartPage addToCartPage;
	String expected = "";
	String actual = "";

	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
	}



	@Test(priority=0)
	public void login() throws InterruptedException {

		loginPage = new LoginPage(driver);
		loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.hoverMouseLogin();
		loginPage.loginEmail();
		loginPage.loginPassword();
		loginPage.loginButton();
		Thread.sleep(5000);
		

		expected = "Amazon";
		actual = driver.getTitle();		
		assertEquals(actual, expected);  

	}
	@Test(priority=1)
	public void pageSelection() throws InterruptedException  {
		Thread.sleep(20000);
		homePage = new HomePage(driver);
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.hambergerMenuClick();
		homePage.hambergerSubMenuClick();
		homePage.selectMenuItemClick();
		Thread.sleep(5000);

		expected ="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		actual = driver.getTitle();		
		assertEquals(actual, expected);  

	}  
	
	@Test(priority=2)
	public void SelectingItem() throws InterruptedException  {

		selectItemPage = new SelectItemPage(driver);
		selectItemPage = PageFactory.initElements(driver, SelectItemPage.class);
		selectItemPage.filterByBrandClick();
		selectItemPage.filterByRatingClick();
		selectItemPage.filterByPriceClick();
		selectItemPage.selectItemuClick();
	
		Thread.sleep(5000);
		String expectedtitle = "Amazon.in";
	  	 
		//expected ="Amazon.in: ?10,000 - ?20,000 - 4 Stars & Up / Oppo / Mobiles & Accessories: Electronics";
		actual = driver.getTitle();		
		 Assert.assertTrue(actual.contains(expectedtitle));
		//assertEquals(actual, expected);  

	}  
	@Test(priority=3)
	public void AddToCartItem() throws InterruptedException  {

		addToCartPage = new AddToCartPage(driver);
		addToCartPage = PageFactory.initElements(driver, AddToCartPage.class);
		 ArrayList<String> allWindows = new ArrayList<String> (driver.getWindowHandles()); 		 
			driver.switchTo().window(allWindows.get(1)); 
		addToCartPage.addToCartClick();
		addToCartPage.addToCartLinkClick();
		addToCartPage.increaseQuantityClick();
		addToCartPage.increaseQuantityNumberClick();
	
		Thread.sleep(5000);

		expected = "Amazon.in Shopping Cart";
		actual = driver.getTitle();		
		assertEquals(actual, expected);  

	}  
	@Test(priority=4)
	public void categorySelectionSecondItem() throws InterruptedException  {

		homePage = new HomePage(driver);
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.hambergerMenuClick();
		homePage.hambergerSubMenuClick();
		homePage.selectMenuItemClick();
		Thread.sleep(5000);
		expected = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		actual = driver.getTitle();		
		assertEquals(actual, expected);  
	}
	@Test(priority=5)
	public void SelectionSecondItem() throws InterruptedException  {
		selectItemPage = new SelectItemPage(driver);
		selectItemPage = PageFactory.initElements(driver, SelectItemPage.class);
		selectItemPage.sortByCategoryClick();
		selectItemPage.newestCategoryClick();
		selectItemPage.sortByFeatureClick();
		selectItemPage.avgCustomerClick();
		selectItemPage.selectSecondItemClick();
		ArrayList<String> allWindows = new ArrayList<String> (driver.getWindowHandles()); 		 
		driver.switchTo().window(allWindows.get(2));
		addToCartPage.addToCartSecondClick();
		addToCartPage.addToCartLinkClick();
		Thread.sleep(5000);

		expected = "Amazon.in Shopping Cart";
		actual = driver.getTitle();		
		assertEquals(actual, expected);  

	}  
	@Test(priority=6)
	public void signoutAndSignInAgain() throws InterruptedException  {
		homePage.hambergerMenuClick();
		loginPage.signoutButton();
		loginPage.loginEmail();
		loginPage.loginPassword();
		loginPage.loginButton();
		addToCartPage.addToCartLinkClick();
		Thread.sleep(5000);
		expected = "Amazon.in Shopping Cart";
		actual = driver.getTitle();		
		assertEquals(actual, expected);  
	}
/*	@AfterClass
	public void closeBrowser() {
		driver.close();
	}  */
}

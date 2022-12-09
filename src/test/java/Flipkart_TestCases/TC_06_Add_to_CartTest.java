package Flipkart_TestCases;


import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import  static Utilities.Login.Valid_login;
import com.relevantcodes.extentreports.LogStatus;

import Pages.AccountSettingsPage;
import Pages.AddToCartPage;

public class TC_06_Add_to_CartTest extends BaseClassTest {
	@Test(priority=11,enabled=true,groups = {"CartTest"})
	public static void Add_To_Cart_From_WishList() throws InterruptedException {
		AccountSettingsPage page1 = new AccountSettingsPage();
		AddToCartPage page2 = new AddToCartPage();
		  OpenUrl();
		  //Valid_login( driver,testlog ,log);
		  WebDriverWait Wait = new WebDriverWait(driver,10);
		  Wait.until(ExpectedConditions.textToBePresentInElementLocated(page1.MyAccount, "Samapti"));
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(page1.MyAccount)).perform();
		  testlog.log(LogStatus.PASS, "HoverOver Samapti");
		  log.info("HoverOver Samapti ");
		  driver.findElement(page1.My_Profile).click();
		  testlog.log(LogStatus.PASS, "Click on My profile button");
		  log.info("Click on My profile button");
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,500)");
		  driver.findElement(page2.Wishlist).click();
		  testlog.log(LogStatus.PASS, "Click On My_WishList");
		  log.info("Click On My_WishList");
		  driver.findElement(page2.Wishlist_Item).click();
		  testlog.log(LogStatus.PASS, "click on Item Which you wanted to Buy");
		  log.info("click on Item Which you wanted to Buy");
		  
		  Assert.assertEquals("My Wishlist",driver.getTitle());
		 
		
	}
	@Test(priority=12,enabled=true,groups = {"CartTest"})
	public static void Get_Total_Wishlist_items() throws InterruptedException {
		AccountSettingsPage page1 = new AccountSettingsPage();
		AddToCartPage page2 = new AddToCartPage();
		 OpenUrl();
		 // Valid_login( driver,testlog ,log);
		  WebDriverWait Wait = new WebDriverWait(driver,10);
		  Wait.until(ExpectedConditions.textToBePresentInElementLocated(page1.MyAccount, "Samapti"));
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(page1.MyAccount)).perform();
		  testlog.log(LogStatus.PASS, "HoverOver Samapti");
		  log.info("HoverOver Samapti ");
		  driver.findElement(page1.My_Profile).click();
		  testlog.log(LogStatus.PASS, "Click on My profile button");
		  log.info("Click on My profile button");
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,500)");
		  driver.findElement(page2.Wishlist).click();
		  testlog.log(LogStatus.PASS,"Click On My_WishList");
		  log.info("Click On My_WishList");
		  String Total_WishList_Item = driver.findElement(page2.Total_Item).getText();
		  System.out.println(Total_WishList_Item);
		  testlog.log(LogStatus.PASS,"Total Item in WishList:"+ Total_WishList_Item);
		  Assert.assertEquals("My Wishlist (259)", driver.findElement(page2.Total_Item).getText());
	}
	
		  
		  
		
	}



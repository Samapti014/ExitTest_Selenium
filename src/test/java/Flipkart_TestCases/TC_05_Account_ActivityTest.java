package Flipkart_TestCases;


import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.LogStatus;

import  static Utilities.Login.Valid_login;
import Pages.AccountSettingsPage;
import Utilities.ReadData;


public class TC_05_Account_ActivityTest extends BaseClassTest {
	
	@Test(priority=6,enabled=true,dataProviderClass= ReadData.class,dataProvider = "getData",groups={"AccountActivity"})
	public static void Set_personal_information(Object FirstName , Object Lastname ,
			Object execution_required) throws InterruptedException {
		
		if(execution_required.toString().equalsIgnoreCase("no")) throw new
		  SkipException("Execution Not Required");
		 AccountSettingsPage page =  new AccountSettingsPage();
		  OpenUrl();
		  
		  //Valid_login( driver,testlog ,log);
		  WebDriverWait Wait = new WebDriverWait(driver,10);
		  Wait.until(ExpectedConditions.textToBePresentInElementLocated(page.MyAccount, "Samapti"));
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(page.MyAccount)).perform();
		  testlog.log(LogStatus.PASS, "HoverOver Samapti");
		  log.info("HoverOver Samapti ");
		  driver.findElement(page.My_Profile).click();
		  testlog.log(LogStatus.PASS, "Click on My profile button");
		  log.info("Click on My profile button");
		  driver.findElement(page.Edit).click();
		  testlog.log(LogStatus.PASS, "Click on Edit option");
		  log.info("Click on Edit option");
		  driver.findElement(page.First_Name).clear();
		  driver.findElement(page.First_Name).sendKeys(FirstName.toString());
		  testlog.log(LogStatus.PASS, "Enter My First Name");
		  log.info("Enter My First Name");
		  driver.findElement(page.Last_Name).clear();
		  driver.findElement(page.Last_Name).sendKeys(Lastname.toString());
		  testlog.log(LogStatus.PASS, "Enter Last Name");
		  log.info("Enter Last Name");
		  driver.findElement(page.Save).click();
		  testlog.log(LogStatus.PASS, "Click on save");
		  log.info("Click on save");
		  Thread.sleep(2000);
		  Assert.assertEquals(driver.findElement(page.Assert1).getText(), "Samapti Rudra");
		  
		
	}
	 @Test(priority=7,enabled=true,dataProviderClass= ReadData.class,dataProvider = "getData",groups={"AccountActivity"})
     public static void Manage_Address(Object Name , Object Number , 
    		 Object pinCode,Object Locality,Object Address, Object execution_required) throws InterruptedException {
		 if(execution_required.toString().equalsIgnoreCase("no")) throw new
		  SkipException("Execution Not Required");
		 AccountSettingsPage page =  new AccountSettingsPage();
		  OpenUrl();
		  
		  //Valid_login( driver,testlog ,log);
		  WebDriverWait Wait = new WebDriverWait(driver,10);
		  Wait.until(ExpectedConditions.textToBePresentInElementLocated(page.MyAccount, "Samapti"));
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(page.MyAccount)).perform();
		  testlog.log(LogStatus.PASS, "HoverOver Samapti");
		  log.info("HoverOver Samapti ");
		  driver.findElement(page.My_Profile).click();
		  testlog.log(LogStatus.PASS, "Click on My profile button");
		  log.info("Click on My profile button");
		  driver.findElement(page.Manage_Addrss).click();
		  testlog.log(LogStatus.PASS, "Click on Manage Address ");
		  log.info("Click on Click on Manage Address ");
		  driver.findElement(page.Add_New_Address).click();
		  testlog.log(LogStatus.PASS, " Click on Add New Address Button");
		  log.info("Click on Add New Address Button");
		  driver.findElement(page.Name).sendKeys(Name.toString());
		  testlog.log(LogStatus.PASS, "Enter Name in The Name Field");
		  log.info("Enter Name in the Name field");
		  driver.findElement(page.Mobile_number).sendKeys(Number.toString());
		  testlog.log(LogStatus.PASS, "Enter mobile number");
		  log.info("Enter Mobile number");
		  driver.findElement(page.pincode).sendKeys(pinCode.toString());
		  testlog.log(LogStatus.PASS, "Enter Pincode");
		  log.info("Enter Pincode");
		  driver.findElement(page.Locality).sendKeys(Locality.toString());
		  testlog.log(LogStatus.PASS, "Enter Locality");
		  log.info("Enter Locality");
		  driver.findElement(page.Address).sendKeys(Address.toString());
		  testlog.log(LogStatus.PASS, "Enter Full Address");
		  log.info("Enter Full Address");
		  driver.findElement(page.Address_Type).click();
		  testlog.log(LogStatus.PASS, "Click on Address Type Home Or Work");
		  log.info("Click on Address Type Home Or Work");
		  Assert.assertEquals(driver.findElement(page.Assert2).getText(), "ADD A NEW ADDRESS");
    	 
     }
	 @Test(priority=8,enabled=true,groups={"AccountActivity"})
	 public static void Explore_My_Coupons() throws InterruptedException {
		 AccountSettingsPage page =  new AccountSettingsPage();
		  OpenUrl();
		  
		 // Valid_login( driver,testlog ,log);
		  WebDriverWait Wait = new WebDriverWait(driver,10);
		  Wait.until(ExpectedConditions.textToBePresentInElementLocated(page.MyAccount, "Samapti"));
		  Actions action = new Actions(driver);
		 
		  action.moveToElement(driver.findElement(page.MyAccount)).perform();
		  testlog.log(LogStatus.PASS, "HoverOver Samapti");
		  log.info("HoverOver Samapti ");
		  driver.findElement(page.My_Profile).click();
		  testlog.log(LogStatus.PASS, "Click on My profile button");
		  log.info("Click on My profile button");
		  WebElement coupons = driver.findElement(page.My_coupons);
		  action.moveToElement(coupons).perform();
		  action.click().perform();
		  testlog.log(LogStatus.PASS, "Click on My Coupons ");
		  log.info("Click on My Coupons");
		  Assert.assertEquals("Flipkart.com: Your Rewards History",driver.getTitle());
		  
		  
		 
	 }
	 
	@Test(priority=9,enabled=true,groups={"AccountActivity"})
	 
	 public static void Explore_My_Notifications() throws InterruptedException {
		 AccountSettingsPage page =  new AccountSettingsPage();
		  OpenUrl();
		  
		  //Valid_login( driver,testlog ,log);
		  WebDriverWait Wait = new WebDriverWait(driver,10);
		  Wait.until(ExpectedConditions.textToBePresentInElementLocated(page.MyAccount, "Samapti"));
		  Actions action = new Actions(driver);
		 
		  action.moveToElement(driver.findElement(page.MyAccount)).perform();
		  testlog.log(LogStatus.PASS, "HoverOver Samapti");
		  log.info("HoverOver Samapti ");
		  driver.findElement(page.My_Profile).click();
		  testlog.log(LogStatus.PASS, "Click on My profile button");
		  log.info("Click on My profile button");
		  WebElement notifications = driver.findElement(page.my_notification);
		  action.moveToElement(notifications).perform();
		  action.click().perform();
		  testlog.log(LogStatus.PASS, "Click on My Notifications");
		  log.info("Click on My Notifications");
		  
		 	 } 
	 
	@Test(priority=10,enabled=true,groups={"AccountActivity"})
	 public static void Explore_Gift_Cards() throws InterruptedException {
		 AccountSettingsPage page =  new AccountSettingsPage();
		 
		  OpenUrl();
		  
		 // Valid_login( driver,testlog ,log);
		  WebDriverWait Wait = new WebDriverWait(driver,10);
		  Wait.until(ExpectedConditions.textToBePresentInElementLocated(page.MyAccount, "Samapti"));
		  Actions action = new Actions(driver);
		  action.moveToElement(driver.findElement(page.MyAccount)).perform();
		  testlog.log(LogStatus.PASS, "HoverOver Samapti");
		  log.info("HoverOver Samapti ");
		  driver.findElement(page.My_Profile).click();
		  testlog.log(LogStatus.PASS, "Click on My profile button");
		  log.info("Click on My profile button");
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,1500)");
		  driver.findElement(page.GiftCards).click();
		  testlog.log(LogStatus.PASS, "Click on GiftCards option");
		  log.info("Click on GiftCards option ");
		  jse.executeScript("window.scrollBy(0,1000)");
		  driver.findElement(page.Generic_Cards).click();
		  testlog.log(LogStatus.PASS, "Click on Generic cards");
		  log.info("Click on Generic cards");
		  //Assert.assertEquals(driver.findElement(page.Assert3).getText(),"Gift Card Store");
         }
}

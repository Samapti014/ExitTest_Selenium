package Flipkart_TestCases;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.SearchPage;
import Utilities.ReadData;

public class TC_03_SearchTest extends BaseClassTest {
	@Test(priority=2,enabled = true,dataProviderClass = ReadData.class,dataProvider = "getData",groups= {"Search"})
public static void  Search_Using_click(Object data , Object execution_required) throws InterruptedException {
		
		if(execution_required.toString().equalsIgnoreCase("no"))
			throw new SkipException("Execution Not Required");
		
		OpenUrl();
		SearchPage page = new SearchPage();
		driver.findElement(page.searchbar).sendKeys(data.toString());
		testlog.log(LogStatus.PASS, "Enter " + data.toString() + " in search Field");
		driver.findElement(page.searchicon).click();
		testlog.log(LogStatus.PASS, "Click search icon");
		Assert.assertEquals(driver.getCurrentUrl().split("\\&")[0], "https://www.flipkart.com/search?q=" + data);
	
	}
	@Test(priority = 3 , enabled = true,dataProviderClass = ReadData.class,dataProvider = "getData",groups = {"Search"})
	public static void  Search_Using_Icon(Object data , Object execution_required) throws InterruptedException {
		
		if(execution_required.toString().equalsIgnoreCase("no"))
			throw new SkipException("Execution Not Required");
		
		OpenUrl();
		SearchPage page = new SearchPage();
		driver.findElement(page.searchbar).sendKeys(data.toString());
		testlog.log(LogStatus.PASS, "enter " + data.toString() + " in search bar");
		driver.findElement(page.searchicon).sendKeys(Keys.ENTER);
		testlog.log(LogStatus.PASS, "press enter key on grocery icon");
		Assert.assertEquals(driver.findElement(page.Assert1).getText(), data.toString());
	
	}
	@Test(priority=4,enabled=true,groups={"Search"})
	public  static void  Search_From_DropDown() throws InterruptedException {
		OpenUrl();
		SearchPage page = new SearchPage();
		WebElement element = driver.findElement(page.MoreIcon);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		testlog.log(LogStatus.PASS, "Mouse Hover in Beauty,Toys&More Options");
		driver.findElement(page.Item).click();
		testlog.log(LogStatus.PASS, "Click on the item want to search");
		Assert.assertEquals(driver.findElement(page.Assert2).getText(),"Beauty And Grooming");
		
		
	}
	
	@Test(priority=5,enabled=true,groups = {"Search"}) 
	
	public static void Search_According_to_Brand() throws InterruptedException {
		OpenUrl();
		SearchPage page = new SearchPage();
		driver.findElement(page.Mobile).click();
		testlog.log(LogStatus.PASS, "Click on Mobile Icon");
		driver.findElement(page.BrandName).click();
		testlog.log(LogStatus.PASS, "Click on the Brand Name");
		Assert.assertEquals(driver.findElement(page.Assert2).getText(),"Mobiles");
		
	}
	

}

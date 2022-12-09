package Flipkart_TestCases;

import static Utilities.Login.Valid_login;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;



import Pages.SellerPage;

public class TC_04_Become_a_sellerTest extends BaseClassTest {
	@Test(priority=15,enabled=true,groups = {"header"})
	public static void Verify_Seller_Person_NameTest() throws InterruptedException {
		SellerPage page = new SellerPage();
		OpenUrl();
		//Valid_login( driver,testlog ,log);
		driver.findElement(page.seller_Icon).click();
		testlog.log(LogStatus.PASS, "Click on seller hub link");
		Assert.assertEquals(driver.findElement(page.person1_name).getText(), "Chaitanya Ramalingegowda");
		testlog.log(LogStatus.PASS, "verify Sellerperson name 1");
		Assert.assertEquals(driver.findElement(page.person2_name).getText(), "Raju Lunawath");
		testlog.log(LogStatus.PASS, "verify Sellerperson name 2");
		Assert.assertEquals(driver.findElement(page.person3_name).getText(), "Shubhash Chopra");
		testlog.log(LogStatus.PASS, "verify Sellerperson name 3");
		
	}
}

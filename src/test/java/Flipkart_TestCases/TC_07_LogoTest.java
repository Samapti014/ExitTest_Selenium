package Flipkart_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.LogoPage;

public class TC_07_LogoTest extends BaseClassTest {
	@Test(priority = 13, enabled = true , groups = {"header"})
	public void verify_logo_text() throws InterruptedException {
		
	
		LogoPage page = new LogoPage();
		OpenUrl();
		Assert.assertEquals(driver.findElement(page.Logo).getAttribute("title") , "Flipkart");
		testlog.log(LogStatus.PASS, "verify logo name of application");
		log.info("verify logo name of application");
	}
	
	
	@Test(priority = 14 , enabled = true , groups = {"header"})
	public void verify_flipkart_plus() throws InterruptedException {
		
		LogoPage page = new LogoPage();
		OpenUrl();
		
		driver.findElement(page.flipkart_plus_link).click();
		Assert.assertEquals(driver.getCurrentUrl() , "https://www.flipkart.com/plus");
		testlog.log(LogStatus.PASS, "Verify flipkart plus link on logo");
		log.info("verify flipkart plus link on logo");

     }
}

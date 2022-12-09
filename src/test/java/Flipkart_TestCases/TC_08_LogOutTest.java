package Flipkart_TestCases;

import static Utilities.Login.Valid_login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.AccountSettingsPage;
import Pages.LoginPage;

public class TC_08_LogOutTest extends BaseClassTest {

	@Test(priority=16,enabled=true)
	public static void Log_Out() throws InterruptedException {
		 LoginPage page = new LoginPage();
		 AccountSettingsPage page1 = new AccountSettingsPage();
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
		  driver.findElement(page.logOff).click();
		  testlog.log(LogStatus.PASS, "Click on LogOff Option");
		  log.info("Click on LogOff Option");
		  
	}
}

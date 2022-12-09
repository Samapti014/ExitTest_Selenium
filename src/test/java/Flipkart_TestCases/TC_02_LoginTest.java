package Flipkart_TestCases;

import static Utilities.Login.Valid_login;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.AccountSettingsPage;
import Pages.LoginPage;
import Utilities.ReadData;

 class TC_02_LoginTest extends BaseClassTest {
	
	@Test(priority=1,enabled=true,dataProviderClass= ReadData.class,dataProvider = "getData",groups={"login","Registration"})
	
	public static void login( Object username , Object password , Object execution_required ) throws InterruptedException
	{
		  if(execution_required.toString().equalsIgnoreCase("no")) throw new
		  SkipException("Execution Not Required");
		  
		 
		 LoginPage page = new LoginPage();
		  
		  OpenUrl();
		  
		  driver.findElement(page.login_btn).click();
		  testlog.log(LogStatus.PASS,"Click Login Button");
		  log.info("Click Login Button");
		  driver.findElement(page.Mobile_Number).sendKeys(username.toString()) ;
		  testlog.log(LogStatus.PASS,"Enter userName:"+username.toString());
		  log.info("Enter Mobile Number:" +username.toString());
		  driver.findElement(page.Password).sendKeys(password.toString()) ;
		  testlog.log(LogStatus.PASS,"Enter Password:"+password.toString());
		  log.info("Enter Password:"+password.toString());
		  driver.findElement(page.submit).click();
		  testlog.log(LogStatus.PASS,"Click submit Button");
		  log.info("Click on Submit Button");
		 
	}
	
}

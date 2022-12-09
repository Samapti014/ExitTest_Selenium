package Utilities;

import org.testng.SkipException;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.LoginPage;

public class Login  {
  
	public static void Valid_login(WebDriver driver, ExtentTest testlog , Logger log) throws InterruptedException
	{
		
		 LoginPage page = new LoginPage();

		  driver.findElement(page.login_btn).click();
		  testlog.log(LogStatus.PASS,"Click Login Button");
		  log.info("Click Login Button");
		  driver.findElement(page.Mobile_Number).sendKeys("9382204358") ;
		  testlog.log(LogStatus.PASS,"Enter userName");
		  log.info("Enter Mobile Number");
		  driver.findElement(page.Password).sendKeys("Rudra2023") ;
		  testlog.log(LogStatus.PASS,"Enter Password");
		  log.info("Enter Password");
		  driver.findElement(page.submit).click();
		  testlog.log(LogStatus.PASS,"Click submit Button");
		  log.info("Click on Submit Button");
		 
	}
}

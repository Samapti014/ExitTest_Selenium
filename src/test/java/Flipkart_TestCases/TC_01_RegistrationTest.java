package Flipkart_TestCases;

import static Utilities.Login.Valid_login;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Pages.AccountSettingsPage;
import Pages.LoginPage;
import Pages.RegisterPage;
import Utilities.ReadData;

public class TC_01_RegistrationTest  extends BaseClassTest {
	
	@Test(priority=0,enabled = true,dataProviderClass= ReadData.class,dataProvider = "getData",groups={"login","Registration"})
	public static void User_Registration( Object username , Object password ,Object OTP, Object execution_required) throws InterruptedException {
		 if(execution_required.toString().equalsIgnoreCase("no")) throw new
		  SkipException("Execution Not Required");
		 OpenUrl();
		 RegisterPage page = new RegisterPage();
		
		  
		 WebElement element = driver.findElement(page.Login);
		 Actions action = new Actions(driver);
		 action.moveToElement(element).perform();
		 testlog.log(LogStatus.PASS, "Hover over on the login options");
		 driver.findElement(page.SignUp).click();
		 testlog.log(LogStatus.PASS, "Click on the Sign in option");
		 driver.findElement(page.Mobile_Number).sendKeys(username.toString());
		 testlog.log(LogStatus.PASS, "Enter the Mobilenumber:"+username.toString());
		 driver.findElement(page.Continue).click();
		 testlog.log(LogStatus.PASS, "press Continue button");
		 driver.findElement(page.OTP).sendKeys(OTP.toString());
		 testlog.log(LogStatus.PASS, "Enter the OTP:"+OTP.toString());
		 driver.findElement(page.Password).sendKeys(password.toString());
		 testlog.log(LogStatus.PASS, "Enter the password:"+password.toString());
		 
	}

}

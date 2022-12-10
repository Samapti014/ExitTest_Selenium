package Flipkart_TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


import Pages.PopupPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Utilities.CaptureScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTest {
	public static WebDriver driver;
	public static File ConFile;
	public static Properties config_prop;
	static FileInputStream fr1;

	public static ExtentReports report;
	public static ExtentTest testlog;
	
	public static Logger log =  LogManager.getLogger(BaseClassTest.class.getName());

	static {
		ConFile = new File(System.getProperty("user.dir") +  "\\Resources\\Configure.properties");
		
		config_prop = new Properties();
		

		try {
			fr1 = new FileInputStream(ConFile);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config_prop.load(fr1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@SuppressWarnings("deprecation")
	@BeforeSuite
	public static void TestBrowser() {
            log.info("using browser " + config_prop.get("browser_name"));
		long waitTime = Long.parseLong(config_prop.get("global_wait_time").toString());
		if (config_prop.getProperty("browser_name").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			if (config_prop.get("headless").equals("true"))
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
			log.info("Starting Browser");
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
			log.info("Managing Timeouts");
			driver.manage().window().maximize();
			log.info("Initilising Driver");
			log.info("Maximize browser window");
		}
		else if (config_prop.getProperty("browser_name").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			if (config_prop.get("headless").equals("true"));
			options.addArguments("--headless");
			driver = new FirefoxDriver(options);
			log.info("Starting Browser");
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
			log.info("Managing Timeouts");
			driver.manage().window().maximize();
			log.info("Initilising Driver");
			log.info("Maximize browser window");
		}
		else if (config_prop.getProperty("browser_name").equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			log.info("Starting Browser");
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
			log.info("Managing Timeouts");
			driver.manage().window().maximize();
			log.info("Initilising Driver");
			log.info("Maximize browser window");
		}
		
		driver.get(config_prop.getProperty("application_url"));
		Remove_pop_Up();
		report = new ExtentReports(System.getProperty("user.dir") + config_prop.get("Report_Path"));

	}
	
		@BeforeMethod
	     public static void StartTestCase(Method testMethod) throws InterruptedException {
	    	 
	    	log.info("Executing TestCase :" + testMethod.getName());
	    	testlog = report.startTest(testMethod.getName());
	    	 
	    	
	    		 
	     }
	    
	    public static void OpenUrl() throws InterruptedException {
	    	driver.get(config_prop.getProperty("application_url"));
	    	log.info("Open Application URl");
	    	testlog.log(LogStatus.PASS, "Open Apllication Url");
	    	
	    	 
	    }
		 public static void Remove_pop_Up() {
	    
	    	boolean IsPopUpPresent ; 
	    	
	    	
		    PopupPage pop_up = new PopupPage();
		    System.out.println("start1");
		    
		   
		    	
				driver.findElement(pop_up.cancel).click();
				
				
			
		  
		 }
	    
	    
	   
	     @AfterMethod
	     public static void testCaseReport(ITestResult result) throws IOException {
	    	
	    	
	    	 if(result.isSuccess()) {
	    		testlog.log(LogStatus.PASS , "Test Successful");
	    		log.info("Test case successfully Executed");
	    		
		     }
	    	
	    	else if(result.getStatus() == ITestResult.FAILURE){
	    		
	    		testlog.log(LogStatus.FAIL , result.getThrowable().toString());
	    		log.info("Test Case Failled");
	    		CaptureScreenshot.ScreenShot(driver, testlog.getTest().getName());
	    		log.info("Screenshot is  Taken");
	    	 
	    	 }
	    	else if(result.getStatus() == ITestResult.SKIP)
	    		testlog.log(LogStatus.ERROR , "Test  Case skipped");
	    	 
	    	 
	    	 report.endTest(testlog);
	    	 log.info("Test Case Ended  :" + testlog.getTest().getName().toString());
	    			 
	     }	 
	   
	     
	
	@AfterSuite
	public static void tearDown() {
		report.flush();
		log.info("Saving reports");
		driver.quit();
		log.info("Closing Browser");
	     }
}


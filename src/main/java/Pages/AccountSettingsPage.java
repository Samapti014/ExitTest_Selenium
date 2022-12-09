package Pages;

import static Utilities.Login.Valid_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;



public class AccountSettingsPage {
	public By  MyAccount = By.xpath("//div[contains(text(),'Samapti')]");
	public By My_Profile = By.xpath("//div[contains(text(),'My Profile')]");
	public By Edit = By.xpath("//span[contains(text(),'Edit')]");
	public By First_Name = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]");
	public By Last_Name = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]");
	public By Save = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]");
	public By Assert1 = By.xpath("//div[contains(text(),'Samapti Rudra')]");
	
	
	public By Manage_Addrss = By.xpath("//div[contains(text(),'Manage Addresses')]");
	public By Add_New_Address = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
	public By Name = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]");
	public By Mobile_number = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]");
	public By  pincode= By .xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]");
	public By Locality = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/input[1]");
    public By Address = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/textarea[1]");
    public By Address_Type = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/div[1]/label[1]/div[1]");
    public By Save_address = By.xpath("//button[contains(text(),'Save')]");
    public By Assert2= By.xpath("//span[contains(text(),'ADD A NEW ADDRESS')]");
    
    
    
    public By My_coupons = By.xpath("//div[contains(text(),'My Coupons')]");
    
    
    public By my_notification = By.xpath("//div[contains(text(),'All Notifications')]");
    
    
    public By GiftCards= By.xpath("//span[contains(text(),'Gift Cards')]");
    public By Generic_Cards = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[6]/div[1]/div[2]/a[1]/div[1]/div[1]/img[2]");
    public By Assert3 = By.xpath("//h1[contains(text(),'Gift Card Store')]");

}

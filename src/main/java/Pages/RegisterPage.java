package Pages;

import org.openqa.selenium.By;

public class RegisterPage {
	  
	public By Login = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/*[1]");
	public By SignUp = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]");
	public By Mobile_Number = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]");
    public By Continue = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/button[1]");
    public By OTP = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]");
    public By Password = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/input[1]");
}

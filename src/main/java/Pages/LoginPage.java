package Pages;

import org.openqa.selenium.By;

public class LoginPage {
	public By login_btn = By.xpath("//a[contains(text(),'Login')]");
	public By login2 = By.xpath("//a[contains(text(),'Login')]");
	public By Mobile_Number = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
    public By Password = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
    public By submit = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button");
    
    
    public By logOff = By.xpath("//span[contains(text(),'Logout')]");
}

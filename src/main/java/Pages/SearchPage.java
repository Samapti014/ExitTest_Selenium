package Pages;

import org.openqa.selenium.By;

public class SearchPage {
	public By searchbar = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	public By searchicon = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button");
	public By  MoreIcon = By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[9]/a[1]/div[1]/div[1]/img[1]");
    public By  Item = By.xpath("//a[contains(text(),'View All')]");
    public By Assert1 = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]");
    public By Assert2 = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/h1[1]");
    public By Mobile = By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/img[1]");
    public By BrandName = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]");
    //public By Assert3= By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/h1[1]");
    }

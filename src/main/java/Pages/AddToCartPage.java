package Pages;

import org.openqa.selenium.By;

public class AddToCartPage {
      public By Wishlist = By.xpath("//div[contains(text(),'My Wishlist')]");
      public By Wishlist_Item = By.xpath("//div[contains(text(),'Heavy Win')]");
      
      
      public By Total_Item = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]");
      
      public By Cart_Icon = By.xpath("//span[contains(text(),'Cart')]");
      public By Place_order = By.xpath("//span[contains(text(),'Place Order')]");
      public By Deliver_Here = By.xpath("//button[contains(text(),'Deliver Here')]");
      public By Continue = By.xpath("//button[contains(text(),'CONTINUE')]");
}

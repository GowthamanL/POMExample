package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCartPageObjects {
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	public static WebElement sauceLabBagButton;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	public static WebElement sauceLabLightButton;
	
	
	/*public static WebElement sauceLabBagButton(WebDriver driver) {
		return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	}
	public static WebElement sauceLabLightButton(WebDriver driver) {
		return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
	}*/

}

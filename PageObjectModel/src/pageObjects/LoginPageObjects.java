package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
	@FindBy(how=How.ID,using="user-name")
	public static WebElement userName;
	
	@FindBy(id="password")
	public static WebElement passWord;
	
	@FindBy(id="login-button")
	public static WebElement loginBut;
	
	
	
	/*
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.id("user-name"));
	}
	public static WebElement passWord(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}
	public static WebElement loginBut(WebDriver driver) {
		return driver.findElement(By.id("login-button"));
	}*/

}

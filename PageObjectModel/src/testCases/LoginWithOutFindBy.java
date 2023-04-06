package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithOutFindBy {
	
	public static WebElement uid;
	public static WebElement password;
	public static WebElement btnLogin;
	
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\PRog\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		
		PageFactory.initElements(driver, LoginWithOutFindBy.class);
		
		uid.sendKeys("mngr478762");
		
		password.sendKeys("bagYqav");
		
		btnLogin.click();
		
		
	}

}

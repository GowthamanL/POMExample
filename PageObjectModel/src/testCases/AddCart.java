package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.AddCartPageObjects;
import pageObjects.LoginPageObjects;

public class AddCart {
	
	@Test
	public void myProfile() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\PRog\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("performance_glitch_user");
		LoginPageObjects.passWord.sendKeys("secret_sauce");
		LoginPageObjects.loginBut.click();
		
		PageFactory.initElements(driver, AddCartPageObjects.class);

		AddCartPageObjects.sauceLabBagButton.click();
		Thread.sleep(3000);
		AddCartPageObjects.sauceLabLightButton.click();



		/*WebElement userName=driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input"));
		userName.sendKeys("raxeyi9727@otanhome.com");

		WebElement passWord=driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
		passWord.sendKeys("KakashiHatake");

		WebElement loginBut=driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
		loginBut.click();

		WebElement sauceLabBag=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		sauceLabBag.click();

		WebElement sauceLabLight=driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		sauceLabLight.click();*/



	}


}

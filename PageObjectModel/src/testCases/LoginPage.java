package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginPage{

	@Test
	public void loginCreden() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"E:\\PRog\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("performance_glitch_user");
		LoginPageObjects.passWord.sendKeys("secret_sauce");
		LoginPageObjects.loginBut.click();
		
		
		
		
		

		/*LoginPageObjects.userName(driver).sendKeys("performance_glitch_user");
		LoginPageObjects.passWord(driver).sendKeys("secret_sauce");
		LoginPageObjects.loginBut(driver).click();*/


		/*IF WE USE "STATIC", WE DON'T NEED TO CREATE OBJECTS  
		LoginPageObjects loginPageObjects=new LoginPageObjects();*/



		/*
		WebElement userName=driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input"));
		userName.sendKeys("raxeyi9727@otanhome.com");

		WebElement passWord=driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
		passWord.sendKeys("KakashiHatake");

		WebElement loginBut=driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
		loginBut.click();*/



	}





}

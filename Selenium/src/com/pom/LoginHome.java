package com.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		LoginPage login = new LoginPage(driver);
	    LoginAnnotaions login = new LoginAnnotaions(driver);
//		LoginDirect login = new LoginDirect(driver);
		driver.get("https:www.facebook.com/");
		
		login.sendUsername("sibi");
		login.sendPassword("1234sibi");
		login.loginClicking();
	}
}

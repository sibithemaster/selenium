package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;	
	By username = By.id("email");
	By password = By.id("pass");
	By loginClick = By.name("login");
	public LoginPage(WebDriver d) {
		driver=d;
	}
	public void sendUsername(String name)
	{
		driver.findElement(username).sendKeys(name);
	}
	public void sendPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void loginClicking()
	{
		driver.findElement(loginClick).click();
	}
}

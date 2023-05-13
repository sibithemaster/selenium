package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDirect {
	WebDriver driver;
	@FindBy(id="email")
	WebElement username;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(name="login")
	WebElement loginClick;
	public LoginDirect(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	public void sendUsername(String name)
	{
		username.sendKeys(name);
	}
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void loginClicking()
	{
		loginClick.click();
	}
}

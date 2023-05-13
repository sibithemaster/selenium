package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginAnnotaions {

	WebDriver driver;	
	@FindBy(how=How.ID,using="email")
	WebElement username;
	@FindBy(how=How.ID,using="pass")
	WebElement password;
	@FindBy(how=How.NAME,using="login")
	WebElement loginClick;
	public LoginAnnotaions(WebDriver d)
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

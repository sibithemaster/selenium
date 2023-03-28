package com.afternoon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		//email12mkj
		WebElement emailId=driver.findElement(By.id("email"));
		emailId.sendKeys("dheena@yahoo.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("dheena123");
		
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
	}
}

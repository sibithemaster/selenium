package com.practicedays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DayTwo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
	    		   "D://chromedriver.exe");
	       
	       WebDriver driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	       driver.findElement(By.xpath("//input[@title='Login using User ID and password']")).sendKeys("sibi1234");
//	      WebElement user= driver.findElement(By.xpath("//input[@name='DUMMY1']/parent::span[@class='labelColumn']"));
	      
	       WebDriverWait wait = new WebDriverWait(driver, 20); 
//	       wait.until(ExpectedConditions.visibilityOf(user));
//	       user.sendKeys("sibi1234");
	}

}

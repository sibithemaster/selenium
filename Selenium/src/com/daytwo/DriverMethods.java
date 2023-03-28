package com.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods 
{
	public static void main(String[] args) {

		//Day one 
//		//setting the drivers
//		System.setProperty("webdriver.chrome.driver",
//				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");		
//		//casting driver
//		WebDriver driver=new ChromeDriver();
//		//getting the window size
//		driver.manage().window().maximize();		
//		driver.get("https://github.com/");		
//		//navigate methods		
//		driver.navigate().to("https://www.apple.com/");		
//		driver.navigate().to("https://www.facebook.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.close();
//		
		//DayTwo
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\Selenium\\ex\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
//		WebElement one = driver.findElement(By.id("email"));
//		one.sendKeys("any123@gmail.com");
//		
//		WebElement two = driver.findElement(By.id("pass"));
//		two.sendKeys("12345678");
//
//		WebElement button = driver.findElement(By.name(""));
//		button.click();
		
		WebElement b=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		b.click();
	}

}

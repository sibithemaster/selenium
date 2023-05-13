package com.practicedays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayThree {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.id("firstName")).sendKeys("sibi");
		
		driver.findElement(By.id("lastName")).sendKeys("subramanian");
		
		driver.findElement(By.id("username")).sendKeys("sibi1234");
		
		driver.findElement(By.name("Passwd")).sendKeys("sibi1234");
		
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("sibi1234");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();;
		

	}

}

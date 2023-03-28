package com.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com/");
		driver.findElement(By.xpath("((//a[@role='button'])[2])")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Roshini");
		driver.findElement(By.name("lastname")).sendKeys("Sivakumar");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123450");
        
		WebElement day=driver.findElement(By.id("day")); 
		Select D=new Select(day);
		D.selectByVisibleText("18");
		
		WebElement month=driver.findElement(By.id("month")); 
		Select M=new Select(month);
		M.selectByVisibleText("Aug");
		
		WebElement year=driver.findElement(By.id("year")); 
		Select Y=new Select(year);
		Y.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		
	}
}

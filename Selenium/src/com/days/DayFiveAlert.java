package com.days;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFiveAlert 
{

	public static void main(String[] args) throws InterruptedException 
	{		
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();		
		
		driver.get("https://www.amazon.com/");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("macbook");
		
		WebElement searchClicking = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		searchClicking.click();
		
		Thread.sleep(5000);
		
		WebElement selecting = driver.findElement(By.xpath("//span[contains(text()='Apple 2021 MacBook Pro (14-inch, M1 Pro chip with 8‑core CPU and 14‑core GPU, 16GB RAM, 512GB SSD) - Silver')]"));
        selecting.click();
	}

}

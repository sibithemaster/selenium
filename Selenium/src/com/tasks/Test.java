package com.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		//setting the drivers
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");		
		//casting driver
		WebDriver driver=new ChromeDriver();
		//getting the window size
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//input[@name='q']
		WebElement input=driver.findElement(By.name("q"));
        input.sendKeys("cricbuzz");
        
        WebElement cl=driver.findElement(By.name("btnK"));
        cl.click();
	}

}

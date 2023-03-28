package com.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/img"));
		
		WebElement target = driver.findElement(By.id("//div[@id='trash']"));
		
	    a.dragAndDrop(source, target).perform();	
	}

}

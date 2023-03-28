package com.days;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayNineMoveToElementAction {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.id("icp-nav-flyout"));//icp-nav-flyout
		
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(element).perform();	
		WebElement element2=driver.findElement(By.xpath("//span[.='TA']"));
		element2.click();

		driver.navigate().refresh();
		WebElement elements=driver.findElement(By.id("icp-nav-flyout"));
		actionObj.moveToElement(elements).perform();	
		
		WebElement element3=driver.findElement(By.xpath("//*[text()='HI']"));
		element3.click();
	}
}

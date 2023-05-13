package com.evening;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotSample {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		// TODO Auto-generated method stub

		// setting up the driver
		System.setProperty("webdriver.chrome.driver", 
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");

		// creating object for the driver
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		
		WebElement mobile = driver.findElement(By.linkText("Mobiles"));

		a.contextClick(mobile).build().perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);		
 		r.keyRelease(KeyEvent.VK_ENTER);
////		r.keyPress(KeyEvent.VK_DOWN);
//
//		r.keyRelease(KeyEvent.VK_DOWN);        
//
//		r.keyPress(KeyEvent.VK_ENTER);
//
//		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement cutomer = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));

		a.contextClick(cutomer).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);

		r.keyRelease(KeyEvent.VK_DOWN);        

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);

		driver.quit();
		
	}
}

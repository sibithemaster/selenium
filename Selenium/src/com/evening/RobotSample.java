package com.evening;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotSample {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		// TODO Auto-generated method stub

		// setting up the driver
		System.setProperty("webdriver.edge.driver", 
				"E:\\workspace\\Selenium\\msedge\\msedgedriver.exe");

		// creating object for the driver
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.amazon.in/");

		Actions a = new Actions(driver);

		Thread.sleep(3000);
		
		WebElement mobile = driver.findElement(By.linkText("Mobiles"));

		a.contextClick(mobile).build().perform();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
//		r.keyPress(KeyEvent.VK_DOWN);
//
//		r.keyRelease(KeyEvent.VK_DOWN);        
//
//		r.keyPress(KeyEvent.VK_ENTER);
//
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//		WebElement cutomer = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']"));
//
//		a.contextClick(cutomer).build().perform();
//
//		r.keyPress(KeyEvent.VK_DOWN);
//
//		r.keyRelease(KeyEvent.VK_DOWN);        
//
//		r.keyPress(KeyEvent.VK_ENTER);
//
//		r.keyRelease(KeyEvent.VK_ENTER);

//		driver.close();
		
	}
}

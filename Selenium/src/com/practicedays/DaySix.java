package com.practicedays;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DaySix {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		WebElement resume = driver.findElement(By.xpath("//div[@id='heading201']/i[@class='fas fa-minus']"));
		
		Actions action = new Actions(driver);
		
		action.click(resume).perform();
		
//		Robot robot = new Robot();
//		
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
	}
}

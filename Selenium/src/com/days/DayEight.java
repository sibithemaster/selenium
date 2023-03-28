package com.days;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayEight {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	

		WebElement btnGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions actionObj = new Actions(driver);
		actionObj.contextClick(btnGmail).build().perform();	
		
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
		
		
		//  Task 1 - Demo QA - Drag and Drop
		//  Task 2 - Gmail -- you need to select third option
		//  Task 3-Faceook - U need to use Tab and switch between user name and password
		 // and You  have to click the button using Robot

		
	}
}

/*
 * Right click, mouse over, Drag and Drop
 */

/*
 * ////		

 * 
 * 
 *  Right Click
 *  
 *  Actions: C
 *  contextClick() - m
 *  perform()
 * -------------
 * Keyboard Actions
 * 
 * Robot: C
 * 
 * KeyPress() -m
 * KeyRelease() - m 
 * 
 *KeyEvent: C
 *Virtual keyboard
 *Vk_DOWN
 *VK_ENTER
 *VK_ARROW
 *
 *
 *
 *Action 
 *MoveToElement.perform ( Amazon Site)
 *Drag and Dropperform
 *ContextClickperform  - right click and click the third option
 *
 */


package com.practicedays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DayFive {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement course=driver.findElement(By.xpath("//div[@title='Courses' ]"));
		Actions action = new Actions(driver);
		action.moveToElement(course).perform();;
		
		WebElement softwareTesting = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		action.clickAndHold(softwareTesting).perform();;
		
		WebElement software = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		action.click(software).perform();;

	}

}

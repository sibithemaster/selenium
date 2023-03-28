package com.days;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class DaySix {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(45))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		WebElement month=wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) 
			{
			    return driver.findElement(By.xpath("//select[@title='Month']"));
			}			
		});
		month.click();
		Select dropDown = new Select(month);
		dropDown.selectByIndex(2);
		/* Types of wait / Synchronise
		 * Implicit wait -  WebDriver Wait ( For all conditions)
		 * Explicit Wait  - ( Wait for particular conditions)
		 * Fluent Wait - - ( Wait for particular conditions)
		 * 
		 * Thread.sleep()  ---> Java (Forceful wait)
		 */

	}

}

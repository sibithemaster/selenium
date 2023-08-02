package com.evening;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCheck {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");		
		//casting driver
		WebDriver driver=new ChromeDriver();
		//getting the window size
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement createAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createAccount.click();
		//Thread.sleep(5000);
		//no such element- implicit wait
		WebElement firstName=driver.findElement(By.name("firstname"));
		//firstName.sendKeys("sibi");
		//driver.findElement(By.name("lastname")).sendKeys("S");
		//element not visible exception
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(firstName)).sendKeys("sibi");

		//Declare and initialise a fluent wait
                FluentWait wait = new FluentWait(driver);
               //Specify the timout of the wait
               wait.withTimeout(5000, TimeUnit.MILLISECONDS);
               //Sepcify polling time
               wait.pollingEvery(250, TimeUnit.MILLISECONDS);
              //Specify what exceptions to ignore
              wait.ignoring(NoSuchElementException.class)

             //This is how we specify the condition to wait on.
            //This is what we will explore more in this chapter
            wait.until(ExpectedConditions.alertIsPresent());
	}

}

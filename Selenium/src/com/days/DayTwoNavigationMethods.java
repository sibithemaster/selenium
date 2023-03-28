package com.days;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayTwoNavigationMethods {
	public static void main(String[] args) throws Exception {
		//setting the drivers
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");		
		//casting driver
		WebDriver driver=new ChromeDriver();
		//getting the window size
		driver.manage().window().maximize();		
		driver.get("https://github.com/");		
		//navigate methods		
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);	
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}

}

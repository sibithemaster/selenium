package com.daytwo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.FileWriteMode;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		//setting the drivers
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");	
		//casting driver
		WebDriver driver=new ChromeDriver();
		//getting the window size
		driver.manage().window().maximize();		
		//opens the url
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();
		WebElement sign =driver.findElement(By.xpath("//a[text()='Sign In']"));
		sign.click();
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\workspace\\Selenium\\screenshots\\error.png");
		FileUtils.copyFile(source, destination);
	}

}

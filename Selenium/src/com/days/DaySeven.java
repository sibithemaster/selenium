package com.days;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DaySeven {

	public static void takeSnapShot(WebDriver driver) throws IOException 
	{
		DateTimeFormatter IST=DateTimeFormatter.ofPattern("dd/MM-YYY,HH-mm-ss");
		LocalDateTime LST=LocalDateTime.now();
		String time=LST.format(IST);
		String options=time.replace("/","-").replace(",", "-");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//file utils
		
        FileHandler.copy(scrFile, new File("C:\\Users\\DELL\\eclipse-workspace\\sele dropdownbox\\scrrenshotimages"+time+".png"));
		
	   	}

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");		
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        takeSnapShot(driver);
        WebElement newaccount=driver.findElement(By.partialLinkText("Create new account"));
		newaccount.click();
		Thread.sleep(2000);
		takeSnapShot(driver);
	}

}

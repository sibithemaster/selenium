package com.evening;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		DateTimeFormatter date=DateTimeFormatter.ofPattern("yyyy/mm/dd-HH:MM:SS");
		LocalDateTime now = LocalDateTime.now() ;
		System.out.println(date.format(now));
		
		System.setProperty("webdriver.edge.driver",
				"E:\\workspace\\Selenium\\msedge\\msedgedriver.exe");	
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
	//	driver.manage().deleteAllCookies();
		
		driver.get("https://www.bing.com/search?q=weather+report&form=ANNTH1&refig=cc2e8c33b2834b32af7f9b3e8a4731b5");
		
		TakesScreenshot scr = (TakesScreenshot) driver;
		
		File src = scr.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		
		System.out.println("Screenshot-->"+ src);
		//
		String myLocation = "./screen/screenshot"+".png";
        myLocation = "E:\\workspace\\Selenium\\screen\\screenshot"+timestamp()+".png";
		File destFile = new File(myLocation);
		FileUtils.copyFile(src, destFile);
//		driver.close();

	}

	private static String timestamp() {
		return new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date());
	}


}

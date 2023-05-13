package com.days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOneTitleCheck {
	public static void main(String[] args) {		
		//setting the drivers
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");	
		//casting driver
		WebDriver driver=new ChromeDriver();
		//getting the window size
		driver.manage().window().maximize();		
		//opens the url
		driver.get("https://www.google.com/");
		//storing webpage title
		String titleOne=driver.getTitle();
		//printing the title		
		System.out.println(titleOne);		
//		driver.get("https://www.amazon.in/");
//		String titleTwo=driver.getTitle();
	    String titleTwo="https://www.googles.com/";
		System.out.println(titleTwo);
		
		if(titleOne.equals(titleTwo)) {
			System.out.println("Title is same");
		}else {
            System.out.println("Title is different");			
		}
	}
}
//==
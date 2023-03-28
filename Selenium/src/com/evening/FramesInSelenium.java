package com.evening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class FramesInSelenium {

	public static void main(String[] args) {
		
		//setting up the browser
		System.setProperty("webdriver.chrome.driver", 
				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");
    	
        //Creating instance of Chrome driver
        WebDriver driver = new ChromeDriver();

		//hitting the url
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//maximize the window
		driver.manage().window().maximize();

		//single frame
		WebElement one=driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame(one);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		
		//driver.switchTo().defaultContent();
		
		//Multiple frame
		//driver.findElement(By.xpath("//a[@class='analystic'])[2]"));
	}

}

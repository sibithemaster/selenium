package com.evening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class FramesInSelenium {

	public static void main(String[] args) throws InterruptedException {
		//setting up the browser
		System.setProperty("webdriver.chrome.driver", 
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");
        //Creating instance of Chrome driver
        WebDriver driver = new ChromeDriver();
		//hitting the url
		driver.get("https://demo.automationtesting.in/Frames.html");
		//maximize the window
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.id("singleframe"));
		//single frame
		//WebElement one=driver.findElement(By.id("singleframe"));		
		driver.switchTo().frame(element);
		WebElement pass=driver.findElement(By.xpath("//input[@type='text']"));
		pass.sendKeys("Hello");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href='WebTable.html']")).click();
		//Multiple frame
		//driver.findElement(By.xpath("//a[@class='analystic'])[2]"));
	
	//	WebElement multiFrame = driver.findElement(By.)
	    
	}

}

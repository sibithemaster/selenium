package com.evening;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) throws Exception {
		//setting the drivers
				System.setProperty("webdriver.chrome.driver",
						"E:\\workspace\\Selenium\\dr\\chromedriver.exe");	
			//	System.setProperty("webdriver.chrome.driver", 
			//	"C:\\Workspace\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.redbus.in");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
				
				driver.findElement(By.xpath("//li[@id='signInLink']")).click();
				
				WebElement iframe = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
				driver.switchTo().frame(iframe);

			    WebElement frame1=driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
				driver.switchTo().frame(frame1);
			    
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb ']/child::span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();

			//	driver.findElement(By.xpath("/html/body/div/div/div[2]/span[1]")).click();
	}
}

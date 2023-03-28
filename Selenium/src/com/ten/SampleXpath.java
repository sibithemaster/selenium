package com.ten;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
	//	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
		//simple 
	//	Alert alerts=driver.switchTo().alert();
		
	//	System.out.println(alerts.getText());
		
	//	alerts.dismiss();
		
		//confirm
		
//		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//		
//		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
//		
//		Alert alerts=driver.switchTo().alert();
//		
//		System.out.println(alerts.getText());
//		
//		alerts.accept();
		
		
		// prompt
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		
		Alert alerts = driver.switchTo().alert();
		
		alerts.sendKeys("Deena");
        alerts.accept();		
		
		
		
		
		
		
		
//		driver.findElement(By.id("accept")).click();
//		
//		Alert all = driver.switchTo().alert();
//		all.s
//		WebElement user = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
//		user.sendKeys("sakthi@gmail.com");
//		WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
//		password.sendKeys("sakthi123!@");
//		WebElement button= driver.findElement(By.xpath("//button[text()='Log in']"));
//		button.click();
//		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).click();

	}

}

package com.afternoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.letcode.in/windows");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		String driverUrl = driver.getCurrentUrl();

		System.out.println(driverUrl);

		String getTitle = driver.getTitle();

		WebElement name = driver.findElement(By.id("home"));
		name.click();
//		WebElement searchBox =driver.findElement( By.id("twotabsearchtextbox"));
//
//		searchBox.sendKeys(Keys.ENTER);
//
		String Firstwindow = driver. getWindowHandle();
		System. out. println (" Firstwinid "+ Firstwindow ) ;


		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("password of all win"+ allwindows);
		
		
        List<String> list = new ArrayList<String>(allwindows);
        driver.switchTo().window(list.get(0));
        driver.close();
        
        Set<String> allwindow = driver.getWindowHandles();
        list.clear();
        list.addAll(allwindow);
        driver.switchTo().window(list.get(0));
        

        String url = driver.getCurrentUrl();
        System.out.println(url);
//        for(int i=0;i<windows.size();i++)
//        {
//        	
//        }
//		for (String eachWindowId: allwindows) {
//			if(Firstwindow != eachWindowId) {
//				driver.switchTo( ).window( eachWindowId) ;
//			}}

		
//		WebElement tocart = driver.findElement(By.id("add-to-cart-button"));
//		tocart.click();
//
//		driver.close();
//
//		driver. switchTo( ) .window(Firstwinid) ;
//

	}
}

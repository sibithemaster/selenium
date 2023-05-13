package com.practicedays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.security.Password;

public class DayFour {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

        driver.get("http://adactinhotelapp.com/");
        
        WebElement user=driver.findElement(By.id("username"));
        user.sendKeys("sibi");
        
        String s=user.getAttribute("id");
        System.out.println(s);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("sibi1234");
        String t=password.getAttribute("id");
        System.out.println(t);
        
	}

}

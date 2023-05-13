package com.ten;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver", 
			   "C:\\Users\\HP\\git\\selenium\\Selenium\\dr\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       
       driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
       
       WebElement table=driver.findElement(By.id("customers"));
       
       List<WebElement> headers=  table.findElements(By.tagName("tr"));
       
       for (WebElement header : headers) {
		    System.out.println(header.getText());
	    }
	}

}

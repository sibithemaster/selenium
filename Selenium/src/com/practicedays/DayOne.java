package com.practicedays;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {

	public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver", 
    		   "D://chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();
       
       driver.manage().window().maximize();
//       driver.get("http://www.greenstechnologys.com/");

    // Launch Amazon site
       driver.get("https://www.amazon.com");

       // Click on a link that opens a new window
       WebElement newWindowLink = driver.findElement(By.linkText("Customer Service"));
       newWindowLink.click();

       // Get the window handles of all open windows
       Set<String> windowHandles = driver.getWindowHandles();

       // Switch to the new window
       for (String windowHandle : windowHandles) {
           if (!windowHandle.equals(driver.getWindowHandle())) {
               driver.switchTo().window(windowHandle);
               break;
           }
       }

       // Perform actions in the new window
       WebElement newWindowElement = driver.findElement(By.id("new-window-element"));
       newWindowElement.click();

       // Switch back to the main window
       driver.switchTo().window(driver.getWindowHandles().iterator().next());

       // Perform actions in the main window
       WebElement mainWindowElement = driver.findElement(By.id("main-window-element"));
       mainWindowElement.click();

	}

}

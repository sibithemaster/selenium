package com.days;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayTen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");		

        WebDriver driver=new ChromeDriver();
       
        driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize(); 
	
		
		// Type casting , We are adding JS methods to webdriver.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("aabfiwi");
		js.executeScript("arguments[0].setAttribute('value','test@gmail.com')", email);
		//email.getAttribute("value");
		String username = (String) js.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println("username-->"+username);
		Thread.sleep(2000);
		
		WebElement passWord = driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].setAttribute('value','abc@123')", passWord);
		
		WebElement login=driver.findElement(By.name("login"));
//		js.executeScript("arguments[0].click()", login);
		
		
		js.executeScript("arguments[0].scrollIntoView(true)",login);//top to bottom
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)",login);//bottom to top
		js.executeScript("arguments[0].click()", login); 
	}

}
/*Selenium JavascriptExecutor allows users easily to inject and execute Javascript 
code directly within the context of browser window. 
This feature is useful in case when the standard WebDriver's methods do not work
 to find an element on the browser web page.*/


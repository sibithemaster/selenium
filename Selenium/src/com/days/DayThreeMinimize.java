package com.days;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author HP
 *
 */
public class DayThreeMinimize {
	public static void main(String[] args) throws Exception {
		//setting the drivers
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");		
		//casting driver
		ChromeDriver driver=new ChromeDriver();
		//getting the window size
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");		
//		Thread.sleep(2000);
//     	Dimension d = new Dimension(500, 500);
//		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p = new Point(-100, -10);
		driver.manage().window().setPosition(p);		
		
//        WebElement user = driver.findElement(By.id("email"));
//        user.sendKeys("deepak123@gmail.com");
//        
//        WebElement password = driver.findElement(By.id("pass"));
//        password.sendKeys("deepak12");
//        
//        WebElement button = driver.findElement(By.name("login"));
//        button.click();
        
//       driver.close();
//		WebElement e = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		e.click();
//		Thread.sleep(5000);
//		
//		WebElement fname=driver.findElement(By.name("firstname"));
//		fname.sendKeys("sibi");
//		
//		WebElement sname=driver.findElement(By.name("lastname"));
//		sname.sendKeys("subramanian");
//				
//		WebElement mobile=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
//		mobile.sendKeys("9003690138");
//		    
//		WebElement password=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
//		password.sendKeys("sibi1234");
//		
//		WebElement c=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
//		c.click(); 
		
	}
}
//@id='10tst34'


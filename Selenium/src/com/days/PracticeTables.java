package com.days;

//import java.util.concurrent.TimeUnit;
//import java.util.function.Function;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.FluentWait;
//
//public class Fluent {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		System.setProperty("webdriver.chrome.driver",
//				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/browser-windows/");
//
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
//		wait.withTimeout(2, TimeUnit.SECONDS);
//
//		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>()
//				{
//					public Boolean apply(WebDriver arg0) {
//						WebElement element = arg0.findElement(By.id("colorVar"));
//						String color = element.getAttribute("color");
//						System.out.println("The color if the button is " + color);
//						if(color.equals("red"))
//						{
//							return true;
//						}
//						return false;
//					}
//				};
//
//		
//		wait.until(function);
//	}
//}








import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTables 
{
    public static void main(String[] args) {
	
    	System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://toolsqa.com/automation-practice-table");
	
	//Here we are storing the value from the cell in to the string variable
	String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
	System.out.println(sCellValue);
	
	// Here we are clicking on the link of first row and the last column
	driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
	System.out.println("Link has been clicked otherwise an exception would have thrown");
	driver.close();
}
}
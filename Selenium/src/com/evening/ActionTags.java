package com.evening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;

public class ActionTags {

	public static void main(String[] args) {
		// setting up the driver
		System.setProperty("webdriver.chrome.driver", 
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");

		// creating object for the driver
		WebDriver driver = new ChromeDriver();

//		driver.get("http://demo.guru99.com/test/drag_drop.html");

		//maximize the window
		driver.manage().window().maximize();


				Actions a = new Actions(driver);

//		WebElement From=driver.findElement(By.xpath("//a[text()=' BANK ']"));

		//(//li[@class='placeholder'])[1]
//		WebElement To=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

//		a.dragAndDrop(From, To).build().perform();
		
        driver.get("https://www.amazon.in/");		
        
        WebElement w = driver.findElement(By.xpath("//a[text()='Mobiles']"));
        
       // WebElement q= driver.findElement(By.xpath("(//a[text()='Mobiles'])[1]"));
        a.doubleClick(w).build().perform();   
        
	}

}


//
//WebElement fromElement = driver.findElement(By.id("draggable"));
//
//WebElement toElement = driver.findElement(By.id("droppable"));
//
//Element which needs to drag.    		
//    	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
   
//Element on which need to drop.		
//     WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
		
//Using Action class for drag and drop.		
//  Actions act=new Actions(driver);					
//
////Dragged and dropped.		
//    act.dragAndDrop(From, To).build().perform();		

//Actions a = new Actions(driver);
//


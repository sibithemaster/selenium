package com.days;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args) {
	
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",
        		"E:\\workspace\\Selenium\\dr\\chromedriver.exe");				
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
//	//	to get the table id using xpath
//		WebElement main=driver.findElement(By.xpath("//table[@id='customers']"));
		//to get the row elements using tagname
//		List<WebElement> tr=main.findElements(By.tagName("tr"));
//		//iterating each rows  
//		for(int i=0;i<tr.size();i++) {
//			WebElement row=tr.get(i);
//		//	System.out.println(row);
//			//to get heading in the table
//		List<WebElement>th=row.findElements(By.tagName("th"));
//		for(int j=0;j<th.size();j++) {
//			WebElement head=th.get(j);
//			String text=head.getText();
//			System.out.println(text);
//			System.out.println(" ");
//		}
//		//to get data in that table
//		List<WebElement> td=row.findElements(By.tagName("td"));
//		for(int k=0;k<td.size();k++) {
//			WebElement data=td.get(k);
//			String text1=data.getText();
//			System.out.println(text1);
//		}
//	//	System.out.println(" ");
//
//		}
		
		 //to print first row of the table
		
		WebElement main=driver.findElement(By.xpath("//table[@id='customers']"));
		     //to get the row elements using tagname
		List<WebElement>tr=main.findElements(By.tagName("tr"));
			//to get 4th row of the table
		WebElement row=tr.get(3);
		System.out.println(row);
		//to get data in that table
		List<WebElement> td=row.findElements(By.tagName("td"));
		for(int k=0;k<td.size();k++) {
			WebElement data=td.get(0);
			String text1=data.getText();
			System.out.println(text1);
		}
		System.out.println(" ");

		}

	}

//}
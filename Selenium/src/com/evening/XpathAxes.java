package com.evening;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");		
		//casting driver
		WebDriver driver=new ChromeDriver();
		
		//getting the window size
		driver.manage().window().maximize();		
		
		driver.get("https://www.myntra.com");
		
		driver.navigate().to("https://www.myntra.com/dresses?f=Gender%3Amen%20women%2Cwomen");
		
		List<WebElement> dress=driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));		
        
		ArrayList<Integer> a = new ArrayList<Integer>();
			
		for(int i=0;i<dress.size();i++)
		{
			String dressReplace=dress.get(i).getText().replaceAll("Rs. ", "");
			int women = Integer.parseInt(dressReplace);
			a.add(women);
		}
		
		System.out.println(a.size());
		
		int maximumPrice=(int) Collections.max(a);
		System.out.println(maximumPrice);
		
		int minimumPrice=(int) Collections.min(a);
		System.out.println(minimumPrice);
		
		//int a=20
		//int b=30
		
//		for(int i=0;i<allShirtPrice.size();i++)
//		{
//			String replacing=allShirtPrice.get(i).getText().replaceAll("Rs. ", "");
//			int b=Integer.parseInt(replacing);
//			a.add(b);			
//		}
//		
//		int gettingSize = a.size();
//		System.out.println(gettingSize);
//		
//		int maxPrice = (int) Collections.max(a);
//		System.out.println(maxPrice);
//		
//		int minPrice = (int) Collections.min(a);
//		System.out.println(minPrice);
		
		
		
	}

}

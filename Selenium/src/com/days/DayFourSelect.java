package com.days;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DayFourSelect 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");

//		driver.findElement(By.partialLinkText("password?")).click();
		WebElement  signupButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		signupButton.click();

		Thread.sleep(5000); // Forceful wait

		WebElement ddMonth  = driver.findElement(By.id("month"));
		ddMonth.click();
		
//        Thread.sleep(5000);
//
        Select selectObj  = new Select(ddMonth);
//		selectObj.selectByIndex(10);  // Nov
//		// Index will always starts with zero
//
//		Thread.sleep(2000); // Forceful wait
//
//		selectObj.selectByValue("5"); //--> May
//		
//		Thread.sleep(2000);
//
		selectObj.selectByVisibleText("Dec");
//
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("------------------------");

		List<WebElement> list = selectObj.getOptions();
		
		WebElement firstIndex	= list.get(0);
		System.out.println("firstIndex"+firstIndex);
//		
		String firstValue = firstIndex.getText();
		System.out.println("Month Name--->"+firstValue);

		WebElement lastIndex	= list.get(11);
		System.out.println("lasttIndex"+lastIndex);
//         //lastIndex.click();
		String lastValue = lastIndex.getText();
		System.out.println("last Month Name--->"+lastValue);
		
		int length =  list.size()-1;//--> getting last index value
//        int length=list.size();
		System.out.println("length-->"+length);


		WebElement lastIndexDynamic	= list.get(length);//-->length-11
		String lastValueDynamic = lastIndexDynamic.getText();
		System.out.println(lastValueDynamic);

		int middle =  (selectObj.getOptions().size()/2) - 1;

		WebElement middleIndex	= list.get(middle);
		String middleValue = middleIndex.getText();
		System.out.println(middleValue);

		System.out.println("------------------------");

		for(int i=0; i<selectObj.getOptions().size();i++) 
		{

			WebElement index	= list.get(i);
			//	String indexV = index.getAttribute("value");
			//	System.out.println(indexV);		
			String indexValue = index.getText();
			System.out.println((i)+"-->"+indexValue);
        }
	}
}


/*

# <Select>
# <option value = "IND">India</option>//0
# <option value = "US">America</option>//1
# <option value = "Eng">England</option>//2
# </Select>

# selectbyindex(0)
# selectbyvalue("get_attribute("US")
# selectbyvisibletext("India")

# getOptions

# 1. Print all text options (years)
# 2. Print the all attribute options(days)
# 3. Print the last 5 options(Months)
# 4. Print the first 5 options(Months)
# 5. Print the middle option text(Months)
# 6. Print the alternate options text(Months)
# 7. Check any duplicate month is present in dropdown(Months)
# 8. Check any duplicate year is present in dropdown(Months)

 */




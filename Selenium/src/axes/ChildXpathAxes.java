package axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChildXpathAxes {
	public static void main(String[] args) throws InterruptedException { 
		//set the system property            
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");
		
		//creating the object for Chrome driver  
		ChromeDriver driver = new ChromeDriver();
		
		//Navigate to Facebook application 
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize(); 
		//using the child XPath axes
		driver.findElement(By.xpath("(//div[@id='reg_form_box']//child::div)[10]")).click();
		
		Thread.sleep(3000);
		
		System.out.println("child axes is clicked");
		
		//closing the browser               
		driver.close();
	}
} 
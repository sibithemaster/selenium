package js;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("sakthi");;
		
		driver.findElement(By.name("password")).sendKeys("ramprasath");
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}

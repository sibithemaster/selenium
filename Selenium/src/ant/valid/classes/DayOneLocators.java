package ant.valid.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOneLocators 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

	   driver.manage().window().maximize();

		//Locator's id and name
		/*		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("sibi@gmail.com");

		WebElement userPassword=driver.findElement(By.id("pass"));
		userPassword.sendKeys("sibi12345");

		WebElement loginButton=driver.findElement(By.name("login"));
        loginButton.click();
		       

		//link text
		WebElement createAccount=driver.findElement(By.linkText("Create new account"));
		createAccount.click();

		Thread.sleep(3000);

		//xpath
		driver.findElement(By.name("firstname")).sendKeys("sachin");
		driver.findElement(By.name("lastname")).sendKeys("tendulkar");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123450");

*/
		//css-selector
		driver.findElement(By.cssSelector("input#email")).sendKeys("sibi@gmail.com");;		

		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("Sibi1234");

//		driver.findElement(By.cssSelector("button[name='login']")).click();

		driver.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy[role='button']")).click();
     
//      driver.findElement(By.cssSelector("button:contains("Create Account")).click();

		//xpath axes
		

		
	}

}

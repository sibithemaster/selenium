package pom.reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class B 
{

	public static void main(String[] args)
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");  //https://www.facebook.com/
	

//		Loginpageobj.userName(driver).sendKeys("abc@123");
		//loginpageobj pom clas
//		Loginpageobj.passName(driver).sendKeys("123456");
//		Loginpageobj.loginBut(driver).click();
		
		
		PageFactory.initElements(driver,Loginpageobj.class);
//		
//		
		Loginpageobj.userName.sendKeys("abs");
		Loginpageobj.passName.sendKeys("abc@123");
		Loginpageobj.loginBut.click();
	}

}

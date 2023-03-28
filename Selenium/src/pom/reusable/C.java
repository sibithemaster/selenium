package pom.reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {

	public static WebDriver driver;
	public static WebDriver launchBrowser(String url) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\workspace\\\\Selenium\\\\dr\\\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		return driver;
	}
	public static String getmyUrl() {
		String url=driver.getCurrentUrl();
		return url;
	}
	public static String getmyTitle() {
		String title=driver.getTitle();
		return title;
	}
}

package Pomjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");  //https://www.facebook.com/
	

	}

}

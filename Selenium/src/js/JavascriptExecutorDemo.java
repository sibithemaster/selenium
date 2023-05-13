package js;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\workspace\\Selenium\\dr\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		
		driver.manage().window().maximize();
		
		//Flashing
	    WebElement join=driver.findElement(By.xpath("//a[@class='btn green']"));		
//	    JsBase.flash(join, driver);
		
		JsBase.drawBorder(join, driver);
		
	    String title=JsBase.getTitleUsingJs(driver);
	    System.out.println(title);
	    
//	    WebElement login = driver.findElement(By.xpath("(//span[text()='LOG in'])[1]"));
//	    JsBase.clickElementByJavaScript(login, driver);
//	    
//	    JsBase.generateAlertViaJs(driver, "you entered into a login page...");
//	
//		//driver.navigate().refresh();
//	    JsBase.refreshViaJs(driver);
	    
	    WebElement image=driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
//	    JsBase.scrollIntoView(image, driver);
	    JsBase.scrollPageDown(driver);
	}
}

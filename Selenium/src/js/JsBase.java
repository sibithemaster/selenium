package js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsBase 
{

	public static void flash(WebElement element,WebDriver driver)
	{
       String bgcolor = element.getCssValue("backgroundColor");
       for(int i=0;i<100;i++)
       {
    	   changeBackgroundColor("#FF5733",element,driver);//1
    	   
    	   changeBackgroundColor(bgcolor,element,driver);//2
       }
    }

	public static void changeBackgroundColor(String color, WebElement element, WebDriver driver) {		
		JavascriptExecutor js =( (JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+" '",element);
		
		try {
			Thread.sleep(20);			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void drawBorder(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	//driver.getTitle()
	public static String getTitleUsingJs(WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void clickElementByJavaScript(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	} 
	
	public static void generateAlertViaJs(WebDriver driver,String message)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
	}
	
	public static void refreshViaJs(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	
	public static void scrollIntoView(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
}
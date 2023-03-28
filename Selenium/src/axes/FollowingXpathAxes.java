package axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FollowingXpathAxes {
public static void main(String[] args) throws InterruptedException {
//set the system property  
System.setProperty("webdriver.chrome.driver","E:\\workspace\\Selenium\\ex\\chromedriver.exe");
//creating the object for Chrome driver  
WebDriver driver = new ChromeDriver();                                                                              
//Navigate to amazon home page
driver.get("https://www.amazon.in");
driver.manage().window().maximize(); 
//using following XPath axes                  
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//following::a[contains(text(),'Best Sellers')]")).click();
Thread.sleep(3000);
System.out.println("following axes is clicked");
//closing the browser 
driver.close();
}
} 
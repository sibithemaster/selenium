package axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Parent {

	public static void main(String[] args) {
		WebDriver driver;
		WebElement w;
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");	
        driver=new ChromeDriver();
           
         //Launch the application
     	 driver.get("https://www.guru99.com/");
     	 
     	 //Search the element by using PARENT
     w=driver.findElement(By.xpath("//*[@id='rt-feature']//parent::div"));
      	
		//Print the text of the searched element
     	 System.out.println(w.getText());
	 //"123nmnkj1"
	//Close the browser
     driver.quit();

	}}
package com.evening;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

    public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver", 
				"E:\\workspace\\Selenium\\ex\\chromedriver.exe");
    	
        //Creating instance of Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://demoqa.com/select-menu");

        //Maximizing window
        driver.manage().window().maximize();

        //Selecting the multi-select element by locating its id
        Select select = new Select(driver.findElement(By.id("cars")));

        System.out.println(select.isMultiple());
       //Get the list of all the options
        System.out.println("The dropdown options are -");

        List<WebElement> options = select.getOptions();

        for(WebElement option: options)
        {
            System.out.println("Showing all the available "
            		+ "options "+option.getText());
        }
        
        //Using isMultiple() method to verify if the element is multiple-select, 
        //if yes go onto next steps else exit
       if(select.isMultiple()){

            //Selecting option as 'Opel'-- ByIndex
            System.out.println("Select option Opel by Index");
            select.selectByIndex(2);

            //Selecting the option as 'Saab'-- ByValue
            System.out.println("Select option saab by Value");
            select.selectByValue("saab");

            // Selecting the option by text
            System.out.println("Select option Audi by Text");
            select.selectByVisibleText("Audi");

            //Get the list of selected options
            System.out.println("The selected values in the dropdown options are -");

            List<WebElement> selectedOptions = select.getAllSelectedOptions();

            for(WebElement webElement: selectedOptions)
            {	
                System.out.println("Showing selected options "+webElement.getText());
            }

            // Deselect the value "Audi" by Index
            System.out.println("DeSelect option Audi by Index");
            select.deselectByIndex(3);

            //Deselect the value "Opel" by visible text
            System.out.println("Select option Opel by Text");
            select.deselectByVisibleText("Opel");

            //Validate that both the values are deselected
            System.out.println("The selected values after deselect in the dropdown options are -");
            List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();

            for(WebElement selectedOptionAfterDeselectWebElements: selectedOptionsAfterDeselect)
            {
                System.out.println("Showing selected options after deselect "+selectedOptionAfterDeselectWebElements.getText());
            }
            //Step#8- Deselect all values
            select.deselectAll();
    }
    }
}
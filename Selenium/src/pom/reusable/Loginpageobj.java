package pom.reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public  class Loginpageobj 
{
	public static WebDriver driver;	// public variable  int a = 10;

//public static WebElement userName(WebDriver driver) {
//	//int a =10   \\local variable
//	return driver.findElement(By.name("email"));
//	//WebElement userName=driver.findElement(by.id("email");
//	
//}
//public  static WebElement passName(WebDriver driver) {
//	return driver.findElement(By.name("pass"));
//	
//}
//public static WebElement loginBut(WebDriver driver) {
//	return driver.findElement(By.name("login"));
//	
//}
//	}
	
//	@FindBy(how=How.NAME,using = "email")
//	private static WebElement userName;
//	@FindBy(name="pass")
//	private  static WebElement passName1;
//	@FindBy(xpath = "//button[@name='login']")
//	private static WebElement loginBut1;
//	public static WebElement getUserName() {
//		return userName;
//	}
//	public static void setUserName(WebElement userName) {
//		Loginpageobj.userName = userName;
//	}
//	public static WebElement getPassName() {
//		return passName1;
//	}
//	public static void setPassName(WebElement passName) {
//		Loginpageobj.passName1 = passName;
//	}
//	public static WebElement getLoginBut() {
//		return loginBut1;
//	}
//	public static void setLoginBut(WebElement loginBut) {
//		Loginpageobj.loginBut1 = loginBut;
//	}
//	
//	public Loginpageobj() {
//		PageFactory.initElements(driver, this);
//	}
	@FindBy(how=How.NAME,using = "email")
	public static WebElement userName;
	@FindBy(name="pass")
	public  static WebElement passName;
	@FindBy(xpath = "//button[@name='login']")
	public static WebElement loginBut;







}
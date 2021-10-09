package fb_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_ClassForFb {
	
public static WebDriver driver;
	
	public static WebDriver webbrowser(String Browser) {
	if (Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rathe\\eclipse-workspace\\Frame_Work\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
	}
	
	else if(Browser.equalsIgnoreCase("FireFox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rathe\\eclipse-workspace\\Frame_Work\\driver1\\geckodriver.exe");
		driver =new FirefoxDriver();
	}
	else 
	{
		System.out.println("Launch Failed");
	}
	return driver;
	
	}
	
	public static void thisUrl (String str) {
		driver.get(str);
	}
	
	public static void sendkeys (WebElement element , String str) {
	element.sendKeys(str);
		
	}
	public static void clickElement (WebElement element) {
		element.click();
		
	}
	public static void implicit() {
	
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
	}
	public static void SelectByIndex (WebElement ele, int str) {
		Select ss=new Select(ele);
		ss.selectByIndex(str);
	}
	public static void SelectByValue (WebElement ele, String str) {
		Select ss=new Select(ele);
		ss.selectByValue(str);
	}
	public static void SelectByVisibleText (WebElement ele, String str) {
		Select ss=new Select(ele);
		ss.selectByValue(str);
	}



}
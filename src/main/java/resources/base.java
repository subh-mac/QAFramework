package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public static  WebDriver driver;
	
	public static WebDriver initializeDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//ab011eh//Downloads//chromedriver_win32 (6)//chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		return driver;
		
	}
	
	
}

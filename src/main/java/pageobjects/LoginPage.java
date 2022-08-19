package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By username = By.xpath("//*[@id=\"user-name\"]");
	By password = By.id("password");
	By submit = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	
	
	
	public WebElement getlogin() {
	
      return driver.findElement(username);
}
	
	public WebElement getPassword() {
		
	      return driver.findElement(password);
	}
	
	public WebElement submit() {
		
	      return driver.findElement(submit);
	}
}

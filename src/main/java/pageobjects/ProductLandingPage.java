package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductLandingPage {
//objects
	
	WebDriver driver;
	//By Product1 = By.xpath("//div[text()='Sauce Labs Backpack']");	
	By addtocart= By.id("add-to-cart-sauce-labs-backpack");
	By removetext= By.id("remove-sauce-labs-backpack");
	By productlists = By.xpath("//div[starts-with(@class,'inventory_item_name')]");
	
//methods
	
	public ProductLandingPage(WebDriver driver) {
		
		this.driver = driver;		
	}
	
	public  WebElement addtocart() {
		
		return driver.findElement(addtocart);
		
		}
	public  WebElement removetext() {
		
		return driver.findElement(removetext);
		
		}
	
	public List<WebElement> getProductLists() {
		
		return driver.findElements(productlists);
		
	}
	
}

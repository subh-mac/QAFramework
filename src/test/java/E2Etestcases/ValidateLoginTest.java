package E2Etestcases;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.ProductLandingPage;
import resources.base;

public class ValidateLoginTest extends base{

	public static void main(String[] args) {
	
		
		initializeDriver();
		
		LoginPage lp = new LoginPage(driver);
		lp.getlogin().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.submit().click();
		
		
		ProductLandingPage PLP = new ProductLandingPage(driver);
	    PLP.addtocart().click();
	    String buttontext = PLP.removetext().getText();
	    System.out.println(buttontext);
	    if(buttontext.equals("REMOVE")) {
	    	
	    	System.out.println("Button text is REMOVE");
	    	    	
	    }
	    
	   
	    
	    

}
}

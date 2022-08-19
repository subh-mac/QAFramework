package E2Etestcases;

import java.util.List;

import org.openqa.selenium.WebElement;

import pageobjects.LoginPage;
import pageobjects.ProductLandingPage;
import resources.base;

public class ValidateAddtoCartTest extends base {

	public static void main(String[] args) {
		initializeDriver();
		LoginPage lp = new LoginPage(driver);
		lp.getlogin().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.submit().click();
		
		//print the total list of products in Product landing page
		
		ProductLandingPage PLP = new ProductLandingPage(driver);
	   List<WebElement> ProuctList = PLP.getProductLists();
	   
	   System.out.println(ProuctList.size());
	   
	   for (int i=0;i<6;i++) {
		   
		   System.out.println(ProuctList.get(i).getText());
		   
		   
	   }
        
	   TearDown();
	}
	
	
	public static void TearDown() {
		
		driver.close();
	}

}

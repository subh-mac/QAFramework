package E2Etestcases;

import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.LoginPage;
import resources.base;

public class LandingPage extends base{

	public static void main(String[] args) {
		
		initializeDriver();
		
		LoginPage lp = new LoginPage(driver);
		lp.getlogin().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.submit().click();
		
	}

}

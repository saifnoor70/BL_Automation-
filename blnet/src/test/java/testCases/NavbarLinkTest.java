/**
 * 
 */
package com.BLNet.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import page.object.model.LandingPage;
import page.object.model.digitalServicesPage;

/**
 * @author User
 * 
 * We will test all the navigation bar link  
 *
 */
public class NavbarLinkTest {
	@Test
	public void navbarTest()
	{ 
		
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en");
	    LandingPage homeNav = PageFactory.initElements(driver, LandingPage.class);
	    digitalServicesPage digNav = PageFactory.initElements(driver, digitalServicesPage.class);
	    homeNav.navberTest();
	    digNav.homeButton1.click();
	    homeNav.searchButton.sendKeys("5000");
	    
	    
	
	
	}

}

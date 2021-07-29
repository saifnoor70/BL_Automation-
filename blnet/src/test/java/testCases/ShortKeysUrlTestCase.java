
package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper.BrowserFactory;
import pageObjectModel.BondhoSimOfferPOM;
import pageObjectModel.InternetOfferPOM;
import pageObjectModel.LandingPagePOM;
import pageObjectModel.VibesPOM;

/**
 * @author User
 *In Every test Case file , In comment Section We have mentioned What is going to happen(Test Steps) in that particular Test Case for Different Method 
 *  
 * 
 * Read me # In this "bondhoSimOfferTest" We have Test Steps as
 *                                  
 * 
 * Read me # In this "AmarOfferTest" We have Test Steps as
 */
public class ShortKeysUrlTestCase {
	
	@Test
	public void bondhoSimOfferTest() throws InterruptedException
	{
		/**Test Step: 
		 * 
		 * 
		 */
		
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en");
		LandingPagePOM homeP = PageFactory.initElements(driver, LandingPagePOM.class);
		BondhoSimOfferPOM bondhoSimOfferP = PageFactory.initElements(driver, BondhoSimOfferPOM.class);
		SoftAssert softAssert = new SoftAssert();
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		homeP.bondhoSimOfferSK.click();
		softAssert.assertEquals(bondhoSimOfferP.bondhoSimOfferText.getText(),"Bondho SIM Offer");
		softAssert.assertEquals(driver.getCurrentUrl(),"https://www.banglalink.net/en/prepaid/others/500mb-7-days-bondho-sim-offer");
		bondhoSimOfferP.checkStatusButton.click();
		bondhoSimOfferP.phoneNumberInput.sendKeys("01913594372");
	    bondhoSimOfferP.checkStatusButton.click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable(bondhoSimOfferP.crossYouAreNotEligible));
	    bondhoSimOfferP.crossYouAreNotEligible.click();
		
		
		bondhoSimOfferP.detailsDropDown.click();
		bondhoSimOfferP.detailsDropDown.click();	
		softAssert.assertAll();
	}
	@Test
	public void AmarOfferTest()
	{
		/**
		 * Test Step: 
		 * 
		 */
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en");
		LandingPagePOM homeP = PageFactory.initElements(driver, LandingPagePOM.class);
		InternetOfferPOM amarOfferP = PageFactory.initElements(driver, InternetOfferPOM.class);
		SoftAssert softAssert = new SoftAssert();
		
		homeP.internetofferSK.click();
		softAssert.assertEquals(amarOfferP.amarOfferText.getText(),"AmarOffer");
		softAssert.assertEquals(driver.getCurrentUrl(),"https://www.banglalink.net/en/prepaid/internet");
		softAssert.assertAll();
	}
	@Test
	public void VibeTest()
	{
		/**
		 * Test Step: 
		 * 
		 */
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en");
		WebDriverWait wait = new WebDriverWait(driver,30);
		LandingPagePOM homeP = PageFactory.initElements(driver, LandingPagePOM.class);
		VibesPOM vibesP = PageFactory.initElements(driver, VibesPOM.class);
		SoftAssert softAssert = new SoftAssert();
		
		homeP.vibeSK.click();
		vibesP.buttonSeven.click();
		wait.until(ExpectedConditions.elementToBeClickable(vibesP.buttonFive));
		vibesP.buttonFive.click();

		softAssert.assertEquals(driver.getCurrentUrl(),"https://www.banglalink.net/en/digital-services/apps/vibe");
		softAssert.assertAll();
		
	}

}


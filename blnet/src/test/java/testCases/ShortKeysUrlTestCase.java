
package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper.BrowserFactory;
import pageObjectModel.BondhoSimOfferPOM;
import pageObjectModel.InternetOfferPOM;
import pageObjectModel.LandingPagePOM;

/**
 * @author User
 *
 */
public class ShortKeysUrlTestCase {
	
	@Test
	public void bondhoSimOfferTest() throws InterruptedException
	{
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en");
		LandingPagePOM homeP = PageFactory.initElements(driver, LandingPagePOM.class);
		BondhoSimOfferPOM bondhoSimOfferP = PageFactory.initElements(driver, BondhoSimOfferPOM.class);
		SoftAssert softAssert = new SoftAssert();
		
		homeP.bondhoSimOfferSK.click();
		softAssert.assertEquals(bondhoSimOfferP.bondhoSimOfferText.getText(),"Bondho SIM Offer");
		softAssert.assertEquals(driver.getCurrentUrl(),"https://www.banglalink.net/en/prepaid/others/500mb-7-days-bondho-sim-offer");
		bondhoSimOfferP.checkStatusButton.click();
		bondhoSimOfferP.phoneNumberInput.sendKeys("01913594372");
		/**bondhoSimOfferP.checkStatusButton.click();
		 JavascriptExecutor jse =(JavascriptExecutor)driver;
		    jse.executeScript("arguments[0].click()",bondhoSimOfferP.crossYouAreNotEligible);*/
		
		bondhoSimOfferP.detailsDropDown.click();
		Thread.sleep(5000);
		bondhoSimOfferP.detailsDropDown.click();	
		softAssert.assertAll();
	}
	@Test
	public void AmarOfferTest()
	{
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en");
		LandingPagePOM homeP = PageFactory.initElements(driver, LandingPagePOM.class);
		InternetOfferPOM amarOfferP = PageFactory.initElements(driver, InternetOfferPOM.class);
		SoftAssert softAssert = new SoftAssert();
		
		homeP.internetofferSK.click();
		softAssert.assertEquals(amarOfferP.amarOfferText.getText(),"Amar Offer");
		softAssert.assertEquals(driver.getCurrentUrl(),"https://www.banglalink.net/en/prepaid/internet");
		softAssert.assertAll();
	}

}


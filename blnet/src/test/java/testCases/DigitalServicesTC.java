/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper.BrowserFactory;
import pageObjectModel.LandingPagePOM;

/**
 * @author BS558
 *
 */
public class DigitalServicesTC {
	@Test
	public void digitalServices()
	{
		/**
		 * Test Step 
		 * click Dakter Bhai 
		 * Assert Digital Services Text
		 * Assert Dakter Bhai Text
		 */
		WebDriver driver =BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en");
		SoftAssert softAssert = new SoftAssert();
		LandingPagePOM homeP = PageFactory.initElements(driver, LandingPagePOM.class);
		homeP.dakterBhaiDS.click();
		softAssert.assertEquals(homeP.digitalServicesText.getText(),"Digital Services");
		softAssert.assertEquals(homeP.dakterBhaiDS.getText(),"Daktar Bhai");
		softAssert.assertAll();
	}

}

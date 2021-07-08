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
import pageObjectModel.RechargeSubmitPage;

/**
 * @author User
 * *In Every test Case file , In comment Section We have mentioned What is going to happen(Test Steps) in that particular Test Case for Different Method 
 *  
 * 
 * Read me # In this "TitleAndUrlTest" We have Test Steps as 
 */
public class RechargeSubmitTC {
	
	@Test
	public void TitleAndUrlTest()
	{
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en");
		LandingPagePOM homeP = PageFactory.initElements(driver, LandingPagePOM.class);
		RechargeSubmitPage rechS = PageFactory.initElements(driver, RechargeSubmitPage.class);
		SoftAssert softAssert = new SoftAssert();
		
		
		homeP.RechargeAmountMethod("01913594372","50","al.noor@g.bracu.ac.bd");
		softAssert.assertEquals(driver.getCurrentUrl(), "https://www.banglalink.net/en/recharge-submit");
		softAssert.assertEquals(rechS.banglalinkRechargeText.getText(),"Banglalink echarge" );
		softAssert.assertAll();		    
	}

}

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
 * There Will Be TC at the last of the class ma,e of every Test Cases 
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

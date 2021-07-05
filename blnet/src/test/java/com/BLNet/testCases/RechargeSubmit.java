/**
 * 
 */
package com.BLNet.testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import helper.BrowserFactory;
import helper.FrequentMethod;
import page.object.model.LandingPage;
import page.object.model.RechargeSubmitPage;

/**
 * @author User
 *
 */
public class RechargeSubmit {
	
	@Test
	public void TitleAndUrlTest()
	{
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en");
		LandingPage homeP = PageFactory.initElements(driver, LandingPage.class);
		FrequentMethod freqM = PageFactory.initElements(driver, FrequentMethod.class);
		RechargeSubmitPage rechS = PageFactory.initElements(driver, RechargeSubmitPage.class);
		
		
		homeP.RechargeAmountMethod("01913594372","50","al.noor@g.bracu.ac.bd");
		freqM.UrlAssert("https://www.banglalink.net/en/rechargesubmit");
		freqM.TextAssert(rechS.banglalinkRechargeText.getText(),"Banglalink Recharge");
		freqM.AssertAllMethod();
			    
	}

}

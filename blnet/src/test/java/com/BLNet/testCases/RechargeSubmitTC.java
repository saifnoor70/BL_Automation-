/**
 * 
 */
package com.BLNet.testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper.BrowserFactory;
import helper.FrequentMethod;
import page.object.model.LandingPage;
import page.object.model.RechargeSubmitPage;

/**
 * @author User
 * There Will Be TC at the last of the class ma,e of every Test Cases 
 */
public class RechargeSubmitTC {
	
	@Test
	public void TitleAndUrlTest()
	{
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en");
		LandingPage homeP = PageFactory.initElements(driver, LandingPage.class);
		FrequentMethod freqM = PageFactory.initElements(driver, FrequentMethod.class);
		RechargeSubmitPage rechS = PageFactory.initElements(driver, RechargeSubmitPage.class);
		SoftAssert softAssert = new SoftAssert();
		
		
		homeP.RechargeAmountMethod("01913594372","50","al.noor@g.bracu.ac.bd");
		softAssert.assertEquals(driver.getCurrentUrl(), "https://www.banglalink.net/en/recharge-submit");
		softAssert.assertEquals(rechS.banglalinkRechargeText.getText(),"Banglalink echarge" );
		softAssert.assertAll();
		//freqM.UrlAssert("https://www.banglalink.net/en/rechargesubmit");
		//freqM.TextAssert(rechS.banglalinkRechargeText.getText(),"Banglalink echarge");
		//freqM.AssertAllMethod();
			    
	}

}

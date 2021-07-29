/**
 * 
 */
package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper.BrowserFactory;
import pageObjectModel.LandingPagePOM;
import pageObjectModel.digitalServicesPage;

/**
 * @author BS558
 *
 */
public class ViewAllDigitalServicesTC {
	@Test
	public void HoverOnDigitalServices() throws InterruptedException
	{
		WebDriver driver =BrowserFactory.StartBrowser("chrome","https://www.banglalink.net/en");
		LandingPagePOM homeP = PageFactory.initElements(driver,LandingPagePOM.class);
		digitalServicesPage dsP =PageFactory.initElements(driver,digitalServicesPage.class);
		SoftAssert softAssert = new SoftAssert();
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",homeP.viewAllDigitalServices);
		js.executeScript("window.scrollBy(0,-300)");
		homeP.viewAllDigitalServices.click();
		softAssert.assertEquals(driver.getCurrentUrl(),"https://www.banglalink.net/en/digital-services/apps");
		softAssert.assertEquals(dsP.funAndEntertainment.getText(),"Fun  & Entertainment");
		dsP.funAndEntertainment.click();
		System.out.println(dsP.funAndEntertainment.getText());
		softAssert.assertAll();
		
		
	}

}

/**
 * 
 */
package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import pageObjectModel.LandingPagePOM;
import pageObjectModel.digitalServicesPage;
import pageObjectModel.prePaidPage;

/**
 * @author User
 * In Every test Case file , In comment Section We have mentioned What is going to happen in that particular Test Case for Different Method 
 *  
 * 
 * Read me # In this "TillFeedbackRecieved" We have Test Steps as 
 *                        1.Offer NavBar(hover)
 *                        2.Prepaid(click)
 *                        3.Four Days Pack(Click)
 *                        4.Wait(5s)
 *                        5.Five Star Feedback(Click)
 *                        6.Wait(5s)
 *                        7.Feedback Close(Click)
 *                        8.Four Days Pack(Click)
 */
public class HomeToOfferToPrePaidTestTC {
	@Test
	public void TillFeedbackRecieved() throws InterruptedException
	{
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en"); //1. landing to Homepage using StartBrowser method from browserFactory Class
		Actions action = new Actions(driver); 
	    LandingPagePOM homeNav = PageFactory.initElements(driver, LandingPagePOM.class); // Special note :  homeNav is the object of LandingPage class , we can call any variable or method from LandingPage class using this obejct
	    digitalServicesPage digNav = PageFactory.initElements(driver, digitalServicesPage.class); // same as Previous Comment , digNav is the object of digitalServicesPage class
	    prePaidPage prePaidPobj =PageFactory.initElements(driver, prePaidPage.class); // prePaidPobj is the object of prepaidPage Class
	    action.moveToElement(homeNav.offerButton).perform(); //2. Hovering mouse on offer
	    homeNav.prePaid.click();                             //3. Clicking on prepaid 
	    prePaidPobj.fourDaysPackDropDown.click();            //4. Clicking on 4 Days Pack DropDown
	    Thread.sleep(5000);  
	    prePaidPobj.fiveStarFeedback.click();                //5. Clicking on Rate This Page 5 Star  
	    Thread.sleep(5000);
	    prePaidPobj.FeedbackClose.click();
	    Thread.sleep(5000);
	    
	    JavascriptExecutor jse =(JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click()",prePaidPobj.fourDaysPackDropDown); //6. clicking on 4 days pack DropDown using jse	
	}

}

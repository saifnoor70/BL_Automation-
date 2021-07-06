/**
 * 
 */
package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author User
 * Here We have all the Webelement of the page BondhoSimOffer(https://www.banglalink.net/en/prepaid/others/500mb-7-days-bondho-sim-offer)
 */
public class BondhoSimOfferPOM {
	
	WebDriver driver;
	
	public BondhoSimOfferPOM(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[3]/div/section[2]/div/form/div/div[1]/h1")
	public WebElement bondhoSimOfferText;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"number\"]")
	public WebElement phoneNumberInput;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[3]/div/section[2]/div/form/div/div[3]/button")
	public WebElement checkStatusButton;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[3]/div/section[3]/div/div/div[2]/div[3]/div/div/div[2]/div/div[1]")
	public WebElement detailsDropDown;
	
	@FindBy(how=How.XPATH,using= "//*[@id=\"bondho-offer\"]/div/div[1]/button")
	public WebElement crossYouAreNotEligible;
	
	
}

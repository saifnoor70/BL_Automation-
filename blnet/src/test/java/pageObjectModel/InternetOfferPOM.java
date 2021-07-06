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
 *
 */
public class InternetOfferPOM {
	
	WebDriver driver;
	
	public InternetOfferPOM(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[3]/section[2]/div/form/div[1]/h3")
	public WebElement amarOfferText; 
	
	@FindBy(how=How.XPATH,using="//*[@id=\"number_1\"]")
	public WebElement numberInput; 
	
//	@FindBy(how=How.XPATH,using="")
//	public WebElement ; 
//	
//	@FindBy(how=How.XPATH,using="")
//	public WebElement ; 
//	
//	@FindBy(how=How.XPATH,using="")
//	public WebElement ; 		
}

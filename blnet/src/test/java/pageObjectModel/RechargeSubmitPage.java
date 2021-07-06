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
public class RechargeSubmitPage {
WebDriver driver;
	
	public RechargeSubmitPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[3]/section/div/div/div[1]/h1")
	 public WebElement banglalinkRechargeText;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[3]/section/div/div/div[2]/div[3]/div[2]/form/button")
	  public  WebElement continueButton ;
	 
     @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[1]/a")
     public WebElement homeButton;

}

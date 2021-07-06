/**
 * 
 */
package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author User
 * here we have all the webelement of prepaid page (https://www.banglalink.net/en/prepaid/internet)
 */
public class prePaidPage {

	WebElement driver;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[1]/a") 
	public WebElement homeButton;       
	
	@FindBy (how=How.XPATH, using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[2]/span")
	public WebElement offerButton;
	
			 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[2]/ul/li[1]/a")
			 public WebElement prePaid;
			 
			 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[2]/ul/li[2]/a")
			 public WebElement postPaid;
			 
		     @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[2]/ul/li[3]/a")
		     public WebElement roaming;

	
	@FindBy (how=How.XPATH,using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[3]/a")
	public WebElement digitalServicesButton;

	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[4]/a")
    public WebElement businessButton;

	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[5]/a")
	    public WebElement loyaltyButton ;

	 @FindBy(how=How.ID,using="search")
	    public WebElement searchButton;

	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[3]/div/nav/a")
	    public WebElement changeLanguageToBangalButton;


	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[3]/div/nav/ul/li/a/span")
	   public WebElement myAccountButton;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[3]/section[3]/div/div/div[1]/ul[2]/li/div/div[2]/div[1]/div[1]")
     public WebElement threeDaysPackDropDown;
	 
     @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[3]/section[3]/div/div/div[1]/ul[2]/li/div/div[2]/div[2]/div[1]")
	 public  WebElement fourDaysPackDropDown;
	 
     @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[3]/section[3]/div/div/div[1]/ul[2]/li/div/div[2]/div[3]/div[1]")
     public WebElement weeklyPackDropDown;
     
     @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[3]/section[3]/div/div/div[2]/span/span[5]")
     public WebElement fiveStarFeedback;
	
     @FindBy(how=How.XPATH,using="//*[@id=\"feedback\"]/div/div[2]/div/div/div/div/div/div/a")
     public WebElement FeedbackClose;
	
}

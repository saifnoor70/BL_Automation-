/**
 * 
 */
package page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Here we have  All the webElements of Landing Pages
 *
 */
public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
    
	@FindBy(how=How.XPATH, using="//*[@id=\"app\"]/div/div[1]/aside/div/div/section[1]/div[1]/nav/ul/li[1]/a") 
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
	 
	 
	 public void navberTest() {
		 digitalServicesButton.click();
		 
		 
			 
	 }
	 
//	 @FindBy(how=How.XPATH,using="")
//	 public WebElement ;
//	 
//	 @FindBy(how=How.XPATH,using="")
//	  public  WebElement ;
//	 
//    @FindBy(how=How.XPATH,using="")
//    public WebElement ;


}

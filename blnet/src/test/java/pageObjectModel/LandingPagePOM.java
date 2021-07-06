/**
 * 
 */
package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Here we have  All the webElements of Landing Pages
 * Note: Kindly read comment of a coding section before going through code , it will help to understand the code . We have separated 
 * home Page Into many Section 
 * Section 1 = Top Navigation Bar
 * Section 2 = Recharge & Postpaid Bill Payment 
 *
 */
public class LandingPagePOM {
	
	WebDriver driver;
	
	public LandingPagePOM(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
    /** Section : 1  = TOP Navbar , Here we have all the webelement of Top Navigation bar
     * 
     */
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
	 
	 
	 /**Section : 2 = Recharge and Postpaid Bill Amount WebElement
	  * 
	  * 
	  */
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"number_1\"]")
	 public WebElement mobileNumber;
		 
	 @FindBy(how=How.XPATH,using="//*[@id=\"amount_1\"]")
	 public  WebElement rechargeAmount;
		 
	 @FindBy(how=How.XPATH,using="//*[@id=\"email\"]")
	 public WebElement emailAddress ;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[2]/section/div/div/div/form/div[1]/div[4]/button")
	 public WebElement rechargeYourAmountButton;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[2]/section/div/div/div/div/a")
	  public  WebElement addAnotherNumber;
	 
	 public void RechargeAmountMethod(String number, String amount, String email)
	 {
		 //By calling this method we can easily recharge amount at once
		 mobileNumber.sendKeys(number);
		 rechargeAmount.sendKeys(amount);
		 emailAddress.sendKeys(email);
		 rechargeYourAmountButton.click();	 
	 }
	 
	 /**
	  * Section : 3 = Short Keys WebElement
	  * 
	  */
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[3]/section/div/div/button[1]")
	 public WebElement leftArrowSK;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[3]/section/div/div/button[2]")
	 public WebElement rightArrowSK;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[3]/section/div/div/div/div/div[2]/div/div/a/div/i/img")
	  public  WebElement bondhoSimOfferSK;
	 
     @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[3]/section/div/div/div/div/div[3]/div/div/a/span")
     public WebElement internetofferSK;
     
     @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[3]/section/div/div/div/div/div[3]/div/div/a/span")
	  public  WebElement emergencyBalanceSK;
	 
     @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[3]/section/div/div/div/div/div[6]/div/div/a/span")
     public WebElement toffeSK;
     
     @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[3]/section/div/div/div/div/div[7]/div/div/a/span")
     public WebElement amarOffferSK;
     
     @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[3]/section/div/div/div/div/div[8]/div/div/a/span")
	  public  WebElement vibeSK;

     
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

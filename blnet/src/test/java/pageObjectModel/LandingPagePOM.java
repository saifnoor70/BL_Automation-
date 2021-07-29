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

     /**
      * Trending 
      */
     @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[5]/div/div/div[1]/h3")
     public WebElement trendingText;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[5]/div/div/section[2]/div/button[1]")
	 public WebElement prevSlideButton;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[5]/div/div/section[2]/div/button[2]")
	 public WebElement nextSlideButton;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[5]/div/div/section[2]/div/div/div/div[4]/div/div/div/div[2]/div/a")
	 public WebElement tk57;
     
     
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[5]/div/div/section[2]/div/div/div/div[8]/div/div/div/div[2]/div/a/b")
	 public WebElement tk159;
//	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[5]/div/div/section[2]/div/div/div/div[5]/div/div/div/div[2]/div/a")
	  public  WebElement tk64;
	 
	   @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[5]/div/div/section[2]/div/div/div/div[4]/div/div/div/div[3]/ul/li[1]/i/svg/g/path[2]")
	   public WebElement likeTk57;
		 
	   @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[5]/div/div/section[2]/div/div/div/div[4]/div/div/div/div[3]/ul/li[2]/i/svg")
	   public WebElement bookmarkTk57;
		 
	   @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[5]/div/div/section[2]/div/div/div/div[9]/div/div/div/div[3]/ul/li[3]/i/svg")
	   public WebElement shareTk57;
	   
	   /**
	    * Section : Explore Device
	    * 
	    */
	   
	   @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[6]/div/div/div[1]/h2")
	   public WebElement exploreDevice;
	   
	   @FindBy(how=How.CSS,using="#app > div > section.explore.section > div > div > section > div > ul > li.follower")
	   public WebElement iPhoneExploreDevice;
	   
	   @FindBy(how=How.CSS,using="#app > div > section.explore.section > div > div > section > div > ul > li.follower")
	   public WebElement oppoExploreDevice;
	   
	   @FindBy(how=How.CSS,using="#app > div > section.explore.section > div > div > section > div > ul > li.follower")
	   public WebElement samsungexploreDevice;
	   
	   @FindBy(how=How.CSS,using="#app > div > section.explore.section > div > div > section > div > ul > li.follower")
	   public WebElement symphonyExploreDevice;
	   
	   @FindBy(how=How.CSS,using="#app > div > section.explore.section > div > div > section > div > ul > li.follower")
	   public WebElement vivoExploreDevice;
	   
	   @FindBy(how=How.CSS,using="#app > div > section.explore.section > div > div > section > div > ul > li:nth-child(7) > button")
	   public WebElement miExploreDevice;
	   
	   @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[6]/div/div/section/div/div/div/div[7]/div/div/div/aside/div/h3")
	   public WebElement xiamoniSmartPhoneText;
	   /**
	    * Section: Digital Services 
	    * 
	    */
       @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[7]/div/div/div[1]/h3")
       public WebElement digitalServicesText;
       
       @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[7]/div/div/ul/li[1]")
       public WebElement toffeDS;

       
       @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[7]/div/div/ul/li[3]")
       public WebElement dakterBhaiDS;

       @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[7]/div/div/ul/li[2]")
       public WebElement vibeDS;

       @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[7]/div/div/ul/li[4]")
       public WebElement myBLAppDS;

       @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[7]/div/div/ul/li[5]")
       public WebElement gameOnDs;
       
       @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[6]/div/div/div[3]/a")
       public WebElement viewAllOffers;
       
       @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/section[8]/div/div/div[2]/div/a")
       public WebElement viewAllDigitalServices;
       
       
//       @FindBy(how=How.XPATH,using="")
//       public WebElement ;




}

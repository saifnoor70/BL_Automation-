/**
 * 
 */
package page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author User
 *
 */
public class digitalServicesPage {
	
	WebDriver driver;
	public digitalServicesPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[1]/a")
	  public  WebElement homeButton1;
	 
	 @FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[4]/a")
	    WebElement businessButton1;
	 
//   @FindBy(how=How.XPATH,using="")
//   WebElement ;

}

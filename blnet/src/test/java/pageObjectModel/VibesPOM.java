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
public class VibesPOM {
	
	WebDriver driver;
	
	public VibesPOM (WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[3]/section[4]/div/div/div/div[1]/div/ul/li[5]/button")
	public WebElement buttonFive;
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div/div[3]/section[4]/div/div/div/div[1]/div/ul/li[7]/button")
	public WebElement buttonSeven ;
	

}

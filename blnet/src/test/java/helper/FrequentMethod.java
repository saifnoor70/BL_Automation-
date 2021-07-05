/**
 * 
 */
package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

/**
 * @author User
 * Here I will Keep All the Frequently Used Methods
 *
 */
public class FrequentMethod{
	
WebDriver driver;
	
	public FrequentMethod(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	public void UrlAssert(String expectedURL)
	{
	
		SoftAssert softAssert= new SoftAssert();
		String realURL=driver.getCurrentUrl();
		softAssert.assertEquals(realURL,expectedURL);	
	}
	
	public void TextAssert(String realtext,String expectedText)
	{
		
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(realtext,expectedText);
	}
	public void AssertAllMethod()
	{
		
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertAll();
	}

}

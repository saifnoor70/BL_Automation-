/**
 * 
 */
package testCases;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import pageObjectModel.LandingPagePOM;

/**
 * @author BS558
 *
 */
public class TrendingAndOfferSlideTC {
	@Test
	public void trendingTest() throws Throwable
	{
		/**
		 * Test Steps
		 * Take a screenshot of Home Page screen
		 * window scroll down 1000 pixel
		 * Mouse Hover on Tk 57
		 * Fixed wait 10 seconds
		 * Mouse Hover on Tk 64
		 * for Loop (5 times) to click next slide 5 times
		 */
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen.png"));
		LandingPagePOM homeP = PageFactory.initElements(driver, LandingPagePOM.class);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		
		js.executeScript("window.scrollBy(0,1000)");
		action.moveToElement(homeP.tk57).perform();
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		//homeP.nextSlideButton.click();
		action.moveToElement(homeP.tk64).perform();
		
		for(int i = 1;i<= 5;i++)
		{
			System.out.println(i);
		wait.until(ExpectedConditions.elementToBeClickable(homeP.nextSlideButton));
		System.out.println(i);
		homeP.nextSlideButton.click();		
		System.out.println(i);
		}
	}
	@Test
	public void likeBookmarkShareTk57() throws Throwable
	{
		/**
		 * This method isn't completed
		 */
		WebDriver driver = BrowserFactory.StartBrowser("chrome", "https://www.banglalink.net/en");
		LandingPagePOM homeP = PageFactory.initElements(driver, LandingPagePOM.class);
		
		//FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen.png"));
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(homeP.tk159));
		
		homeP.amarOffferSK.click();
		
		Thread.sleep(10000);
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen.png"));
		//homeP.bookmarkTk57.click();
		
	}
	
	

}

/**
 * 
 */
package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import pageObjectModel.LandingPagePOM;

/**
 * @author BS558
 *
 */
public class ExploreDevicesTC {
	@Test
	public void exploreDevicesSlideTest() throws IOException
	{
		WebDriver driver =BrowserFactory.StartBrowser("chrome","https://www.banglalink.net/en");
		LandingPagePOM homeP = PageFactory.initElements(driver,LandingPagePOM.class);
		WebDriverWait wait = new WebDriverWait(driver,30);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",homeP.exploreDevice);
		js.executeScript("window.scrollBy(0,-100)");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen.png"));
		wait.until(ExpectedConditions.elementToBeClickable(homeP.miExploreDevice));
		homeP.miExploreDevice.click();
		//wait.until(ExpectedConditions.visibilityOf(homeP.xiamoniSmartPhoneText));
		
		File screenshotFile1 = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile1, new File(".//screenshot/screen1.png"));
	}

}

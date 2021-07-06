package blnet;

import java.util.concurrent.TimeUnit;

/**
 * This is initial starting of Automation , This has no relation with Other Three Packages helper, page.object.model & 
 * com.BLNettestCases
 */

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPageUrl {
	
	@Test
	public void getIntoSite() {
	
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	 driver.navigate().to("https://www.banglalink.net/en");
	 driver.manage().window().maximize();
	 //driver.close();

}
	@Test
	 public void goPrepaid() throws InterruptedException { 
		 //Enter into offer>Prepaid>Click 3 Days Offer Dropdown >wait 5 seconds> Minimize 3 Days dropdown
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 Actions action = new Actions(driver); 
		 driver.navigate().to("https://www.banglalink.net/en");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 action.moveToElement(driver.findElementByXPath("//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[2]/span")).perform(); //Hover offer
		 driver.findElementByXPath("//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[2]/ul/li[1]/a").click(); //Enter pre paid from offer drop down
		// driver.findElementById("number_1").sendKeys("01918363693");
		 //driver.findElementByXPath("//*[@id=\"app\"]/div/div[1]/header/div/div/div[2]/nav/ul/li[1]/a").click(); //return to home clicking home button 
		 //Thread.sleep(2000);
		 driver.findElementByXPath("//*[@id=\"app\"]/div/div[3]/section[3]/div/div/div[1]/ul[2]/li/div/div[2]/div[1]/div[1]").click();//click 3 day Offer
		// driver.findElementByXPath("//*[@id=\"app\"]/div/div[3]/section[3]/div/div/div[1]/ul[2]/li/div/div[2]/div[2]/div[1]").click();//click 4 days pack
		 Thread.sleep(5000);
//		WebElement element = driver.findElementByXPath("//*[@id=\"app\"]/div/div[3]/section[3]/div/div/div[1]/ul[2]/li/div/div[2]/div[1]/div[1]");//minimize 3days pack
//		JavascriptExecutor jse =(JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click()",element);
		
		driver.findElementByXPath("//*[@id=\"app\"]/div/div[3]/section[3]/div/div/div[1]/ul[2]/li/div/div[2]/div[1]/div[2]/div[1]/div[3]/a").click();
		driver.findElementByXPath("//*[@id=\"app\"]/div/div[3]/div/section[2]/div/div[2]/div[2]/div[3]/span/span[5]").click();
		
		// driver.findElementByXPath("//*[@id=\"app\"]/div/div[3]/section[3]/div/div/div[1]/ul[2]/li/div/div[2]/div[2]/div[1]").click();//minimize 4days pack
		 // driver.close();
	 }
	@Test
	public void allOffer()
	{
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
	//	 Actions action = new Actions(driver); 
		 driver.navigate().to("https://www.banglalink.net/en");
		 driver.findElementByXPath("//*[@id=\"app\"]/div/section[5]/div/div/div[2]/a").click();
		
		
	}
}

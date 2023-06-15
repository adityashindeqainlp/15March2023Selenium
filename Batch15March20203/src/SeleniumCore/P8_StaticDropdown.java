package SeleniumCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P8_StaticDropdown {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Step - 1 Set The Key and Value For the Selenium WebDriver
		System.setProperty("webdriver.chrome.driver",
				"D://Aditya_In_lp//Java//Setup For Java and Ecllipse//Drivers//chromedriver_win32//chromedriver.exe");

		// Step - 2 Create Object of chromedriver and refer it by webdriver reference variable 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 //Step - 3 Visit a WebPage 
		 driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		 Thread.sleep(3000);
		
		//Step-4 
		//Locate the Year Dropdown
		 WebElement yearTab = driver.findElement(By.id("year"));
		
	    //Locate the Month Dropdown 
		WebElement monthTab = driver.findElement(By.id("month"));
		
	    //Locate the day Dropdown
		WebElement dayTab = driver.findElement(By.id("day"));
		
		//Step-5 Action -->  Create objcet of Select class pass the args & store in reference variable 
		Select year = new Select(yearTab);
		Select month = new Select(monthTab);
		Select day = new Select(dayTab);
		
		year.selectByValue("1996");
		month.selectByVisibleText("Jun");
		day.selectByIndex(28);
		
		Thread.sleep(2500);
		
		driver.quit();
		
		 
	}

}

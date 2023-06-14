package SeleniumCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * aditya shinde Java + Selenium Core 09-Jun-2023 4:11:57 pm
 */
public class P2_BrowserLaunchingThroughWebdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Step - 1 Set The Key and Value For the Selenium WebDriver
		System.setProperty("webdriver.chrome.driver",
				"D://Aditya_In_lp//Java//Setup For Java and Ecllipse//Drivers//chromedriver_win32//chromedriver.exe");

		// Step - 2 Create Object And Store it in WebDiver Interface reference variable
		WebDriver driver = new ChromeDriver(); // 100

		// Step 3 Launch the browser and visit URL page
		driver.get("https://www.google.com/");

		Thread.sleep(5000);

		// Step 4 Close the Browser
		driver.quit();

	}

}

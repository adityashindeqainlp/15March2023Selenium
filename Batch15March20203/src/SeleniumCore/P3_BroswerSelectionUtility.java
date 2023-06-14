package SeleniumCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * aditya shinde Java + Selenium Core 12-Jun-2023 2:07:36 pm
 */
public class P3_BroswerSelectionUtility {

	// Global Variable
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Step 1 Set the string variable
		String browserName = "safari";

		// Condition 1 If the Browser is Chrome
		if (browserName.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"D://Aditya_In_lp//Java//Setup For Java and Ecllipse//Drivers//chromedriver_win32//chromedriver.exe");

			driver = new ChromeDriver();

		}
		// Condition 2 If the Browser is Edge
		else if (browserName.equalsIgnoreCase("Edge")) {

			System.setProperty("webdriver.edge.driver",
					"D://Aditya_In_lp//Java//Setup For Java and Ecllipse//Drivers//edgedriver_win64//msedgedriver.exe");

			driver = new EdgeDriver();

		}
		// Condition 3 If the Browser is Firefox
		else if (browserName.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.geko.driver",
					"D://Aditya_In_lp//Java//Setup For Java and Ecllipse//Drivers//geckodriver-v0.32.2-win64//gekodriver.exe");

			driver = new FirefoxDriver();

		} else {

			System.setProperty("webdriver.chrome.driver",
					"D://Aditya_In_lp//Java//Setup For Java and Ecllipse//Drivers//chromedriver_win32//chromedriver.exe");

			driver = new ChromeDriver();
		}

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);

		driver.quit();

	}

}

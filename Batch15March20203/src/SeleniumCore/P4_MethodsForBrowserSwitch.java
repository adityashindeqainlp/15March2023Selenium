package SeleniumCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * aditya shinde Java + Selenium Core 12-Jun-2023 2:39:07 pm
 */
public class P4_MethodsForBrowserSwitch {

	public static WebDriver driver;

	public static String browserName;

	public static void launch(String browser) {

		// Step 1 Set the string variable
		browserName = browser;

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

		}

		else {

			System.setProperty("webdriver.chrome.driver",
					"D://Aditya_In_lp//Java//Setup For Java and Ecllipse//Drivers//chromedriver_win32//chromedriver.exe");

			driver = new ChromeDriver();
		}

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Step 1 Launch the respective browser by calling launch method
		launch("chrome");

		// Step 2 Visit URL

		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(driver.getTitle());

		Thread.sleep(5000);

		driver.quit();

	}

}

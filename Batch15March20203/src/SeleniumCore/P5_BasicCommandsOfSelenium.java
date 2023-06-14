package SeleniumCore;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * aditya shinde Java + Selenium Core 12-Jun-2023 2:53:25 pm
 */
public class P5_BasicCommandsOfSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step - 1 Set The Key and Value For the Selenium WebDriver
		System.setProperty("webdriver.chrome.driver",
				"D://Aditya_In_lp//Java//Setup For Java and Ecllipse//Drivers//chromedriver_win32//chromedriver.exe");

		// Step - 2 Create Object And Store it in Browser reference variable
		ChromeDriver driver = new ChromeDriver(); // 50

		// Step - 3 Maximize the Execution Screen
		driver.manage().window().maximize();

		// Step 4 Launch the browser and visit URL page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		// Step 5 Navigate to different pages / web site

		driver.navigate().to("http://automationpractice.pl/index.php");

		// Step 6 Navigate Back

		driver.navigate().back();

		driver.navigate().forward();

		// Step 7 Navigate Refresh();

		driver.navigate().refresh();

		driver.quit();
	}
}

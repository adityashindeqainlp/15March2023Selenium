package SeleniumCore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * aditya shinde Java + Selenium Core 12-Jun-2023 3:23:54 pm
 */
public class P6_BasicCommandsOfSelenium {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);

		// Validate the page title
		String pageTitle = driver.getTitle();

		if (pageTitle.equals("OrangeHRM")) {

			System.out.println("Title is matching and test case pass : " + pageTitle);
		} 
		else {
			System.out.println("Title is not matching and test case fail: " + pageTitle);

		}
		//Get the string Url 
		String pageUrl = driver.getCurrentUrl();

		System.out.println("Current Url of page : " + pageUrl);

		driver.quit();

	}

}

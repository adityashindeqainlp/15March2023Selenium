package SeleniumCore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P15_AllCheckBoxSelection {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Step - 1 Set The Key and Value For the Selenium WebDriver
		System.setProperty("webdriver.chrome.driver",
				"D://Aditya_In_lp//Java//Setup For Java and Ecllipse//Drivers//chromedriver_win32//chromedriver.exe");

		// Step - 2 Create Object of chromedriver and refer it by webdriver reference
		// variable
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		// Step - 3 Visit a WebPage
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);

		// Step - 4 Find common locator for all check box and then perform click operation
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));

		for (WebElement checkbox : checkboxes) {

			if (checkbox.isDisplayed() == true && checkbox.isEnabled() == true) {
				System.out.println("Enabled and displayed");
				checkbox.click();

				if (checkbox.isSelected() == true) {
					System.out.println("Testcase is pass");
				}
			} else {
				System.out.println("Testcase is failed");
			}
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
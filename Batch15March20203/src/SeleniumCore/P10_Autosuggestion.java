package SeleniumCore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_Autosuggestion {

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

		// Step 4 - Locate Auto Suggestive Drop down , click and enter input
		WebElement autoSuggest = driver.findElement(By.id("autocomplete"));
		autoSuggest.click();
		autoSuggest.sendKeys("al");

		Thread.sleep(2000);

		// Step 5 - Locate the hidden list items
		List<WebElement> options = driver.findElements(By.className("ui-menu-item-wrapper"));

		for (WebElement option : options) {

			if (option.getText().equalsIgnoreCase("algeria")) {

				String name = option.getText();
				System.out.println(name);
				option.click();
				break;
			}
		}

		Thread.sleep(2000);
		driver.quit();
	}

}

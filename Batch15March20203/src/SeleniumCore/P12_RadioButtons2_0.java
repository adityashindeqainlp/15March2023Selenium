package SeleniumCore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_RadioButtons2_0 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

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

		// Step - 4 Locate the common element between the radio buttons
		List<WebElement> button = driver.findElements(By.className("radioButton"));

		for (int i = 0; i < button.size(); i++) {

			if (i == 2) {

				boolean check1 = button.get(i).isDisplayed();
				boolean check2 = button.get(i).isEnabled();

				if (check1 == true && check2 == true) {

					System.out.println("Button is displayed and enabled");

					button.get(i).click();
				} else {
					System.out.println("Button is not displayed and enabled");
				}

				boolean check3 = button.get(i).isSelected();

				if (check3 == true) {

					System.out.println("Button is clickable");
					break;
				} else {

					System.out.println("Button is not clickable");
				}

			}

		}

		Thread.sleep(2000);
		driver.quit();

	}

}

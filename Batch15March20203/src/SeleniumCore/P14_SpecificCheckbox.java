package SeleniumCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P14_SpecificCheckbox {

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

		// Step - 4 Locate Check box and validate
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));

		boolean check1 = checkbox.isDisplayed();
		boolean check2 = checkbox.isEnabled();

		if (check1 == true && check2 == true) {

			System.out.println("Eanbled and Displayed");

			checkbox.click();

			boolean check3 = checkbox.isSelected();

			if (check3 == true) {
				System.out.println("Test case is pass");
			}
		} else {

			System.out.println("Not Eanbled and Displayed Test case Fail");
		}

		Thread.sleep(2500);

		driver.quit();
	}

}

package SeleniumCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_RadioButtons {

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

		// Step - 4 Locate the radio button and click

		WebElement button = driver.findElement(By.xpath("//*[@value='radio1']"));

		boolean check1 = button.isDisplayed();
		boolean check2 = button.isEnabled();

		if (check1 == true && check2 == true) {

			System.out.println("Button is displayed and enabled");
			button.click();
		} else {

			System.out.println("Button is not displayed and enabled");
		}

		boolean check3 = button.isSelected();

		if (check3 == true) {

			System.out.println("Button is selected Test case pass");
		} else {

			System.out.println("Button is not selected Test case fail");
		}

		Thread.sleep(2500);

		driver.quit();

	}

}

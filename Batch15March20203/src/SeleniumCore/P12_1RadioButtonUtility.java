package SeleniumCore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_1RadioButtonUtility {

	public static WebDriver driver;

	public void buttonSelection(int num) {

		int number = num;

		List<WebElement> button = driver.findElements(By.className("radioButton"));

		for (int i = 0; i < button.size(); i++) {

			if (i == number) {

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

	}

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

		// Invoke Radio buttons selection method and pass the input

		P12_1RadioButtonUtility selection = new P12_1RadioButtonUtility();

		selection.buttonSelection(1);

		Thread.sleep(2500);

		driver.quit();
	}

}

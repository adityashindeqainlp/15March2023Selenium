package SeleniumCore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9_DynamicDrop {

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
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		Thread.sleep(3000);
		// Step 4 Pick the year from dropdown
		List<WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));
		
		for (int i = 0; i < years.size(); i++) {
			if (years.get(i).getText().equalsIgnoreCase("1996")) {
				years.get(i).click();
				String yeno = years.get(i).getText();
				System.out.println(yeno);
				break;
			}
		}
		// Step 6 Pick the month from dropdown
		List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));
		for (WebElement month : months) {
			if (month.getText().equalsIgnoreCase("jun")) {
				month.click();
				break;
			}
		}
		// Step 7 Pick a day from dropdown
		List<WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));
		for (WebElement day : days) {
			if (day.getText().equalsIgnoreCase("29")) {
				day.click();
				break;
			}
		}
		driver.quit();
	}
}

package SeleniumCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P18_ScrollOfWebTable {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		// Step 1 Launch the browser and hit the url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);

		// Step 2 Type Cast the driver to JavascriptExexcutor
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Step 3 Invoke Execute Script Method and provide script
		// ("window.scrollBy(0,500)","")helps to scroll webpage

		js.executeScript("window.scrollBy(0,500)", "");

		Thread.sleep(2500);

		pending: js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,100)", "");
		Thread.sleep(5000);

		driver.quit();

	}

}

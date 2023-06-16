package SeleniumCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P17_ScrollingOfWebpage {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		//Step 1 Launch the browser and hit the url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		
		//Step 2 Type Cast the driver to JavascriptExexcutor 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Step 3 Invoke executeScript Method and provide java script for scroll down
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}

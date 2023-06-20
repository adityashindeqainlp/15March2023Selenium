package SeleniumCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P24_ConfirmationAlert {

	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Step 1 Launch the browser and hit URL
		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		// Step 2 Locate the element and perform click operation on it
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();
		Thread.sleep(2000);
		
	   //Step 3 Handling confirmation alert
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().dismiss();
		
		driver.quit();

	}	
}

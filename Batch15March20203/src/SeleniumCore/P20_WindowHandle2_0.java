package SeleniumCore;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P20_WindowHandle2_0 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Step 1 Launch browser and hit url

		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		// Locate the link and click on it
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);

		// Step 3 Capture all window id present on web application
		Set<String> ids = driver.getWindowHandles();
		
		for(String id : ids) {
			
			System.out.println(id);
		}
		
		
		

		// Step 4 Iterate over all set of window ids and place it inside Iterate class
		// reference variable
		Iterator<String> it = ids.iterator();

		String id1 = it.next();
		String id2 = it.next();

		System.out.println(id1);
		System.out.println(id2);

		// Step 5 Switch the driver scope on the basis of window id
		driver.switchTo().window(id1);
		System.out.println(driver.getTitle());

		Thread.sleep(5000);

		driver.switchTo().window(id2);
		System.out.println(driver.getTitle());

		Thread.sleep(5000);
		
		driver.switchTo().window(id1);
		Thread.sleep(1000);
		driver.quit();
	}

}

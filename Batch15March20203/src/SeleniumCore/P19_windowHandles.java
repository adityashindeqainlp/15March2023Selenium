package SeleniumCore;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P19_windowHandles {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		// Step 1 Launch the browser and hit the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

		// Step 2 use Get Window Handle Method and get Window Id 
		String id1 = driver.getWindowHandle();
		System.out.println(id1);
		Thread.sleep(2500);

		// Locate the link and click on it
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(5000);
		Set <String> ids = driver.getWindowHandles();
		for(String id : ids) {
			System.out.println(id);
			if(id1.equalsIgnoreCase(id)) {
				driver.switchTo().window(id);
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
			}
		}
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		driver.quit();
	}
}

package SeleniumCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P28_KeyboardActions {

	public static WebDriver driver;

	public static Actions act;

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		// Step 1 Launch the browser and hit URL
		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);

		// Step 2 Locate the Text Box and place it in reference variable
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		Thread.sleep(2000);
		// Step 3 Invoke action class and perform keyboard operations
		act = new Actions(driver);

		act.sendKeys(searchBar, "iphone 14").keyDown(Keys.SHIFT).sendKeys(" pro").keyUp(Keys.SHIFT).sendKeys(" max")
				.build().perform();

		Thread.sleep(5000);
		driver.quit();

	}

}

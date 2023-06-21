package SeleniumCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @Author -- Aditya Shinde Java + Selenium 21-Jun-2023 2:17:31 pm
 **/
public class P29_CaptureCSSValue {

	public static WebDriver driver;

	public static Actions act;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Step 1 Invoke the browser and hit the url
		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/#colorpicker");
		Thread.sleep(2000);

		//Step 2 Identify the iframe and switch the driver focus into 
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);

		//Step 3 Identify the element 
		WebElement slider1 = driver.findElement(By.xpath("//div[@id='red']//span"));
		WebElement slider2 = driver.findElement(By.xpath("//div[@id='green']//span"));
		WebElement slider3 = driver.findElement(By.xpath("//div[@id='blue']//span"));

		Thread.sleep(2000);

		//Step 4 Invoke action class and the perform the action 
		act = new Actions(driver);
		act.clickAndHold(slider1).moveToElement(slider1, -100, 0).release().build().perform();
		Thread.sleep(1000);
		act.clickAndHold(slider2).moveToElement(slider2, 100, 0).release().build().perform();
		Thread.sleep(1000);
		act.clickAndHold(slider3).moveToElement(slider3, 150, 0).release().build().perform();
		Thread.sleep(1000);

		//Step 5 Locate the element and get the CSS value from it 
		WebElement value = driver.findElement(By.xpath("//div[@id='swatch']"));
		String rgb = value.getCssValue("background-color");

		System.out.println(rgb);

		if (rgb.equals("rgba(170, 224, 187, 1)")) {

			System.out.println("Testcase is pass");
		} else {

			System.out.println("Testcase is fail");
		}

		driver.quit();

	}

}

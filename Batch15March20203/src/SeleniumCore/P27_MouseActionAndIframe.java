package SeleniumCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P27_MouseActionAndIframe {

	public static WebDriver driver;

	public static Actions act;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Step 1 Launch the browser and hit URL
		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(2000);

		// Step 2 Switch driver focuse to iframe
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);

		// Step 3 Locate the element and store it in ref. var.
		WebElement sliderHandle = driver.findElement(By.xpath("//div[@id='slider']//span"));
		Thread.sleep(2000);

		// Step 4 Invoke actions class to perform operations
		act = new Actions(driver);
		act.clickAndHold(sliderHandle).moveToElement(sliderHandle, 500, 0).release().build().perform();
		Thread.sleep(2000);

		// Step 5 Shift a driver focus from iframe to main webpage
		driver.switchTo().defaultContent();
		Thread.sleep(1000);

		// Step 6 Naviagte to new module by using hyper-links
		driver.findElement(By.xpath("//a[text() = 'Droppable']")).click();

		// Step 7 Switch driver focus to Iframe
		WebElement iframe1 = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe1);

		// Step 6 Locate the source and target element
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Thread.sleep(2000);

		// Step 7 Perform Drag and Drop

		act.dragAndDrop(source, target).build().perform();

	}

}

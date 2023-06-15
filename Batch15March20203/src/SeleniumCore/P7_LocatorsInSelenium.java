package SeleniumCore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * aditya shinde Java + Selenium Core 12-Jun-2023 4:09:15 pm
 */
public class P7_LocatorsInSelenium {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Type 1 "id" Locator
		WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
		checkBox.click();

		// Type 2 "name" Locator
		driver.findElement(By.name("checkBoxOption2")).click();
		Thread.sleep(2000);

		// Type 3 "className" Locator
		List<WebElement> buttons = driver.findElements(By.className("radioButton"));

		for (int i = 0; i <= buttons.size(); i++) {

			if (i == 1) {

				buttons.get(i).click();
			}
		}

		Thread.sleep(2000);

		// Type 4 "LinkText" Locator

		// driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		// driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		// Type 5 "PartialLinkText" Locator
		// driver.findElement(By.partialLinkText("Orange")).click();
		Thread.sleep(2000);

		// Type 6 "Xpath" Locator
		// Xpath Expression Syntax -->
		// Tagname[@Attribute = 'Attribute Value']
		// select[@id='dropdown-class-example']

		driver.navigate().back();

		Thread.sleep(2000);
		// Type 1 - Xpath
		// driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();

		// Type 2 - Xpath
		// driver.findElement(By.xpath("//select[@name='dropdown-class-example']")).click();

		// Type 3 - Xpath with And
		// driver.findElement(By.xpath("//select[@id='dropdown-class-example'and@name='dropdown-class-example']")).click();

		// Type 4 - Xpath with OR
		// driver.findElement(By.xpath("//select[@id='dropdown-class-example'or@name='dropdown-class-example']")).click();

		// Type 5 - Xpath with * expression
		// driver.findElement(By.xpath("//*[@name=\"dropdown-class-example\"]")).click();

		// Type 6 - Xpath with Contains()
		// driver.findElement(By.xpath("//*[contains(@id,'dropdown-class-example')]")).click();

		// Type 7 - Absolute Xpath
		// -->/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[9]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i[1]

		// Type 8 - Xpath follows Xpath
		// driver.findElement(By.xpath("//*[@id='dropdown-class-example'][@name='dropdown-class-example']")).click();

		// Type 9 - Xpath with Text() , Orange HRM
		// driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));

		// Type B Xpath Axes

		// Ancestor
		// "//select[@id="dropdown-class-example"]//ancestor::body"

		// Type 7 CSS Selector
		// Expression SYNTAX --> Tagname[Attribute='AttributeValue']

		// Type 1
		// driver.findElement(By.cssSelector("select[id='dropdown-class-example']")).click();

		// Type 2
		// driver.findElement(By.cssSelector("[id='dropdown-class-example']")).click();

		// Type 3 CSS Follows CSS
		// driver.findElement(By.cssSelector("[id='dropdown-class-example'][name='dropdown-class-example']"));

		// Type 4 CSS to identify id
		Thread.sleep(2000);
		// driver.findElement(By.cssSelector("#checkBoxOption3")).click();

		// Type 5 CSS to identify class

		List<WebElement> rbuttons = driver.findElements(By.cssSelector(".radioButton"));

		for (int i = 0; i <= rbuttons.size(); i++) {

			if (i == 3) {

				rbuttons.get(i).click();
			}
		}

		Thread.sleep(2000);

		driver.quit();
	}

}

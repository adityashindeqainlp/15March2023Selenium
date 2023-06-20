package SeleniumCore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P22_BootStrapDatePicker {

	public static WebDriver driver;

	public void selectDate(String monthYear, String day) throws InterruptedException {

		driver.findElement(By.id("datepicker1")).click();
		Thread.sleep(5000);

		int i = 0;

		while (i == 0) {

			String mtyr = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-title\"]")).getText();

			if (!(mtyr.equalsIgnoreCase(monthYear))) {

				driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();

			} else {

				break;
			}

		}

		List<WebElement> days = driver.findElements(By.xpath("//tbody//tr//td//a"));

		for (WebElement dt : days) {
			if (dt.getText().equalsIgnoreCase(day)) {

				dt.click();
			}

		}

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Datepicker.html");

		P22_BootStrapDatePicker obj = new P22_BootStrapDatePicker();
		obj.selectDate("June 1996", "29");

	}

}

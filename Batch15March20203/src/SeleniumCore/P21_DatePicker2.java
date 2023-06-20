package SeleniumCore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P21_DatePicker2 {

	public static WebDriver driver;

	public void selectPrev20Years(String year, int clicks) throws InterruptedException {
		for (int i = 1; i <= clicks; i++) {
			List<WebElement> ls = driver.findElements(By.xpath("//*[@title=\"Change the year\"]//option"));
			Thread.sleep(5000);
			ls.get(0).click();
		}
		selectYear(year);
	}

	public void selectYear(String year) {
		WebElement yearsTab = driver.findElement(By.xpath("//*[@title='Change the year']"));
		Select yearsSelction = new Select(yearsTab);
		yearsSelction.selectByVisibleText(year);
	}

	public void selectMonth(String month) {
		WebElement monthTab = driver.findElement(By.xpath("//select[@title='Change the month']"));
		Select mt = new Select(monthTab);
		mt.selectByVisibleText(month);
	}

	public void selectDay(String day) {
		List<WebElement> days = driver.findElements(By.xpath("//tbody//tr//td//a"));
		for (WebElement dt : days) {
			if (dt.getText().equalsIgnoreCase(day)) {
				dt.click();
			}
		}
	}
	public void clickOnCalender() {
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
	}

	public void dateSelection(String year, String month, String day, int clicks) throws InterruptedException {

		clickOnCalender();
		Thread.sleep(5000);
		selectPrev20Years(year, clicks);
		selectMonth(month);
		selectDay(day);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Datepicker.html");

		P21_DatePicker2 dob = new P21_DatePicker2();
		dob.dateSelection("1996", "June", "29", 1);
		Thread.sleep(5000);
		driver.quit();

	}

}

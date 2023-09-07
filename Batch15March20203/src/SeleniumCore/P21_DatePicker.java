package SeleniumCore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Author -- Aditya Shinde Java + Selenium 05-Sep-2023 5:34:34 pm
 **/
public class P21_DatePicker {

	public static WebDriver driver;

	public void clickOnDatePicker() {

		driver.findElement(By.id("datepicker2")).click();

	}

	public void selectYearMethod(String yearFromUser) {

		WebElement yearDropDown = driver.findElement(By.xpath("//*[@title='Change the year']"));
		Select year = new Select(yearDropDown);
		year.selectByVisibleText(yearFromUser);

	}

	public void fetchYear(String yearFromUser, int clicks) throws InterruptedException {

		for (int i = 1; i <= clicks; i++) {
			List<WebElement> ls = driver.findElements(By.xpath("//*[@title='Change the year']//option"));
			ls.get(0).click();
			Thread.sleep(2000);
		}

		selectYearMethod(yearFromUser);
	}

	public void selectMonth(String monthFromUser) {

		WebElement monthDropDown = driver.findElement(By.xpath("//*[@title='Change the month']"));
		Select month = new Select(monthDropDown);
		month.selectByVisibleText(monthFromUser);

	}

	public void selectDay(String dayFromUser) {

		List<WebElement> days = driver.findElements(By.xpath("//tbody//tr//td//a"));

		for (WebElement day : days) {

			if (day.getText().equals(dayFromUser)) {

				day.click();

			}

		}

	}

	public void selectDOB(String yearFromUser, String monthFromUser, String dayFromUser, int clicks) throws InterruptedException {

		
		clickOnDatePicker();
		Thread.sleep(2500);
		fetchYear("1996" , 1);
		selectMonth("June");
		selectDay("29");

	}

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(2500);

		P21_DatePicker obj = new P21_DatePicker();

         obj.selectDOB("1996", "June", "29", 1);
	
		Thread.sleep(5000);
		driver.quit();

	}

}

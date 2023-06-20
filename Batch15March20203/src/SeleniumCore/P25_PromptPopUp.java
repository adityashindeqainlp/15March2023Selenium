package SeleniumCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P25_PromptPopUp {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Step 1 Launch the browser and hit URL
		System.setProperty("webdriver.edge.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		// Step 2 Locate the element and perform click operation on it
		driver.findElement(By.xpath("//*[@name='prompt']")).click();
		Thread.sleep(2000);

		// Step 3 Handling the prompt popup
		driver.switchTo().alert().sendKeys("accept");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

}

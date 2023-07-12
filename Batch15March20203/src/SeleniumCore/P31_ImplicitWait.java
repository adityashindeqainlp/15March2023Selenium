package SeleniumCore;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @Author -- Aditya Shinde Java + Selenium 21-Jun-2023 3:24:16 pm
 **/
public class P31_ImplicitWait {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		//Step 1 Invoke the browser and hit the url
		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get(" https://chercher.tech/practice/implicit-wait-example");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int i = 1;
		
		while(i>0) {
			
			driver.findElement(By.xpath("//div[@id='q']//input["+ i +"]")).click();
			i++;
		}
		
	}
}

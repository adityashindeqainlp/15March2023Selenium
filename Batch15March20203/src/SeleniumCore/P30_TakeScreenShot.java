package SeleniumCore;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

/**
*@Author -- Aditya Shinde Java + Selenium 
* 21-Jun-2023
* 3:02:43 pm
**/
public class P30_TakeScreenShot {
	public static WebDriver driver;

	public static Actions act;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		//Step 1 Invoke the browser and hit the url
		System.setProperty("webdriver.chrome.driver",
				"D:\\Aditya_In_lp\\Java\\Setup For Java and Ecllipse\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/#colorpicker");
		Thread.sleep(2000);
		
		
		//Step 2 Type cast driver to TakesScreenshot class and store it in the reference variable of the same
		TakesScreenshot scn = (TakesScreenshot) driver;
		
		//Step 3 Invoke getScreenshotAS method and set the ouputType 
		File source = scn.getScreenshotAs(OutputType.FILE);
		
		//Step 4 Provide a path storage and place it as an args in File class object // use .jpg extension as well
        File target = new File("D:\\Aditya_In_lp\\Selenium\\ScreenShot\\slidershot.png");
		
        //Step 5 Use FileHandler class and invoke copy method
        FileHandler.copy(source, target);
        
        Thread.sleep(2500);
        
        driver.quit();
		
	}
}

package SeleniumCore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P26_MosueActions {

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
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		// Step 2 Hover mouse on the element
		WebElement hoverButton = driver.findElement(By.id("sub-menu"));

		// Step 3 Using of Actions class
		act = new Actions(driver);

		// Step 4 Invoke Move to Element method
		act.moveToElement(hoverButton).build().perform();
		Thread.sleep(2000);

		// Step 5 Locate the element and invoke click method
		WebElement singleClick = driver.findElement(By.xpath("//input[@name='alert']"));
		act.click(singleClick).build().perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		//Step 6  Locate the element and perform doubleClick on it 
		WebElement doubleClick = driver.findElement(By.xpath("//input[@id='double-click']"));
		act.doubleClick(doubleClick).build().perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//Step 7 visit url , locate element and perform right click
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        act.contextClick(rightClick).build().perform(); 
        

	}

}

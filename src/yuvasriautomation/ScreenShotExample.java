package yuvasriautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShotExample extends BaseClass {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("url passed");
		/*WebElement courses = driver.findElement(By.xpath("//a[text()='TestLeaf Courses']"));
		Actions a = new Actions(driver);
		a.moveToElement(courses).perform();*/
		Thread.sleep(2000);
		ScreenShot("reusableScreenShot");

		Thread.sleep(2000);
		driver.close();
	}
}

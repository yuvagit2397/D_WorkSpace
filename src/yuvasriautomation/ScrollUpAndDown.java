package yuvasriautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.fb.com");
	//scroll using pixel
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-300)");
	Thread.sleep(3000);
	//Scroll to end
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-600)");
	Thread.sleep(3000);
	//move to webelement
	WebElement signUp = driver.findElement(By.id("u_0_13"));
    js.executeScript("arguments[0].scrollIntoView();", signUp);
    Thread.sleep(3000); 
	driver.close();
}
}

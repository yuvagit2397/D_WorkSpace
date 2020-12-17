package leafgrounds;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/radio.html");
	//Are you enjoying the classes?
	WebElement rButton = driver.findElement(By.id("no"));
	rButton.click();
	
	Thread.sleep(3000);
	driver.close();
}
}

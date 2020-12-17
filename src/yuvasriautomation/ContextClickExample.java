package yuvasriautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickExample {
public static void main(String[] args) throws AWTException {
	//System.setProperty("webdriver.chrome.driver",
			//"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com");
	WebElement findElement = driver.findElement(By.xpath("//h5[text()='Edit']"));
	Actions a=new Actions(driver);
	a.moveToElement(findElement).contextClick(findElement).perform();
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	 
	
}
}

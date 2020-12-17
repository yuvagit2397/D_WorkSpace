package leafgrounds;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class FramesExample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/frame.html");
	
	driver.switchTo().frame(0);
	WebElement element = driver.findElement(By.id("Click"));
	element.click();
	String text = element.getText();
	System.out.println(text);
	Thread.sleep(2000);
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	WebElement element1=driver.findElement(By.id("Click1"));
	element1.click();
	System.out.println("nested "+element1.getText());
	
	driver.switchTo().defaultContent();
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
    int size = frames.size();
    System.out.println(size);
	
	Thread.sleep(3000);
	driver.close();
	
	
}
}

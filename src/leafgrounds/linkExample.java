package leafgrounds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkExample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Link.html");
	
	//Find where am supposed to go without clicking me?
	
	WebElement link=driver.findElement(By.partialLinkText("Find where am supposed"));
	String url = link.getAttribute("href");
	System.out.println(url);
	//driver.get(url);
	Thread.sleep(2000);
	driver.close();
}
}

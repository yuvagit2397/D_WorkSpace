package leafgrounds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/tooltip.html");
	WebElement name = driver.findElement(By.id("age"));
	System.out.println(name.getAttribute("title"));
	
}
}

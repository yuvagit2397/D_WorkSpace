package yuvasriautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesuggestion {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	Class<? extends WebDriver> class1 = driver.getClass();
	System.out.println(class1);
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	/*WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("chennai");*/
	
	/*List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
    for (WebElement suggestion : suggestions) {
		System.out.println(suggestion.getText());
	}*/

}
}

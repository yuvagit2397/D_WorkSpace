package yuvasriautomation;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExample {
    //implicit
	// explicit
	// fluent
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/mouseOver.html#");
		
		
		WebElement courses = driver.findElement(By.xpath(
				"//a[text()='TestLeaf Courses']"));
		//explicit
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(courses));
		
		
		Actions a = new Actions(driver);
		a.moveToElement(courses) .perform();
		 
		//fluentwait
		@SuppressWarnings("deprecation")
		Wait wait1 = new FluentWait(driver)
				.withTimeout(20, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		List<WebElement> elements = driver.findElements(
				By.xpath("//div[@class='container in']/ul/li/ul/li"));
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
		}
		
	}
	
	
}

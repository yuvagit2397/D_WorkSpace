package leafgrounds;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html#");
		
		
		//print all the links through mousehover
		WebElement courses = driver.findElement(By.xpath(
				"//a[text()='TestLeaf Courses']"));
		Actions a = new Actions(driver);
		a.moveToElement(courses) .perform();
		List<WebElement> elements = driver.findElements(
				By.xpath("//div[@class='container in']/ul/li/ul/li"));
		for (WebElement webElement : elements) {
			System.out.println(webElement.getText());
		}
		//click selenium link and handling the alert
		WebElement selenium = driver.findElement(By.xpath(
				"//div[@class='container in']/ul/li/ul/li[1]"));
		selenium.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
	}
}

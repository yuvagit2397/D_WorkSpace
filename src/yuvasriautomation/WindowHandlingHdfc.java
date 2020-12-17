package yuvasriautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingHdfc {
	static WebDriver driver;
	static Actions ac;
	static Robot r;

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

		WebElement bestSellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		ac = new Actions(driver);
		ac.moveToElement(bestSellers).contextClick(bestSellers).perform();

		r = new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		// second child

		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		ac.moveToElement(mobiles).contextClick(mobiles).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();
		System.out.println("parent window closed");
		/*Set<String> handles = driver.getWindowHandles();

		int size = handles.size();
		System.out.println(size);
		for (String window : handles) {
			driver.switchTo().window(window);
			Thread.sleep(3000);
			String title = driver.getTitle();
			System.out.println(title);

		}

		String amazon = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String mob = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		String bs = "Amazon.in Bestsellers: The most popular items on Amazon";
		for (String id : handles) {
			if (driver.switchTo().window(id).getTitle().equals(bs)) {
				System.out.println("mobId =" + id);
				WebElement newRelease = driver.findElement(By.xpath("//a[text()='New Releases']"));
				ac.moveToElement(newRelease).contextClick(newRelease).perform();

				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);

				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				System.out.println("done");

			}
		}*/

		
	}
}
  
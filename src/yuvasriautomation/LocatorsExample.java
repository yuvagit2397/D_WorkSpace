package yuvasriautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {
	static WebDriver driver;

	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	public static void usingId() throws InterruptedException {
		browserLaunch();
		driver.get("https://www.fb.com");
		WebElement email = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		email.sendKeys("asdfgh@gamil.com");
		Thread.sleep(3000);

		driver.close();
	}

	public static void usingNmae() {
		browserLaunch();
		driver.get("https://www.fb.com");
		WebElement fName = driver.findElement(By.name("firstname"));
		fName.sendKeys("asdfg");

	}

	public static void usingClassName() throws InterruptedException {
		browserLaunch();
		driver.get("https://www.fb.com");
		WebElement surName = driver.findElement(By.className("_5dba _8esg"));
		surName.click();
		Thread.sleep(2000);
		driver.close();
	}

	public static void usingTagName() {
		browserLaunch();
		driver.get("https://www.fb.com");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement link : allLinks) {
			String text = link.getText();
			System.out.println(text);
		}

	}
	public static void usingLinkText() throws InterruptedException {
		browserLaunch();
		driver.get("https://www.fb.com");
		WebElement lText = driver.findElement(By.linkText("Forgotten account?"));
		lText.click();
		Thread.sleep(2000);
		driver.close();
		
	}
	public static void partialLinkText() throws InterruptedException {
		browserLaunch();
		driver.get("https://www.fb.com");
		WebElement lText = driver.findElement(By.partialLinkText("Forgotten5 "));
		lText.click();
		Thread.sleep(2000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		partialLinkText();
	}
}

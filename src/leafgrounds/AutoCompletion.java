package leafgrounds;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompletion {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		WebElement textBox = driver.findElement(By.id("tags"));
		textBox.sendKeys("c");

		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		int size = options.size();
		System.out.println(size);
		for (WebElement op : options) {
			System.out.println(op.getText());
			if (op.getText().equals("Cucumber")) {
				op.click();
			}
		}
	}
}

package yuvasriautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathExamples {
	static WebDriver driver;
	public static void browserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		WebElement x=driver.findElement(By.xpath
				("//div[@id='content']/div/div/div/div/div[2]/div/div/div[2]"));
		String text = x.getText();
		System.out.println(text);
		Thread.sleep(2000); 
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
	}
	
}

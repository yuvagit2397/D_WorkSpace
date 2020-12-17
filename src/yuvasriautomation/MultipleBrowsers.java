package yuvasriautomation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {
	static WebDriver driver;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browserName = scanner.next();
		if (browserName.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");

		} else if (browserName.equals("Firefox")) {

			 System.setProperty("webdriver.gecko.driver", "D:\\Workspace\\Automation\\Drivers\\geckodriver.exe");
			  driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
		}
	}
}

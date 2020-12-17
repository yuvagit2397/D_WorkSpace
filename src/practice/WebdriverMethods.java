package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\\\Workspace\\\\Automation\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

}

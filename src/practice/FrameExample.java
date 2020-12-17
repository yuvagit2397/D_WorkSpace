package practice;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		org.openqa.selenium.Dimension ob =new org.openqa.selenium.Dimension(1024, 768);
		driver.manage().window().setSize(ob);
		
		 driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
//
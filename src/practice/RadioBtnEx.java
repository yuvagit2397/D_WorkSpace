package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnEx {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
			"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	WebElement female = driver.findElement(By.xpath("//input[@id='u_0_6']"));
	female.click();
	Thread.sleep(2000);
	if (female.isSelected()) {
		female.click();
		Thread.sleep(2000);
		}
	
	
	
}}

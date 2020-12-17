package leafgrounds;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement list = driver.findElement(By.xpath("//*[@id='dropdown1']"));

		Select s = new Select(list);
		/*
		 * List<WebElement> options = s.getOptions(); 
		 * for (WebElement value : options) {
		 * String text = value.getText(); System.out.println(text);
		 * 
		 * }
		 */
		// select a value using index

		s.selectByIndex(3);
		// select s value using text
		WebElement dD2 = driver.findElement(By.name("dropdown2"));
		Select s1 = new Select(dD2);
		s1.selectByVisibleText("Loadrunner");
		// select s value using value
		WebElement dD3 = driver.findElement(By.name("dropdown3"));
		Select s3 = new Select(dD3);
		s1.selectByVisibleText("Appium");
		s3.selectByValue("2");
		// selectusing sendkeys
		WebElement dD5 = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[5]/select"));
		// Select s5=new Select(dD5);
		dD5.sendKeys("Selenium");
		
		Thread.sleep(3000);
		 driver.close();

	}
}

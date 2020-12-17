package leafgrounds;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Alert.html");
	WebElement alertBox=driver.findElement
			(By.xpath("//button[text()='Alert Box']"));
	alertBox.click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	WebElement confirmBox=driver.findElement
	(By.xpath("//button[text()='Confirm Box']"));
	confirmBox.click();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	
	WebElement promptBox=driver.findElement
			(By.xpath("//button[text()='Prompt Box']"));
	promptBox.click();
	Thread.sleep(3000);
	
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("asdfghjk");
	alert.accept();
     
	
	Thread.sleep(3000);
	//driver.close();
}
}

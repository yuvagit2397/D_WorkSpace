package yuvasriautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
public static  void openBrowser() throws InterruptedException {
System.setProperty("webdriver.chrome.driver",
		"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
/*driver.navigate().to("https://www.google.com");

WebElement element = driver.switchTo().activeElement();
element.sendKeys("chennai"+Keys.ENTER);
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
*/
driver.get("http://www.leafground.com/pages/Window.html");
driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();

Thread.sleep(2000);

driver.close();
Thread.sleep(3000);
driver.quit();



}

public static void main(String[] args) throws InterruptedException {
	openBrowser();
}
}

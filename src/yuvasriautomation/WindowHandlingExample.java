package yuvasriautomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("http://www.leafground.com/pages/Window.html");
    
    driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
    
    /*String parent = driver.getWindowHandle();
    Set<String> allId = driver.getWindowHandles();
    int size = allId.size();
    System.out.println(size);
    
    int x=0;
    for (String id : allId) {
    	if(!id.equals(parent)) {
    		x++;
		driver.switchTo().window(id);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("I am in " +x+" Window");
    	}
	}
    
    driver.switchTo().window(parent);
    System.out.println("Am in parent Window");
    driver.close();
    System.out.println("Am closed parent window");*/
    //driver.close();
    driver.switchTo().window("1");
    String title = driver.getTitle();
    System.out.println(title);
    System.out.println("done");
    
    
}
}

package leafgrounds;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Window.html");
        //task1
        /*WebElement firstButton = driver.findElement(By.id("home"));
        firstButton.click();
        
        //task2
        WebElement secondButton=driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
        secondButton.click();
        */
        String parentId = driver.getWindowHandle();
        
        System.out.println("parentid ="+parentId);
        
        Set<String> allId = driver.getWindowHandles();
        
        //getWindowHandles() method will give all
        //window id including parent
        
        /*for (String id : allId) {
			System.out.println(id);
		}*/
        //task3
        WebElement color = driver.findElement(By.id("color"));
        color.click();
        Set<String> allId1 = driver.getWindowHandles();
        int size = allId1.size();
       int x=0;
        for (String id1 : allId1) {
        	
			if(id1.equals(parentId)) {
				continue;
			}else {
				 x++;
				driver.switchTo().window(id1);
				Thread.sleep(2000);
				driver.close();
				System.out.println("closed " +x+" child window");
			}
			
		}
        
        
	}
}

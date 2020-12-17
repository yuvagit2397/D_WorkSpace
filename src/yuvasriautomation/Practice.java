package yuvasriautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	static WebDriver driver; 
	static Actions ac;
	static Robot r;
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\javaSeleniumJars\\chrome87\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/saree?f=Gender%3Amen%20women%2Cwomen%3A%3AOccasion%3ATraditional");
	List<WebElement> allsaree = driver.findElements(By.tagName("img"));
	for (int i = 0; i < allsaree.size(); i++) {
		if (i==0||i==1) {
			allsaree.get(i).click();
		}
	}
	
	String parentId = driver.getWindowHandle();
	Set<String> allId = driver.getWindowHandles();
	String title = driver.getTitle();
	System.out.println("parent title "+title);
	int j=0;
	for (String id : allId) {
		String t2 = driver.switchTo().window(id).getTitle();
		System.out.println(j+"st child= "+t2);
		if (j==2) {
			driver.switchTo().window(id);
			String text = driver.findElement(By.xpath("//h1[.='Mitera']")).getText();
			System.out.println(" 2nd child verifying text "+text);
			System.out.println("closing window title "+driver.getTitle());
			//driver.close();
		}
		/*else if (driver.getTitle().equals(title)) {
			driver.switchTo().window(id).close();
			System.out.println("the parent window closed ");
		}*/
		j++;
	}
	String defaultConTitle = driver.switchTo().defaultContent().getTitle();
	System.out.println(defaultConTitle);
	//driver.close();
	
	
	
	
	
	
	
	
}
}

package yuvasriautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseImplementation extends BaseClass {
public static void  launch() throws Exception {
	browserLaunch("chrome");
	getUrl("https://www.fb.com");
	//WebElement textBox = driver.findElement(By.id("month"));
	//dropDown(textBox);
	//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	//brokenLinks(allLinks);
	//WebElement emailBox = driver.findElement(By.id("email"));
	//rightClick(emailBox);
	//keyDownAndUp(5,"down");
	//ScreenShot("myScreenShot.png");
	scrollUsingPixel(200,0);
	Thread.sleep(3000);
	driver.close();
	
}
public static void main(String[] args) throws Exception {
	launch();
}
}

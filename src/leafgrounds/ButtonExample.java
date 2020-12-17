
package leafgrounds;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("http://www.leafground.com/pages/Button.html");
	//Click button to travel home page
	WebElement homePage = driver.findElement(By.id("home"));
	homePage.click();
	driver.close();
	//Find position of button (x,y) 
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Button.html");
	WebElement getPosition = driver.findElement(By.xpath("//*[@id='position']"));
	
	Point position=getPosition.getLocation();
	int x = position.getX();
	int y = position.getY();
	System.out.println(x+","+y);
	
	
	//Find button color
	
	WebElement getColor = driver.findElement(By.id("color"));
	
	String btnColor = getColor.getCssValue("background-color");
	System.out.println(btnColor);
	
	Thread.sleep(2000);
	
	
	//find the height and width
	WebElement getHW = driver.findElement(By.id("size"));
	
	Dimension size = getHW.getSize();
	int height = size.getHeight();
	int width = size.getWidth();
	
	System.out.println("height ="+height+" width ="+width);
	driver.close();
	
}
}

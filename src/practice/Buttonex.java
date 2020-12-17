package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//using click
		WebElement submit = driver.findElement(By.id("u_0_13"));;
		submit.click();
		Thread.sleep(2000);
		
		//color
		String color = submit.getCssValue("background-color");
		System.out.println("color combo of button="+color);
		
		
		//size
		Dimension size = submit.getSize();
		int h=size.getHeight();
		int w=size.getWidth();
		System.out.println("height= "+h);
		System.out.println("width= "+w);
		
		//position
		
		Point location = submit.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("height= "+x);
		System.out.println("width= "+y);
		driver.close();
		
		
		
	}

}

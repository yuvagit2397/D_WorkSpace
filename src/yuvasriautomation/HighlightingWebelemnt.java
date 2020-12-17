package yuvasriautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightingWebelemnt {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.fb.com");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(250,0)");
	
	WebElement email = driver.findElement(By.id("email"));
	
	
	
	js.executeScript("arguments[0].setAttribute('style','background:green;border:solid 4px red');",email);
	Thread.sleep(2000);
	email.sendKeys("yogiyokesh");
	WebElement pass = driver.findElement(By.id("pass"));
	Thread.sleep(2000);
	js.executeScript("arguments[0].setAttribute('style','background:pink;border:solid 4px yellow');",pass);
	
	WebElement submit = driver.findElement(By.id("u_0_b"));
	Thread.sleep(2000);
	js.executeScript("arguments[0].setAttribute('style','background:yellow;border:solid 4px pink');",submit);

	TakesScreenshot ts=(TakesScreenshot) driver;
	File name=ts.getScreenshotAs(OutputType.FILE);
	File f=new File("HighlightScreenShot.png");
	FileUtils.copyFile(name, f);
	
	//intreface1
	//method2
	//filename
	//type
	//storing place
	//method for copy4
	
	
	
	
}
}

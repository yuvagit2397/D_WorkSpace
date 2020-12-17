package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//using link text
		WebElement lnktxt = driver.findElement(By.linkText("Create a Page"));
	    lnktxt.click();
	    
	    //getting all links
	     List<WebElement> links = driver.findElements(By.tagName("a"));
	     System.out.println("The links placed in the web page: ");
		for (WebElement link : links) {
			String allLinks = link.getText();
			System.out.println(allLinks);
			}
		
		driver.close();
	}
	}



package com.AutomationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class PaanaiAutomation {
public static void main(String[] args) throws InterruptedException {
	int totalMonth=0;
	System.setProperty("webdriver.chrome.driver",
			"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com");
	WebElement f = driver.findElement(By.id("u_0_w"));
	f.sendKeys("senthil123");
	Thread.sleep(2000);
	
	f.clear();
	
	WebElement month = driver.findElement(By.id("month"));
	/*Select s=new Select(month);
	
	List<WebElement> options = s.getOptions();
	
   for (WebElement m : options) {
	String monthName=m.getText();
	totalMonth++;
	System.out.println(monthName);
}
	System.out.println("Total Month= "+totalMonth);
	
	if(totalMonth==13) {
		System.out.println("Testcase pass");
	}else {
		System.out.println("Testcase fail");
	}
	*/
	
	month.sendKeys("may");
	Thread.sleep(3000);
	driver.close();
	
}
}

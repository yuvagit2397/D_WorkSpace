package com.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EndToEnd {
	
	static void test() {
		
		System.setProperty("webdriver.chrome.driver", 
				      "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.com");
	}
	
	public static void main(String[] args) {
		test();
	
  	}

}

package leafgrounds;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", 
			"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/checkbox.html");
	WebElement java = driver.findElement(By.xpath
			("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
	java.click();
	
	WebElement vB = driver.findElement(By.xpath
			("//*[@id=\"contentblock\"]/section/div[1]/div[2]/input"));
	vB.click();
	Thread.sleep(3000);
	WebElement selenium=driver.findElement(
			By.xpath("//*[text()='Selenium']"));
	
	boolean b = selenium.isSelected();
	System.out.println(b);
	System.out.println(selenium.getText());
	Thread.sleep(3000);
	
	
	//DeSelect only checked
	WebElement notSelected=	driver.findElement(By.xpath(
			"//*[@id=\"contentblock\"]/section/div[3]/div[1]"));
	if(notSelected.isSelected()) {
		notSelected.click();
	}
	Thread.sleep(3000);
	WebElement selected=	driver.findElement(By.xpath("//*[text()='I am Selected']"));
	if(selected.isSelected()) {
		selected.click();
	}
	
	//Thread.sleep(3000);
	//driver.close();
}
}
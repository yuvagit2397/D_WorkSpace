package leafgrounds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxExample {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		//Enter your email address
		
		WebElement eMailBox = driver.findElement(By.id("email"));
		eMailBox.sendKeys("senthil@gmail.com");
		
		//append a text
		WebElement appendBox=driver.findElement(By.xpath
				("//div[@id='contentblock']/section/div[2]/div/div/input"));
		appendBox.sendKeys("append");
		
		//get the default text 
		WebElement text=driver.findElement(By.xpath
				("//div[@id='contentblock']/section/div[3]/div/div/input"));
		String text1=text.getAttribute("value");
		System.out.println(text1);
		//clear the text
		WebElement clearBox=driver.findElement(By.xpath
				("//div[@id='contentblock']/section/div[4]/div/div/input"));
		
		clearBox.clear();
		//to confirm the edit field is disabled
		WebElement status=driver.findElement(By.xpath
				("//div[@id='contentblock']/section/div[5]/div/div/input"));
		boolean attribute = status.isEnabled(); 
		System.out.println(attribute);
		Thread.sleep(2000);
		driver.close();
		
		
	}
}
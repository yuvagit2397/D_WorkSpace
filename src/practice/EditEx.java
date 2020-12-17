package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditEx {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//name using sendkeys and clear
		WebElement fstName = driver.findElement(By.id("u_0_m"));
		fstName.sendKeys("yuvasri");
		WebElement surname = driver.findElement(By.id("u_0_o"));
		surname.sendKeys("chandran");
		Thread.sleep(3000);
		surname.clear();
		
		//email using append
		WebElement email = driver.findElement(By.id("u_0_r"));
		email.sendKeys("yuvasrichandran");
		Thread.sleep(3000);
		email.sendKeys("@gmail.com");
		Thread.sleep(2000);
		WebElement gettingTxt = driver.findElement(By.xpath("//*[@class='_52lr fsm fwn fcg']"));
		String text = gettingTxt.getText();
		System.out.println("the default text is "+text);
		driver.close();
	}

}

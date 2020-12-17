package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//using index
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select slctDay = new Select(day);
		slctDay.selectByIndex(23);
		
		//using value
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select m = new Select(month);
		m.selectByValue("5");
		List<WebElement> months = m.getOptions();
		System.out.println("the months displayed in the drop down");
		for (WebElement allMonth : months) {
			String text = allMonth.getText();
			System.out.println(text);
		}
		
		//using visibletext
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select y = new Select(year);
		y.selectByVisibleText("1997");
		Thread.sleep(3000);
		driver.close();
		
	}

}

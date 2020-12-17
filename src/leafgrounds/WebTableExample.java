package leafgrounds;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
		// count of no.of columns
		/*List<WebElement> totalColumns = driver.findElements(By.tagName("th"));
		int columnSize = totalColumns.size();
		System.out.println("columnSize " + columnSize);
		// count of no.of rows
		List<WebElement> totalRows = driver.findElements(By.tagName("tr"));

		int rowSize = totalRows.size();
		System.out.println("rowSize " + rowSize);

		// get progress value
		WebElement progressValue = driver.findElement(By.xpath(""
				+ "//td[text()='Learn to interact with Elements']/following::td[1]"));
		
		System.out.println(progressValue.getText());
		
		
		//to find least completed progress
		List<String> li=new ArrayList<String>();
		List<String> li1=new ArrayList<String>();
		List<WebElement> headers = driver.findElements(By.tagName("th"));
		
		for (WebElement h : headers) {
			li.add(h.getText());
		}
		
		
		//System.out.println(li);
		int indexOf = li.indexOf("Progress");
		//System.out.println(indexOf);
		indexOf=indexOf+1;*/
		
		List<WebElement> columnData = driver.findElements
				(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement webElement : columnData) {
			System.out.println(webElement.getText());
			//li1.add(webElement.getText());
		}
		//System.out.println(li1);
		Thread.sleep(2000);
		driver.close();
	}
}

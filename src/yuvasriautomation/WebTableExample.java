package yuvasriautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {
	static WebDriver driver;

	public static void LaunchBrowser() {
		//System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void toGetAlldata() {
		LaunchBrowser();
		driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> tRow = table.findElements(By.tagName("tr"));
		for (int i = 0; i < tRow.size(); i++) {
			List<WebElement> tData = tRow.get(i).findElements(By.tagName("td"));

			for (WebElement data : tData) {
				System.out.println(data.getText());
			}
		}
		/*
		 * List<WebElement> allData = driver.findElements(
		 * By.xpath("//table/tbody/tr[5]/td[5]")); 
		 * for (WebElement data : allData) {
		 * System.out.println(data.getText()); }
		 */

		driver.close();
	}

	public static void toPrintParticularRow() {
		LaunchBrowser();

		driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> tRow = driver.findElements(By.xpath("//td[2]"));
		for (WebElement data : tRow) {
			System.out.println(data.getText());
		}

		driver.close();

	}
	public static void particularData() {
		LaunchBrowser();
		driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
		for (int i = 1; i <=tRow.size(); i++) {
			List<WebElement> tData = driver.findElements(By.tagName("td"));
                 for(int j=0;j<tData.size();j++) {
                	 
                	 
                	 System.out.println(tData.get(j).getText());
			}
		}
	}

	public static void main(String[] args) {
		// LaunchBrowser();
		// toGetAlldata();
		//toPrintParticularRow();
		particularData();
	}
}

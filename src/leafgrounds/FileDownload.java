package leafgrounds;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		WebElement link = driver.findElement(By.xpath("//a[text()='Download Excel']"));
		link.click();
		File f = new File("C:\\Users\\SENTHIL\\Downloads");
		File[] x = f.listFiles();
		System.out.println(x.length);
		for (File file : x) {
			String name = file.getName();

			if (name.equals("testleaf.xlsx")) {
				System.out.println("The file is downloaded");
				break;
			}

		}
		Thread.sleep(3000);
		driver.close();
	}
}

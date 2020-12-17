package yuvasriautomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void checkbrokenLink() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		// driver.get("https://www.fb.com");

		String link = "https://www.facebook.com/recover/initiate?lwv=110&amp;ars=royal_blue_bar";
		URL url = new URL(link);

		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		int responseCode = con.getResponseCode();
		System.out.println(responseCode);

	}

	public static void checkFbBrokenLinks() throws IOException {
		int count = 0;
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
System.out.println("Total Links ="+links.size());
		for (WebElement link : links) {
			String l = link.getAttribute("href");
			URL url = new URL(l);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			int responseCode = con.getResponseCode();
			// System.out.println(responseCode);
			if (responseCode == 200) {
				continue;
			} else {
				count++;
				int responseCode2 = con.getResponseCode();
				System.out.println(l);
				System.out.println("Response code ="+responseCode2);
				
			}

			if (count == 0) {
				System.out.println("there is no broken link");
			}

		}

	}

	public static void main(String[] args) throws IOException {
		// checkbrokenLink();

		checkFbBrokenLinks();
	}
}
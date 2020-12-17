package leafgrounds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Image.html");

		WebElement image1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		// image1.click();

		WebElement broken = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']//following::img[1]"));

//naturalWidth-      attribute

		if (broken.getAttribute("naturalWidth").equals("0")) {
			String nW = broken.getAttribute("naturalWidth");
			System.out.println(nW);
			System.out.println("The link is Broken");
		} else {
			System.out.println("The link is Not Broken");
		}
		driver.close();
	}
}

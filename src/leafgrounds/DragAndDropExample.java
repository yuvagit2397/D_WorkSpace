package leafgrounds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		WebElement source = driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		System.out.println(source.getText());
		WebElement destiNation = driver.findElement(By.xpath("//div[@id='treeTarget']/ul"));
		System.out.println(destiNation.getText());
		
		Actions a = new Actions(driver);
		
		// a.clickAndHold(source).moveToElement(destiNation).release().build().perform();
		a.dragAndDrop(source, destiNation).build().perform();
		// Thread.sleep(3000);
		// driver.close();
	}
}

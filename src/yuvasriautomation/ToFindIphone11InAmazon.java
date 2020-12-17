package yuvasriautomation;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindIphone11InAmazon {
	static WebDriver driver;
	static Set<String> mobColours=new TreeSet<>();
public static  void toFind() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation\\Drivers\\chromedriver.exe");

	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone11");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	List<WebElement> allMobName = driver.findElements(By.xpath("//span[starts-with"
			+ "(@class,'a-size-medium a-color-base a-text-normal')]"));
	System.out.println("All mob names");
	for (WebElement mobName : allMobName) {
		String name=mobName.getText();System.out.println(name);
		String[] split = name.split("-");
		int l=split.length;
		if(l>1) {
			String colour=split[1];
			mobColours.add(colour);
		}else {
			String colour=split[0];
			mobColours.add(colour);
			
		}
		
		
	}
	System.out.println("mobColours");
	for (String colour : mobColours) {
		System.out.println(colour);
	}
	
	Thread.sleep(2000);
	driver.close();

}
public static void main(String[] args) throws InterruptedException {
	toFind();
}
}

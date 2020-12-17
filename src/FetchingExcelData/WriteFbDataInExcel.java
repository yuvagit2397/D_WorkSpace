package FetchingExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteFbDataInExcel {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fb.com");
	WebElement element = driver.findElement(By.xpath("//div[text()='Birthday']"));
	String text = element.getText();
	System.out.println(text);
	
	File f =new File("C:\\Users\\SENTHIL\\Desktop\\FB_Data.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fin);
	Sheet sheet = wb.getSheet("Sheet1");
	Cell createCell = sheet.getRow(3).createCell(7);
	createCell.setCellValue(text);
	
	
	FileOutputStream fo=new FileOutputStream(f);
	wb.write(fo);
	wb.close();
	
	driver.close();
	
	
}

}

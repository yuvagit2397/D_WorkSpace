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

public class ExcelWrite {
	public static void writeCode() throws IOException{
		File f=new File("C:\\Users\\SENTHIL\\Desktop\\datadriven.xlsx");
		FileInputStream fin=new FileInputStream(f);
       Workbook wb=new XSSFWorkbook(fin);
       Sheet sheet=wb.getSheet("sheet1");
       
			Cell cell = sheet.getRow(0).createCell(4);
			
				cell.setCellValue("Branch");
			
       FileOutputStream fo=new FileOutputStream(f);
       wb.write(fo);
       fo.close();
       
      
	}
	public static void main(String[] args) throws IOException {
		writeCode();
	}
}

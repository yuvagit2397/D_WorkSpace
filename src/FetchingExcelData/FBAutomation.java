package FetchingExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FBAutomation {
//C:\\Users\\SENTHIL\\Desktop\\datadriven.xlsx
	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream(
				"C:\\Users\\SENTHIL\\Desktop\\FB_Data.xlsx");
	     Workbook wb = new XSSFWorkbook(fin);//extn:.xlsx
	     Sheet sheet = wb.getSheet("sheet1");
	     for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
	    	 Row row = sheet.getRow(rowIndex);
	    	  if (row != null) {
	    	    Cell cell = row.getCell(1);
	    	    if (cell != null) {
	    	      // Found column and there is value in the cell.
	    	     String cellValue = cell.getStringCellValue();
	    	     System.out.println(cellValue);
	    	    }
	    	  }
	    	}
	     
	    	 }
	     
	}


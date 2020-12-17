package FetchingExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExample {
	public static void main(String[] args) throws IOException {
	FileInputStream fin=new FileInputStream(
			"C:\\Users\\SENTHIL\\Desktop\\datadriven.xlsx");
     Workbook wb = new XSSFWorkbook(fin);//extn:.xlsx
     Sheet sheet = wb.getSheet("sheet1");
     //Finding no of  rows
     int noOfRows = sheet.getPhysicalNumberOfRows();
     for(int i=0;i<noOfRows;i++) {
    	 Row row = sheet.getRow(i);
    	//Finding no of  cells in a row
    	 int noOfCells=row.getPhysicalNumberOfCells();
    	 for(int j=0;j<noOfCells;j++) {
    		 Cell cell = row.getCell(j);
    		 //To get cell value
    		 if(cell.getCellType().equals(CellType.STRING)) {
    			 String cellValue = cell.getStringCellValue();
    			 System.out.println(cellValue);
    		 }
    		 else if(cell.getCellType().equals(CellType.NUMERIC)) {
    			 double cellValue1 = cell.getNumericCellValue();
    			 long l=(long) cellValue1;
    			 String valueOf = String.valueOf(l);
    			 System.out.println(valueOf);
    			 
    		 }
    		 
    		 }
    	 }
     }
	}


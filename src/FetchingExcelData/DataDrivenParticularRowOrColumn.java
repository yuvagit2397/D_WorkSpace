package FetchingExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenParticularRowOrColumn {
	public static void toGetRow() throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\SENTHIL\\Desktop\\datadriven.xlsx");
		Workbook wb = new XSSFWorkbook(fin);// extn:.xlsx
		Sheet sheet = wb.getSheet("sheet1");
		// Finding one cell value
		int noOfRows = sheet.getPhysicalNumberOfRows();
		//for (int i = 0; i < noOfRows; i++) {
			//if (i == 2) {
				Cell cell = sheet.getRow(2).getCell(1);
				if (cell.getCellType().equals(CellType.STRING)) {
					String cellValue = cell.getStringCellValue();
					System.out.println(cellValue);
				} else if (cell.getCellType().equals(CellType.NUMERIC)) {
					double cellValue1 = cell.getNumericCellValue();
					long l = (long) cellValue1;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);

				}
			}
	
	

	public static void toGetParColumn() throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\SENTHIL\\Desktop\\datadriven.xlsx");
		Workbook wb = new XSSFWorkbook(fin);// extn:.xlsx
		Sheet sheet = wb.getSheet("sheet1");
		// Finding no of rows
		int noOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < noOfRows; i++) {
			Cell cell = sheet.getRow(i).getCell(1);
			if (cell.getCellType().equals(CellType.STRING)) {
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			} else if (cell.getCellType().equals(CellType.NUMERIC)) {
				double cellValue1 = cell.getNumericCellValue();
				long l = (long) cellValue1;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);

			}
		}
	}

	public static void toGetParRow() throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\SENTHIL\\Desktop\\datadriven.xlsx");
		Workbook wb = new XSSFWorkbook(fin);// extn:.xlsx
		Sheet sheet = wb.getSheet("sheet1");
		// Finding no of rows
		int noOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < noOfRows; i++) {
			Row row = sheet.getRow(i);
			if (i == 1) {
				int noOfCells = row.getPhysicalNumberOfCells();
				for (int j = 0; j < noOfCells; j++) {
					Cell cell = row.getCell(j);
					if (cell.getCellType().equals(CellType.STRING)) {
						String cellValue = cell.getStringCellValue();
						System.out.println(cellValue);
					} else if (cell.getCellType().equals(CellType.NUMERIC)) {
						double cellValue1 = cell.getNumericCellValue();
						long l = (long) cellValue1;
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);

					}
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		 toGetRow();
		// toGetParColumn();
		//toGetParRow();
	}
}

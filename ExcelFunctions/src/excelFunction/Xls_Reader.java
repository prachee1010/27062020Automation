package excelFunction;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {

	public String getCellData(String path, String sheetName, int rowNum, int colNum) throws IOException {

		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook wb = new XSSFWorkbook(file); 	// Workbook
		XSSFSheet sheet = wb.getSheet(sheetName);

		XSSFRow row = sheet.getRow(rowNum); 		// Row
		XSSFCell cell = row.getCell(colNum); 		// Cell
		String data = cell.getStringCellValue(); 	// Data

		return data;

	}

}

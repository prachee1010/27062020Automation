package excelFunction;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetCellData {

	public static void main(String[] args) throws IOException {

		String path = "D:\\27062020\\27062020Automation\\ExcelFunctions\\src\\excelFunction\\TestData.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file); // Workbook
		XSSFSheet sheet = wb.getSheet("Test"); // Test Sheet

		XSSFRow row = sheet.getRow(0);
		if (row == null) {
			row = sheet.createRow(0);
		}

		XSSFCell cell = row.getCell(0);

		if (cell == null) {
			cell = row.createCell(0);
		}

		cell.setCellValue("Prachee");

		FileOutputStream fileout = new FileOutputStream(path);
		wb.write(fileout);

	}

}

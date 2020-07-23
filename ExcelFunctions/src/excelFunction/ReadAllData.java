package excelFunction;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {

	public static void main(String[] args) throws IOException {

		String path = "D:\\27062020\\27062020Automation\\ExcelFunctions\\src\\excelFunction\\TestData.xlsx";

		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook wb = new XSSFWorkbook(file); // Workbook
		XSSFSheet sheet = wb.getSheet("Sheet1");

		int rows = sheet.getPhysicalNumberOfRows();

		XSSFRow row = sheet.getRow(0);
		int cols = row.getLastCellNum();

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				String data = sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
	}

}

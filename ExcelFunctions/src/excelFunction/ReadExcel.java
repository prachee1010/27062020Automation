package excelFunction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		String path = "D:\\27062020\\27062020Automation\\ExcelFunctions\\src\\excelFunction\\TestData.xlsx";

		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook wb = new XSSFWorkbook(file);	//Workbook
		XSSFSheet sheet = wb.getSheet("Sheet1");	//Sheet
		XSSFRow row = sheet.getRow(0);				//Row
		XSSFCell cell = row.getCell(0);				//Cell
		String data = cell.getStringCellValue();	//Data
		
		int no_rows = sheet.getPhysicalNumberOfRows();		//get number of rows
		System.out.println(no_rows);
		
		System.out.println(row.getLastCellNum());	//get no. of columns
		
		System.out.println(data);
		

	}

}

package excelFunction;

import java.io.IOException;

public class UseReader {

	public static void main(String[] args) throws IOException {

		String path = "D:\\27062020\\27062020Automation\\ExcelFunctions\\src\\excelFunction\\TestData.xlsx";
		Xls_Reader xl = new Xls_Reader(path);
		
		String data = xl.getCellData("Sheet1", 0, 0);
		
		System.out.println(data);
	}

}

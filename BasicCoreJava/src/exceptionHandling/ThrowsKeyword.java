package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) {

		try {
			test();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // throw has to be handled by user

		test2();

		test3();	//doesnt throw error bacz unchecked excptn, hence throws is not used with unchecked / runtime excptns

		//test4(); // will show error becz it throws checked excptn
	}

	public static void test() throws FileNotFoundException { // Declare the checked exception

		FileInputStream file = new FileInputStream(
				"D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
	}

	public static void test2() {

		//
		try {
			FileInputStream file = new FileInputStream(
					"D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void test3() throws ArithmeticException { // throws doesnt give error to user test3();

	}

	public static void test4() throws IOException {

	}

}

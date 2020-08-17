package driver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import configuration.Configuration;
import libraries.CommonLibrary;
import libraries.Xls_Reader;

public class Driver {

	CommonLibrary lib;
	Xls_Reader xls;

	@BeforeSuite
	public void initialise() {
		lib = new CommonLibrary();
		xls = new Xls_Reader(Configuration.testDataPath);
	}
	
	@AfterSuite
	public void tearDown() {
		//After Suite closures
	}
	
	
	
}

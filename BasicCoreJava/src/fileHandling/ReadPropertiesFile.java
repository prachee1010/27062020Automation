package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws Exception {

		Properties obj = new Properties();
		
		FileInputStream file = new FileInputStream("D:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
		
		obj.load(file);
		
		System.out.println(obj.get("name"));
		System.out.println(obj.get("surnamse"));
		System.out.println(obj.get("city"));
		
		throw new Exception("Testing");
	}

}

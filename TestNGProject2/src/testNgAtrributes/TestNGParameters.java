package testNgAtrributes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {

	@Test
	@Parameters("browser")
	public void launchBrowser(String browserName) {
		System.out.println("Launch "+browserName);
	}
}

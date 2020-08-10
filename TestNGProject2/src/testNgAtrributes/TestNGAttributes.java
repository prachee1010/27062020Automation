package testNgAtrributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAttributes {

	@Test(priority=0)
	public void login() {
		System.out.println("login");
		Assert.assertEquals(10, 20);	//20-expected , 10-actual
	}

	@Test(priority=1)
	public void logout() {
		System.out.println("logout");
	}
	
}

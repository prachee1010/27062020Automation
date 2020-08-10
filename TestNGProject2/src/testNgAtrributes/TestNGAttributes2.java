package testNgAtrributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAttributes2 {

	@Test
	public void login() {
		System.out.println("login");
		Assert.assertEquals(10, 20);
	}

	@Test(dependsOnMethods="login")
	public void logout() {
		System.out.println("logout");
	}
	
}

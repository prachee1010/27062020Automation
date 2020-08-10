package testNgAtrributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	@Test(dataProvider="getData")
	public void login(String userName, String password) 
	{
		System.out.println("Enter username="+userName);
		System.out.println("Enter password="+password);
		System.out.println("Click on Login button");
		System.out.println("----**************----");
	}

	@DataProvider
	public String[][] getData()
	{
		String[][] data = new String[3][2];
		//Row1
		data[0][0]="User1";
		data[0][1]="Password1";
		
		//Row2
		data[1][0]="User2";
		data[1][1]="Password2";
		
		//Row3
		data[2][0]="User3";
		data[2][1]="Password3";
		
		return data;
	}
}

package testScripts.Motorcycle;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import driver.Driver;

public class PreconditionMotorcycle extends Driver {

	static WebDriver dr;
	pages.Motorcycle.EnterInsuranceData motorEnterInsuranceData;
	pages.Motorcycle.EnterVehicleData motorEnterVehicleData;
	pages.Motorcycle.EnterProductData motorEnterProductData;
	pages.HomePage homePage;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		dr = lib.launchBrowser(browser);
		homePage=new pages.HomePage(dr);
		motorEnterInsuranceData = new pages.Motorcycle.EnterInsuranceData(dr);
		motorEnterVehicleData = new pages.Motorcycle.EnterVehicleData(dr);
		motorEnterProductData = new pages.Motorcycle.EnterProductData(dr);
		homePage.clickMotorcycle();
	}
	
}

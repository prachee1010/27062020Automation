package testScripts.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import driver.Driver;

public class EnterInsuranceData extends PreconditionMotorcycle {

	/*public WebDriver dr;
	
	
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		dr = lib.launchBrowser(browser);
		motorEnterInsuranceData = new pages.Motorcycle.EnterInsuranceData(dr);
		motorEnterVehicleData = new pages.Motorcycle.EnterVehicleData(dr);
		motorEnterProductData = new pages.Motorcycle.EnterProductData(dr);
		homePage.clickMotorcycle();
//		dr.findElement(motorcycle).click();
	}*/
	
	@BeforeClass
	public void navigateToEnterInsuranceData() {
		motorEnterInsuranceData.navigateToEnterInsuranceData();
	}
	
/*	@AfterTest
	public void closeBrowser() {
		dr.quit();
	}*/
	
	@Test
	public void isHobbiesLabelVisible() {
		
		Assert.assertEquals(motorEnterInsuranceData.verifyHobbiesLabelVisibility(), true);
	}
	
	@Test
	public void isHobbiesCheckBoxVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyHobbiesCheckBoxVisibility(), true);
	}

	@Test
	public void validHobbiesSelection() {
		Assert.assertEquals(motorEnterInsuranceData.validHobbiesSelection(), true);
	}
	
	@Test
	public void isWebsiteLabelVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyWebsiteLabel(), true);
	}
	
	@Test
	public void isWebsiteTextBoxVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyWebsiteTextBoxVisibility(), true);
	}
	
	@Test
	public void validWebsiteEntry() {
		Assert.assertEquals(motorEnterInsuranceData.validWebsiteEntry(), true);
	}
	
	@Test
	public void isPictureLabelVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyPictureLabelVisibility(), true);
	}
	
	@Test
	public void isPrevButtonVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyPrevButtonVisibility(), true);
	}
	
	@Test
	public void verifyPrevButtonText() {
		Assert.assertEquals(motorEnterInsuranceData.verifyPrevButtonText(), true);
	}
	
	@Test
	public void verifyOnClickPrevButton() {
		motorEnterInsuranceData.ClickPrev();
		Assert.assertEquals(motorEnterVehicleData.isCylinderCapacityVisible(), true);
		motorEnterInsuranceData.navigateToEnterInsuranceData();
	}
	
	@Test
	public void isNextButtonVisible() {
		Assert.assertEquals(motorEnterInsuranceData.verifyNextButtonVisibility(), true);
	}
	
	@Test
	public void verifyNextButtonText() {
		Assert.assertEquals(motorEnterInsuranceData.verifyNextButtonText(), true);
	}
	
	@Test(priority=1)
	public void verifyOnClickNextButton() {
		motorEnterInsuranceData.ClickNext();
		boolean result;
		boolean navigatorStatus = motorEnterInsuranceData.verifyOnClickNextButton();
		boolean nextPageElementStatus = motorEnterProductData.verifyStartLabelVisibility();
		result = navigatorStatus && nextPageElementStatus;
		Assert.assertEquals(result, true);
	}
	
}

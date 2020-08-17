package testScripts.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import driver.Driver;
import libraries.CommonLibrary;

public class EnterProductData extends PreconditionMotorcycle {
	
/*	WebDriver dr;
	pages.Motorcycle.EnterProductData motorEnterProductData = new pages.Motorcycle.EnterProductData(dr); 
	pages.Motorcycle.EnterInsuranceData motorEnterInsuranceData = new pages.Motorcycle.EnterInsuranceData(dr);
*/	
//	By motorcycle = By.xpath("//a[text()='Motorcycle']");
	
	@BeforeClass
//	@Parameters("browser")
	public void beforeProductData() {
//		dr = lib.launchBrowser(browser);
		motorEnterProductData = new pages.Motorcycle.EnterProductData(dr);
//		motorEnterInsuranceData = new pages.Motorcycle.EnterInsuranceData(dr);
//		dr.findElement(motorcycle).click();
	}
	
/*	@BeforeClass
	public void navigateToEnterProductData() {
		motorEnterProductData.navigateToEnterProductData();
	}*/
	
	
/*	@AfterTest
	public void quiteBrowser() {
		dr.quit();
	}*/
	
	@Test
	public void isStartDateLabelVisible() {
		Assert.assertEquals(motorEnterProductData.verifyStartLabelVisibility(), true);
	}
	
	@Test
	public void isStartDateTextBoxVisible() {
		Assert.assertEquals(motorEnterProductData.verifyStartDateTextBoxVisible(), true);
	}
	
	@Test
	public void isCalendarButtonClickable() {
		Assert.assertEquals(motorEnterProductData.verifyCalendarClickable(), true);
	}
	
	@Test
	public void validStartDateText() {
		Assert.assertEquals(motorEnterProductData.validateStartDate(), true);
	}
	
	@Test
	public void checkNextLabelInsSum() {
		String temp = motorEnterProductData.verifyNextLabelText();
		Assert.assertEquals(temp, "Insurance Sum [$]");
	}
	
	@Test
	public void isInsuranceSumLabelVisible() {
		Assert.assertEquals(motorEnterProductData.verifyInsuranceSumLabelVisibility(), true);
	}
	
	@Test
	public void isInsuranceSumDropDownVisible() {
		Assert.assertEquals(motorEnterProductData.verifyInsuranceSumDropDownVisibility(), true);
	}
	
	@Test
	public void validInsuranceDropDown() {
		Assert.assertEquals(motorEnterProductData.validateInsuranceSumSelection(), true);
	}
	
	@Test
	public void damageInsuranceLabelVisible() {
		Assert.assertEquals(motorEnterProductData.verifyDamageInsuranceLabelVisibility(), true);
	}
	
	@Test
	public void isDamageInsuranceDropDownVisible() {
		Assert.assertEquals(motorEnterProductData.verifyDamageInsuranceDropDownVisibility(), true);
	}
	
	@Test
	public void validDamageInsuranceDropDownSelection() {
		Assert.assertEquals(motorEnterProductData.validateDamageInsuranceDropDownSelection(), true);
	}
	
	@Test
	public void isOptionalProductsLabelVisible() {
		Assert.assertEquals(motorEnterProductData.verifyOptionalProductLabelVisibility(), true);
	}
	
	@Test
	public void isOptionalProductTextBoxVisible() {
		Assert.assertEquals(motorEnterProductData.verifyOptionalProductTextBoxVisibility(), true);
	}
	
/*	@Test
	public void validOptionalProductSelection() {
		Assert.assertEquals(motorEnterProductData.validateOptionalProductCheckBoxSelection(), true);
	}*/
	
	@Test
	public void isPrevButtonVisible() {
		Assert.assertEquals(motorEnterProductData.verifyPrevButtonVisibility(), true);
	}
	
	@Test
	public void verifyPrevButtonText() {
		Assert.assertEquals(motorEnterProductData.verifyPrevButtonText(), true);
	}
	
/*	@Test
	public void verifyOnClickPrevButton() {
		motorEnterProductData.ClickPrev();
		Assert.assertEquals(motorEnterInsuranceData.verifyHobbiesLabelVisibility(), true);
		motorEnterProductData.navigateToEnterProductData();
	}*/
	
	@Test
	public void isNextButtonVisible() {
		Assert.assertEquals(motorEnterProductData.verifyNextButtonVisibility(), true);
	}
	
	@Test
	public void verifyNextButtonText() {
		Assert.assertEquals(motorEnterProductData.verifyNextButtonText(), true);
	}
	
	
}

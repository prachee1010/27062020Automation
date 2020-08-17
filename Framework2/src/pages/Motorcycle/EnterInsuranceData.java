package pages.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import libraries.CommonLibrary;
import pages.Motorcycle.EnterProductData;


public class EnterInsuranceData {
	
	WebDriver dr;
	CommonLibrary lib= new CommonLibrary();
	EnterProductData enterProductData; 
	
	By motorcycle = By.xpath("//a[text()='Motorcycle']");
	By enterInsuranceData = By.xpath("//a[@id='enterinsurantdata']");
	
	public EnterInsuranceData(WebDriver dr) {

		this.dr = dr;
	}
	
	public void navigateToEnterInsuranceData() {
		dr.findElement(enterInsuranceData).click();
	}
	
	By navigator = By.xpath("//span[contains(text(),'Motor')]");
	
	By hobbiesLabel = By.xpath("//label[text()='Hobbies']");
	By hobbiesCheckBox = By.xpath("//label[text()='Hobbies']/../p");
	
	By websiteLabel = By.xpath("//label[text()='Website']");
	By websiteTextBox = By.xpath("//label[text()='Website']/../input");
	
	By pictureLabel = By.xpath("//label[text()='Picture']");
	
	By prevButton = By.xpath("//button[@id='preventervehicledata']");
	By nextButton = By.xpath("//button[@id='nextenterproductdata']");
	
	public boolean verifyHobbiesLabelVisibility() {
		return lib.isElementPresent(dr, hobbiesLabel);
	}

	public boolean verifyHobbiesCheckBoxVisibility() {
		return lib.isElementPresent(dr, hobbiesCheckBox);
	}

	public boolean validHobbiesSelection() {
		String hobbies = dr.findElement(hobbiesLabel).getText();
		dr.findElement(By.xpath("(//label[text()='Hobbies']/../p/label/span)[2]")).click();
		return lib.verifyValidSelections(dr, hobbies);
	}

	public boolean verifyWebsiteLabel() {
		return lib.isElementPresent(dr, websiteLabel);
	}

	public boolean verifyWebsiteTextBoxVisibility() {
		return lib.isElementPresent(dr, websiteTextBox);
	}

	public boolean validWebsiteEntry() {
		dr.findElement(websiteTextBox).sendKeys("abc.com");
		String website = dr.findElement(websiteLabel).getText();
		return lib.verifyValidSelections(dr, website);
	}

	public boolean verifyPictureLabelVisibility() {
		return lib.isElementPresent(dr, pictureLabel);
	}

	public boolean verifyPrevButtonVisibility() {
		return lib.isElementPresent(dr, prevButton);
	}

	public void ClickPrev() {
		dr.findElement(prevButton).click();
	}

	public boolean verifyPrevButtonText() {
		String prevButtonText = dr.findElement(prevButton).getText();
		return prevButtonText.equals("« Prev");
	}

	public boolean verifyNextButtonVisibility() {
		return lib.isElementPresent(dr, nextButton);
	}

	public boolean verifyNextButtonText() {
		String nextButtonText = dr.findElement(nextButton).getText();
		return nextButtonText.equals("Next »");
	}

	public void ClickNext() {
		dr.findElement(nextButton).click();
	}

	public boolean verifyOnClickNextButton() {
		boolean navigatorStatus = lib.isElementPresent(dr, navigator);
		return navigatorStatus;
	}

}

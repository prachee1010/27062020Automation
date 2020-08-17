package pages.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import libraries.CommonLibrary;

public class EnterVehicleData {

	CommonLibrary lib = new CommonLibrary();
	WebDriver dr;
	
	public EnterVehicleData(WebDriver dr)
	{
		this.dr=dr;			
	}
	
	By cyliderCapacityLabel = By.xpath("//label[contains(text(),'Cylinder')]");
	
	public boolean isCylinderCapacityVisible() {
		return lib.isElementPresent(dr, cyliderCapacityLabel);
	}

}

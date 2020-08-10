package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import libraries.CommonLibrary;

public class HomePage {

	WebDriver dr;
	CommonLibrary lib;

	public HomePage(WebDriver dr) {
		this.dr = dr;
		lib = new CommonLibrary();
	}

	By automobile = By.id("nav_automobile");
	By truck = By.id("nav_truck");
	By motorcycle = By.id("nav_motorcycle");
	By camper = By.id("nav_camper");

	public boolean isAutomobilePresent() {
		return lib.isElementPresent(dr, automobile);		
	}
	
	public boolean isTruckPresent() {
		return lib.isElementPresent(dr, truck);		
	}
	
	public boolean isMotorcyclePresent() {
		return lib.isElementPresent(dr, motorcycle);		
	}
	
	public boolean isCamperPresent() {
		return lib.isElementPresent(dr, camper);		
	}
	
	
	public String getAutomobileText() {
		return dr.findElement(automobile).getText();
	}
	
	public String getTruckText() {
		return dr.findElement(truck).getText();
	}
	
	public String getMotorcycleText() {
		return dr.findElement(motorcycle).getText();
	}
	
	public String getCamperText() {
		return dr.findElement(camper).getText();
	}

	
	public void clickAutomobile() {
		dr.findElement(automobile).click();
	}
	
	public void clickTruck() {
		dr.findElement(truck).click();
	}
	
	public void clickMotorcycle() {
		dr.findElement(motorcycle).click();
	}
	
	public void clickCamper() {
		dr.findElement(camper).click();
	}
	
}

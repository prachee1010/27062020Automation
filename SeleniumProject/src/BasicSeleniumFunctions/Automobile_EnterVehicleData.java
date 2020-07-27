package BasicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automobile_EnterVehicleData {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://sampleapp.tricentis.com/101/");
		dr.findElement(By.id("nav_automobile")).click();
		
		//DropDown by name
		WebElement makeDropDown = dr.findElement(By.name("Make"));
		Select sel = new Select(makeDropDown);
		sel.selectByIndex(4);
		
		//Text Box by id
		dr.findElement(By.id("engineperformance")).sendKeys("200");
		dr.findElement(By.id("listprice")).sendKeys("20000");
		dr.findElement(By.id("licenseplatenumber")).sendKeys("MNSH12S");
		dr.findElement(By.id("annualmileage")).sendKeys("2000");

		WebElement seatDropDown = dr.findElement(By.id("numberofseats"));
		Select seats = new Select(seatDropDown);
		seats.selectByIndex(4);

		WebElement fuelDropDown = dr.findElement(By.id("numberofseats"));
		Select fuel = new Select(fuelDropDown);
		fuel.selectByIndex(4);

/*		Thread.sleep(3000);
		sel.selectByValue("Ford");
		Thread.sleep(3000);
		sel.selectByVisibleText("Mercedes Benz");
*/		
		dr.findElement(By.id("dateofmanufacture")).sendKeys("12/31/2019");
		Thread.sleep(1000);
		dr.findElement(By.id("nextenterinsurantdata")).click();
		
		//Radio Button and Check Box
/*		WebElement genderRadioButton = dr.findElement(By.id("ideal-radiocheck-label"));
		Select gender = new Select(genderRadioButton);
		gender.selectByValue("Female");*/
		
		dr.findElement(By.className("ideal-radiocheck-label")).click();;
	}
}

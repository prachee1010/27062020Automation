package BasicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Truck_EnterVehicleData {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://sampleapp.tricentis.com/101/");
		dr.findElement(By.id("nav_truck")).click();
		dr.findElement(By.id("engineperformance")).sendKeys("5000");
		dr.findElement(By.id("payload")).sendKeys("500");
		dr.findElement(By.id("totalweight")).sendKeys("5490");
		dr.findElement(By.id("listprice")).sendKeys("50002");
		dr.findElement(By.id("licenseplatenumber")).sendKeys("23DS42F");
		dr.findElement(By.id("annualmileage")).sendKeys("5000");
		
	}

}

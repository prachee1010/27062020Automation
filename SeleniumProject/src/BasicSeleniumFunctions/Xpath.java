package BasicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://sampleapp.tricentis.com/101/");
		WebElement ele = dr.findElement(By.xpath("//a[@id='nav_automobile']"));
		String text = ele.getText();
		ele.click();
		
		WebElement makeDropDown = dr.findElement(By.xpath("//select[@id='make']"));
		Select make = new Select(makeDropDown);
		make.selectByIndex(2);
	
		dr.findElement(By.xpath("//input[@id='engineperformance'][@name='[kW]']")).sendKeys("2000");
		
		dr.findElement(By.xpath("//input[@name='List Price']"));
		
		
	}

}

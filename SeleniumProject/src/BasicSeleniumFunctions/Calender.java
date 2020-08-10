package BasicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://sampleapp.tricentis.com/101/");
		dr.findElement(By.id("nav_automobile")).click();
		
		dr.findElement(By.xpath("//button[@name='Open Date of Manufacture Calender']")).click();
		String year = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
		String month = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
		while(!year.equals("2019") || !month.equals("January"))
		{
			dr.findElement(By.xpath("//a[@title='Prev']")).click();
			year = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
			month = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
		}
		dr.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='21']")).click();
		
		
		
	}

}

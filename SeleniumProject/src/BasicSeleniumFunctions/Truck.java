package BasicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Truck {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://sampleapp.tricentis.com/101/");
		dr.findElement(By.id("nav_truck")).click();
		
		enterVehicleData(dr);
		Automobile obj = new Automobile();
		obj.enterinsurantdata(dr);
		
		enterProductData(dr);
		selectOption(dr);
		sendQuote(dr);
	}
	
	public static void enterVehicleData (ChromeDriver dr) throws InterruptedException {

		WebElement makeDropDown = dr.findElement(By.xpath("//select[@id='make']"));
		Select make= new Select(makeDropDown);
		make.selectByIndex(3);
		dr.findElement(By.id("engineperformance")).sendKeys("500");
		dr.findElement(By.id("payload")).sendKeys("500");
		dr.findElement(By.id("totalweight")).sendKeys("5490");
		dr.findElement(By.id("listprice")).sendKeys("50002");
		dr.findElement(By.id("licenseplatenumber")).sendKeys("23DS42F");
		dr.findElement(By.id("annualmileage")).sendKeys("5000");
		
		/*dr.findElement(By.xpath("//button[@title='Open Date of Manufacture Calender']")).click();
		String year = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
		
		System.out.println(year);
		String month = dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		while(!year.equals("2019")) {
			dr.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
			year=dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		}
		dr.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='5']")).click();
		*/
		
		dr.findElement(By.xpath("//input[@id='dateofmanufacture']")).sendKeys("01/01/2019");
		WebElement seatDropDown = dr.findElement(By.xpath("//select[@id='numberofseats']"));
		Select seats = new Select(seatDropDown);
		seats.selectByValue("5");
		
		WebElement fuelDropDown = dr.findElement(By.xpath("//select[@name='Fuel Type']"));
		Select fuel = new Select(fuelDropDown);
		fuel.selectByIndex(2);
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
		
		
	}

	public static void enterProductData(WebDriver dr) {
		
		dr.findElement(By.xpath("//a[text()='Enter Product Data']")).click();
		
		dr.findElement(By.xpath("//button[@title='Open Start Date Calender']")).click();
		String year = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
		String month = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
		WebDriverWait wait = new WebDriverWait(dr, 5);
		
		while(!year.equals("2020") || !month.equals("September")) {
			dr.findElement(By.xpath("//a[@title='Next']")).click();
			year = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
			month = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='9']")));
		dr.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='20']")).click();
		
		WebElement sumdropDown = dr.findElement(By.xpath("//select[@id='insurancesum']"));
		Select insuresum = new Select(sumdropDown);
		insuresum.selectByIndex(3);
		
		WebElement damageDropDown = dr.findElement(By.xpath("//select[@id='damageinsurance']"));
		Select damage = new Select(damageDropDown);
		damage.selectByIndex(2);
		
		dr.findElement(By.xpath("//label[text()='Legal Defense Insurance']/span")).click();
		
		dr.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
		
	}
	
	public static void selectOption(ChromeDriver dr) {
		dr.findElement(By.xpath("(//label[@class='choosePrice ideal-radiocheck-label'])[3]")).click();
		WebDriverWait wait = new WebDriverWait(dr, 5);
		wait.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.xpath("//button[@id='nextsendquote']"))));
		dr.findElement(By.xpath("//button[@id='nextsendquote']")).click();
	}
	
	public static void sendQuote(WebDriver dr) throws InterruptedException {
		
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("pracheeghuamatkar@outlook.com");
		dr.findElement(By.xpath("//input[@name='Phone']")).sendKeys("8830586821");
		dr.findElement(By.xpath("//input[@name='Username']")).sendKeys("FirstName");
		dr.findElement(By.xpath("//input[@name='Password']")).sendKeys("Password10");
		dr.findElement(By.xpath("//input[@name='Confirm Password']")).sendKeys("Password10");
		
		dr.findElement(By.xpath("//button[text()='« Send »']")).click();
		
		WebDriverWait wait = new WebDriverWait(dr, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='confirm']")));
/*		Thread.sleep(2000);
		dr.findElement(By.xpath("//button[@class='confirm']")).click();*/
	}
	
}

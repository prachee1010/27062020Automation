package BasicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automobile {
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		dr.findElement(By.id("nav_automobile")).click();
		
		EnterVehicleData(dr);
/*		enterinsurantdata(dr);
		enterproductdata(dr);
		selectpriceoption(dr);
		sendQuote(dr);*/
	}
	
	public static void EnterVehicleData(ChromeDriver dr) throws InterruptedException {
		
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

		WebElement fuelDropDown = dr.findElement(By.id("fuel"));
		Select fuel = new Select(fuelDropDown);
		fuel.selectByIndex(2);

/*		Thread.sleep(3000);
		sel.selectByValue("Ford");
		Thread.sleep(3000);
		sel.selectByVisibleText("Mercedes Benz");
*/		
		
		//Radio Button and Check Box
/*		WebElement genderRadioButton = dr.findElement(By.id("ideal-radiocheck-label"));
		Select gender = new Select(genderRadioButton);
		gender.selectByValue("Female");*/
		
		//dr.findElement(By.id("dateofmanufacture")).sendKeys("12/31/2019");
		dr.findElement(By.xpath("//button[@id='opendateofmanufacturecalender']")).click();
		String year = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
		System.out.println(year);
		String month = dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
		System.out.println(month);
		dr.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='1']")).click();
		
		
		Thread.sleep(1000);
		//dr.findElement(By.id("nextenterinsurantdata")).click();
		
		//enterinsurantdata(dr);

	}
	
	public static void enterinsurantdata(ChromeDriver dr) throws InterruptedException {
		
		//dr.findElement(By.id("enterinsurantdata")).click();
		
		dr.findElement(By.id("firstname")).sendKeys("Firstname");
		dr.findElement(By.id("lastname")).sendKeys("Lastname");
		dr.findElement(By.id("birthdate")).sendKeys("12/10/1996");
		
		WebElement radio = dr.findElement(By.xpath("//label[text()='Female']"));
		boolean isSelect = radio.isSelected();
		System.out.println(isSelect);
		
		radio.click();
		isSelect = radio.isSelected();
		System.out.println(isSelect);
		
		dr.findElement(By.id("streetaddress")).sendKeys("Street 12");
		WebElement countryDropDown = dr.findElement(By.id("country"));
		Select country = new Select(countryDropDown);
		country.selectByValue("India");
		dr.findElement(By.id("zipcode")).sendKeys("100001");
		dr.findElement(By.id("city")).sendKeys("Pune City");
		WebElement occupationDrop = dr.findElement(By.id("occupation"));
		Select occupation = new Select(occupationDrop);
		occupation.selectByIndex(1);
		
/*		WebElement hobbies = dr.findElement(By.className("ideal-radiocheck-label"));	//not working
		System.out.println(hobbies.getText());*/
		
		//dr.findElementByXPath("//label[@class='ideal-radiocheck-label'][3]").click();
		dr.findElement(By.xpath("//label[text()=' Cliff Diving']/span")).click();
		dr.findElement(By.xpath("//label[contains(.,\"Bungee\")]")).click();
		
		/*dr.findElement(By.id("website")).sendKeys("insurancewebsite.com");
		dr.findElement(By.className("ideal-file-wrap")).click();	*/					//not working
		
		
		Thread.sleep(2000);
		dr.findElement(By.id("nextenterproductdata")).click();
		
		//enterproductdata(dr);
		
	}
	
	public static void enterproductdata(ChromeDriver dr) throws InterruptedException {
		
		//dr.findElement(By.id("enterproductdata")).click();
		dr.findElement(By.id("startdate")).sendKeys("10/30/2020");
		WebElement insuresumDropDown = dr.findElement(By.id("insurancesum"));
		Select insuresum = new Select(insuresumDropDown);
		insuresum.selectByIndex(3);
		WebElement meritDropDown = dr.findElement(By.id("meritrating"));
		Select merit = new Select(meritDropDown);
		merit.selectByIndex(4);
		WebElement damageDropDown = dr.findElement(By.id("damageinsurance"));
		Select damage = new Select(damageDropDown);
		damage.selectByIndex(2);
		
		dr.findElement(By.xpath("//label[text()='Legal Defense Insurance']/span")).click();

		WebElement courtesyDropDown = dr.findElement(By.id("courtesycar"));
		Select courtesy = new Select(courtesyDropDown);
		courtesy.selectByIndex(1);
		
		Thread.sleep(2000);
		dr.findElement(By.id("nextselectpriceoption")).click();
	
		//selectpriceoption(dr);
	}
	
	public static void selectpriceoption(ChromeDriver dr) {
		
		//dr.findElement(By.id("selectpriceoption"));
		WebDriverWait wait = new WebDriverWait(dr, 10);
		wait.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.xpath("//label[@class='choosePrice ideal-radiocheck-label'][3]"))));
		dr.findElement(By.xpath("//label[@class='choosePrice ideal-radiocheck-label'][3]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.xpath("//button[@id='nextsendquote']"))));
		dr.findElement(By.xpath("//button[@id='nextsendquote']")).click();
		
		//sendQuote(dr);
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
	/*	Thread.sleep(2000);
		dr.findElement(By.xpath("//button[@class='confirm']")).click();*/
	}
	
}

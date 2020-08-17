package EnterProductDataSample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateWebsiteEntry {

	static ChromeDriver dr;
	static By websiteTextBox = By.xpath("//label[text()='Website']/../input");
	EnterProductDataSample.ValidationSample validate = new EnterProductDataSample.ValidationSample();
	
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("http://sampleapp.tricentis.com/101");
		dr.findElement(By.id("nav_motorcycle")).click();
		dr.findElement(By.id("enterinsurantdata")).click();
		
		String firstNameLabelText = dr.findElement(By.xpath("//label[text()='Hobbies']/following::div/label")).getText();
		System.out.println(firstNameLabelText);
		//enterWebsite();
		
	}
	
	public static void enterWebsite() throws InterruptedException {
		dr.findElement(websiteTextBox).sendKeys("abc.com");
		String website = dr.findElement(By.xpath("//label[text()='Website']")).getText();
		System.out.println(website);
		verifyDiv(website);
		
	}
	
	public static boolean verifyDiv(String labelText) throws InterruptedException {

		String path = "//label[text()='" + labelText + "']//parent::div[contains(@class,'valid')]";
		System.out.println(path);
		Thread.sleep(1000);
		int nonSel = dr.findElements(By.xpath(path)).size();
		if (nonSel > 0) {
			System.out.println("valid selection true");
			return true;
		} else {
			System.out.println("invalid selection false");
			return false;
		}
	}

}

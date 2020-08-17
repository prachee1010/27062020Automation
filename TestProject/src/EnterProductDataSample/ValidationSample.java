package EnterProductDataSample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ValidationSample {
	
	
	static ChromeDriver dr;
	
	@BeforeSuite
	public static void initialise() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("http://sampleapp.tricentis.com/101");
		dr.findElement(By.id("nav_motorcycle")).click();
		dr.findElement(By.id("enterinsurantdata")).click();

		dr.findElement(By.xpath("(//label[text()='Hobbies']/../p/label/span)[2]")).click();
		
		
		hobbiesSelection();
		// boolean status = verifyDiv(dr, "Hobbies");

		/*
		 * String text = "Hobbies"; String path =
		 * "//label[text()='"+text+"']//parent::div[contains(@class,'valid')]";
		 * Thread.sleep(1000); int nonSel = dr.findElements(By.xpath(path)).size(); //
		 * //div[contains(@class,'valid')]/label[text()='Hobbies'] //
		 * //label[text()='Hobbies']//parent::div[contains(@class,'valid')]
		 * //System.out.println(nonSel.getText()); if(nonSel>0) {
		 * System.out.println("valid selection"); }else {
		 * System.out.println("invalid selection"); }
		 */

	}

	/*
	 * @AfterSuite public void quit() { dr.quit(); }
	 */

	@Test
	public static void hobbiesSelection() throws InterruptedException{

		Assert.assertEquals(verifyDiv("Hobbies"), true);
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

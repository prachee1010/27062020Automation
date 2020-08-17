package pages.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EnterProductData {

	static ChromeDriver dr = null;

	@BeforeSuite
	public void lauchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\27062020\\27062020Automation\\FrameworkPrachee\\BrowserDrivers\\chromedriver.exe");
		new ChromeDriver();
		dr.get("http://sampleapp.tricentis.com/101");
		dr.findElement(By.id("nav_motorcycle")).click();
		dr.findElement(By.id("enterinsurantdata")).click();

		dr.findElement(By.xpath("(//label[text()='Hobbies']/../p/label/span)[2]")).click();
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
	public void hobbiesSelection() throws InterruptedException {

		Assert.assertEquals(SelectPriceOption.verifyDiv(dr, "Hobbies"), true);
	}
	



}

package pages.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectPriceOption {

	
	public static boolean verifyDiv(ChromeDriver dr, String labelText) throws InterruptedException {

		String path = "//label[text()='" + labelText + "']//parent::div[contains(@class,'valid')]";
		Thread.sleep(1000);
		int nonSel = dr.findElements(By.xpath(path)).size();
		if (nonSel > 0) {
			System.out.println("valid selection");
			return true;
		} else {
			System.out.println("invalid selection");
			return false;
		}
	}
}

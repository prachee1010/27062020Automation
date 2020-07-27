package BasicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		//Set Chrome driver path
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
//		dr. manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
/*		Click
		dr.findElement(By.id("nav_automobile")).click();
*/		
		//Get Text
		WebElement ele = dr.findElement(By.id("nav_automobile"));
		String text = ele.getText();
		System.out.println(text);
		
		//Enter Text
		dr.findElement(By.id("search_form")).sendKeys("VW");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		
		
//		dr.close();		//closes current window launched by driver
//		dr.quit();		//quits all current sessions launched by driver
	}

}

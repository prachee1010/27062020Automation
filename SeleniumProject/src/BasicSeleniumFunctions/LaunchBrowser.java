package BasicSeleniumFunctions;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		//Set Chrome driver path
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.google.com/");
	}

}

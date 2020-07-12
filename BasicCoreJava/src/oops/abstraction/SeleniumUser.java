package oops.abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUser {

	public static void main(String[] args) {
		
		launchBrowser(new ChromeDriver());
		launchBrowser(new EdgeDriver());
		launchBrowser(new FirefoxDriver());
		
	}
	
	public static void launchBrowser(WebDriver dr) {
		dr.get("https://www.selenium.dev/downloads/");
	}
}

package collection;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsInSelenium {

	public static void main(String[] args) {

		ChromeDriver dr = new ChromeDriver();
		
		//List in Selenium
		List<WebElement> list = dr.findElements(By.xpath(""));
		
		//Set in Selenium
		Set<String> wins = dr.getWindowHandles();
	}

}

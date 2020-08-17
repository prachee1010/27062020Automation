package EnterProductDataSample;

import java.awt.List;
import java.util.Vector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnAllHobbies {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://sampleapp.tricentis.com/101");
		dr.findElement(By.id("nav_motorcycle")).click();
		dr.findElement(By.id("enterinsurantdata")).click();
		
		String[] hobbies = {"Speeding", "Bungee Jumping", "Cliff Diving", "Skydiving", "Other"};
		
		for(String hobby: hobbies){
			/*String selectXpath = "//label[text()='Hobbies']/../p/label[contains(text(),'"+hobby+"']";
			System.out.println(selectXpath);
			dr.findElement(By.xpath(selectXpath)).click();*/
			
		}
		
		for(int i=1; i<=hobbies.length;i++) {
			
			String path = "(//label[text()='Hobbies']/../p/label/span)["+i+"]";
			dr.findElement(By.xpath(path)).click();
			
//			String selectedHobby = dr.findElement(By.xpath("//label[text()='Hobbies']/../p/label/span[contains(@class,'checked')]")).getText();
			
//			System.out.println(selectedHobby);
		}
		
		
	}

}

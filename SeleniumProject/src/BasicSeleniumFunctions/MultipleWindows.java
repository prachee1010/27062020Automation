package BasicSeleniumFunctions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://sampleapp.tricentis.com/101/index.php");

		String parent = dr.getWindowHandle();
		System.out.println(parent);

		dr.findElement(By.id("search_form")).sendKeys("VW");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).clear();
		
		dr.findElement(By.id("search_form")).sendKeys("BMW");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).clear();
		
		dr.findElement(By.id("search_form")).sendKeys("xyz");
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		dr.findElement(By.id("search_form")).clear();
		
		Set<String> winds = dr.getWindowHandles();
		
		//By window IDs
/*		for (String w : winds) {

			if (!w.equals(parent)) {
				dr.switchTo().window(w);		//when window is not parent switch to that window
			}

		}*/
		
		//By Unique WebElements
		for(String w:winds) {
			
			dr.switchTo().window("w");
			List<WebElement> elements = dr.findElements(By.xpath("//input[@value='BMW']"));
			
			if(elements.size()>0) {
				break;
			}
		}

		dr.findElement(By.xpath("//a[text()='Login/Register']")).click();

		dr.findElement(By.xpath("//input[@class='login_icon login_input']")).sendKeys("abc@gmail.com");

		Thread.sleep(2000);
		dr.close();
		
		dr.switchTo().window(parent);
		dr.findElement(By.id("nav_automobile")).click();
		
	}

}

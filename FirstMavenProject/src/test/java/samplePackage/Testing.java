package samplePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {

	@Test
	public void test1() {
		System.out.println("Testing Maven-TestNG integration");
	}
	
	@Test
	public void test2() throws InterruptedException {
		System.out.println("Testing Maven-Selenium integration");
		//launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\\\Tech Bodhi\\\\Automation Notes\\\\Drivers\\\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		//click automobile
/*		dr.get("http://sampleapp.tricentis.com/101/");
		dr.findElement(By.id("nav_automobile")).click();*/
		dr.get("https://paytm.com/");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		
		Thread.sleep(7000);		
		dr.switchTo().frame(0);
		System.out.println(dr.findElement(By.xpath("//p[text()='To Login into your Paytm Web account']")).getText());
//		dr.quit();
	}
}

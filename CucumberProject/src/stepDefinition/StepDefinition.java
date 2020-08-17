package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
//import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	static WebDriver dr;
	
	@Given("^User is on homepage$")
	public void navigateToTricentisHome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Tech Bodhi\\Automation Notes\\Drivers\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("http://sampleapp.tricentis.com/101/");
		System.out.println("Navigate to Homepage");
		
		//capture screenshot
	}

	@When("^User search with (.*?) keyword$")
	public void enterSearchData(String searchData) throws IOException {
		dr.findElement(By.id("search_form")).clear();
		dr.findElement(By.id("search_form")).sendKeys(searchData);
		
		//capture screenshot
		String screenshotPath = "D:\\27062020\\27062020Automation\\CucumberProject\\src\\screenshots\\"+searchData+".png";
		File destFile = new File(screenshotPath);
		TakesScreenshot scrshot = (TakesScreenshot) dr;
		File srcFile = scrshot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, destFile);
		
		dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
		System.out.println("Enter search data: " + searchData);
	}

	@Then("^relevant results should be displayed$")
	public void validateSearch() {
		Set<String> winds = dr.getWindowHandles();
		if (winds.size() > 1) {
			System.out.println("PASS : Search success");
		} else {
			System.out.println("FAIL : Search unsuccessful");
		}
		
		dr.quit();
	}
	
	@When("^User scrolls till end of page$")
	public void scrollTillPageEnd() {
		WebElement ele = dr.findElement(By.xpath("//a[@id='tricentis_about']"));
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	@Then("^Footer links visible$")
	public void verifyFooters() {
		dr.findElement(By.xpath("//a[@id='tricentis_services']")).click();
		dr.quit();
	}
	
	@When("^Click on Automobile link$")
	public void clickonAutomobile() {
		dr.findElement(By.id("nav_automobile")).click();
	}
	
	@And("^Click on Enter Insurance Data$")
	public void clickEnterInsuranceData() {
		dr.findElement(By.xpath("//a[@id='enterinsurantdata']")).click();
	}
	
	@And("^Click on Open button and upload document$")
	public void clickOpenAndUploadDocument() throws AWTException, InterruptedException {
		dr.findElement(By.xpath("//button[text()='Open']")).click();
		String imagePath = "D:\\27062020\\27062020Automation\\CucumberProject\\src\\screenshots\\BMW.png";
		Thread.sleep(3000);
		
		//copy data in clipboard
		StringSelection cb = new StringSelection(imagePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Click open");
	}
	
	@Then("^Document should be uploaded$")
	public void verifyUploadedDocument() {
		String imageName = dr.findElement(By.xpath("//input[@id='picture']")).getText();
		
		System.out.println("Document uploaded");
	}
}

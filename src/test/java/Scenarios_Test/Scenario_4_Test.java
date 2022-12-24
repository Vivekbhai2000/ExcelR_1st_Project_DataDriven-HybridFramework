package Scenarios_Test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Bases.OHRMBase;

public class Scenario_4_Test extends OHRMBase{
	
	@BeforeTest
	public void OpenBrowsere() {
		Intialization();
		System.out.println("Browser Is Opening");	
	}
	
	@Test
	public void S4() {
		driver.findElement(By.xpath(prop.getProperty("S4FYPxpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("S4Usernamexpath"))).sendKeys(prop.getProperty("S4Username"));
		driver.findElement(By.xpath(prop.getProperty("S4Submitxpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("S4RPDisplayedxpath"))).isDisplayed();
		System.out.println("Reset Password Done");
	}
	
	@AfterTest
	public void CloseBrowser() {
		TearDown();
		System.out.println("Browser Is Closing");	
	}

}

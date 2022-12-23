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
		driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vivek@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//h6[text()='Reset Password link sent successfully']")).isDisplayed();
		System.out.println("Reset Password Done");
	}
	
	@AfterTest
	public void CloseBrowser() {
		TearDown();
		System.out.println("Browser Is Closing");	
	}

}

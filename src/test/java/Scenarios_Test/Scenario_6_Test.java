package Scenarios_Test;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Bases.OHRMBase;

public class Scenario_6_Test extends OHRMBase{
	
	@BeforeTest
	public void OpenBrowsere() {
		Intialization();
		System.out.println("Browser Is Opening");	
	}
	
	@Test
	public void S6() throws AWTException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("1");
		driver.findElement(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")).click();
		System.out.println("2");
		driver.findElement(By.xpath("//a[text()='Vacancies']")).click();
		System.out.println("3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		System.out.println("4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("S6Name"));
		System.out.println("5");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[2]/i")).click();
		System.out.println("6");
		
//		Space for Dropdown
//		WebElement JobTitle = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[2]"));
//		JobTitle.click();
//		System.out.println("gsvdhfvs");
//		JobTitle.findElement(By.xpath("//div[text()='Chief Executive Officer']")).click();
//		System.out.println("7");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div[2]/textarea")).sendKeys(prop.getProperty("S6Description"));
		System.out.println("8");
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(prop.getProperty("S6HiringManager"));
		System.out.println("9");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input")).sendKeys(prop.getProperty("S6Position"));
		System.out.println("10");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Vacancy Details Added");
	}
	
	@AfterTest
	public void CloseBrowser() {
		TearDown();
		System.out.println("Browser Is Closing");
	}

}

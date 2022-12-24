package Scenarios_Test;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		driver.findElement(By.xpath(prop.getProperty("Usernamexpath"))).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath(prop.getProperty("Passwordxpath"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath(prop.getProperty("Loginxpath"))).click();
		System.out.println("1");
		driver.findElement(By.xpath(prop.getProperty("S5S6RecruitmentMenu"))).click();
		System.out.println("2");
		driver.findElement(By.xpath(prop.getProperty("S6VacanciesMenu"))).click();
		System.out.println("3");
		driver.findElement(By.xpath(prop.getProperty("S6AddVacancyButton"))).click();
		System.out.println("4");
		driver.findElement(By.xpath(prop.getProperty("S6Namexpath"))).sendKeys(prop.getProperty("S6Name"));
		System.out.println("5");
		driver.findElement(By.xpath(prop.getProperty("S6JobTitiledropdownkeyxpath"))).click();
		System.out.println("6");
		List<WebElement> JobTitle = driver.findElements(By.xpath(prop.getProperty("S6JobTitilelistxpath")));
		for (int i = 0; i<JobTitle.size(); i++) {
			if (JobTitle.get(i).equals("Chief Executive Officer")) {
				JobTitle.get(i).click();
			}
		}
		System.out.println("7");
		driver.findElement(By.xpath(prop.getProperty("S6Descriptionxpath"))).sendKeys(prop.getProperty("S6Description"));
		System.out.println("8");
		driver.findElement(By.xpath(prop.getProperty("S6HiringManagerxpath"))).sendKeys(prop.getProperty("S6HiringManager"));
		System.out.println("9");
		driver.findElement(By.xpath(prop.getProperty("S6Positionxpath"))).sendKeys(prop.getProperty("S6Position"));
		System.out.println("10");
		driver.findElement(By.xpath(prop.getProperty("S6Submitxpath"))).click();
		System.out.println("Vacancy Details Added");
	}
	
	@AfterTest
	public void CloseBrowser() {
		TearDown();
		System.out.println("Browser Is Closing");
	}

}

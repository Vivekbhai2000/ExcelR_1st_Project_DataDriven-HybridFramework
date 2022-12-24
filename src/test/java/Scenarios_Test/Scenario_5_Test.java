package Scenarios_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Bases.OHRMBase;

public class Scenario_5_Test extends OHRMBase{
	
	@BeforeTest
	public void OpenBrowsere() {
		Intialization();
		System.out.println("Browser Is Opening");	
	}
	
	@Test
	public void S5() throws AWTException {
		driver.findElement(By.xpath(prop.getProperty("Usernamexpath"))).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath(prop.getProperty("Passwordxpath"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath(prop.getProperty("Loginxpath"))).click();
		System.out.println("1");
		driver.findElement(By.xpath(prop.getProperty("S5S6RecruitmentMenu"))).click();
		System.out.println("2");
		driver.findElement(By.xpath(prop.getProperty("S5AddRecruitmentButton"))).click();
		System.out.println("3");
		driver.findElement(By.xpath(prop.getProperty("S5Firstnamexpath"))).sendKeys(prop.getProperty("S5Firstname"));
		driver.findElement(By.xpath(prop.getProperty("S5Middlenamexpath"))).sendKeys(prop.getProperty("S5Middlename"));
		driver.findElement(By.xpath(prop.getProperty("S5Lastnamexpath"))).sendKeys(prop.getProperty("S5Lastname"));
		System.out.println("4");
		driver.findElement(By.xpath(prop.getProperty("S5VacancyDropdownbutton"))).click();
		System.out.println("5");
		List<WebElement> Vacancy = driver.findElements(By.xpath(prop.getProperty("S5VacancyList")));
		for (int i = 0; i < Vacancy.size(); i++) {
			if(Vacancy.get(i).equals("Associate IT Manager")) {
				Vacancy.get(i).click();
			}
		}
		System.out.println("6");
		driver.findElement(By.xpath(prop.getProperty("S5Emailxpath"))).sendKeys(prop.getProperty("S5Email"));
		System.out.println("7");
		driver.findElement(By.xpath(prop.getProperty("S5Numberxpath"))).sendKeys(prop.getProperty("S5Number"));
		System.out.println("8");
	    driver.findElement(By.xpath(prop.getProperty("S5ResumeAddButton"))).click();
		Robot rb = new Robot();
		rb.delay(3000);
		StringSelection ss = new StringSelection(prop.getProperty("S5StringSelection"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("9");
		driver.findElement(By.xpath(prop.getProperty("S5Keywordsxpath"))).sendKeys(prop.getProperty("S5Keywords"));
		System.out.println("10");
        driver.findElement(By.xpath(prop.getProperty("S5DateOfApplicationxpath"))).clear();
        System.out.println("11");
		driver.findElement(By.xpath(prop.getProperty("S5Notesxpath"))).sendKeys(prop.getProperty("S5Notes"));
		System.out.println("12");
		driver.findElement(By.xpath(prop.getProperty("S5Consentclick"))).click();
		System.out.println("13");
		driver.findElement(By.xpath(prop.getProperty("S5SaveButton"))).click();
		System.out.println("Recruitment Added");
		driver.findElement(By.xpath(prop.getProperty("Logoutdropdownxpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("Logoutxpath"))).click();
		System.out.println("Logout Done");
	}
	
	@AfterTest
	public void CloseBrowser() {
		TearDown();
		System.out.println("Browser Is Closing");
	}

}

package Scenarios_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Bases.OHRMBase;

public class Scenario_2_Test extends OHRMBase{
	
	@BeforeTest
	public void OpenBrowsere() {
		Intialization();
		System.out.println("Browser Is Opening");
	}
	
	@Test
	public void S2() throws AWTException {
		driver.findElement(By.xpath(prop.getProperty("Usernamexpath"))).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath(prop.getProperty("Passwordxpath"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath(prop.getProperty("Loginxpath"))).click();
		System.out.println("d1");
		driver.findElement(By.xpath(prop.getProperty("S2PIMMenu"))).click();
		System.out.println("d2");
		driver.findElement(By.xpath(prop.getProperty("S2PIMAddButton"))).click();
		System.out.println("d3");
		WebElement Button = driver.findElement(By.xpath(prop.getProperty("S2PICAddButton")));
		Button.click();
		Robot rb = new Robot();
		rb.delay(3000);
		StringSelection ss = new StringSelection(prop.getProperty("S2StringSelection"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("d4");
		driver.findElement(By.xpath(prop.getProperty("S2Firstnamexpath"))).sendKeys(prop.getProperty("S2Firstname"));
		System.out.println("d5");
		driver.findElement(By.xpath(prop.getProperty("S2Middlenamexpath"))).sendKeys(prop.getProperty("S2Middlename"));
		System.out.println("d6");
		driver.findElement(By.xpath(prop.getProperty("S2Lastnamexpath"))).sendKeys(prop.getProperty("S2Lastname"));
		System.out.println("d7");
		driver.findElement(By.xpath(prop.getProperty("S2EmployeeIDxpath"))).sendKeys("22");
		System.out.println("d8");
		driver.findElement(By.xpath(prop.getProperty("S2CreateLoginDetailsButton"))).click();
		System.out.println("d9");
		driver.findElement(By.xpath(prop.getProperty("S2Usernamexpath"))).sendKeys(prop.getProperty("S2Username"));
		System.out.println("1");
		driver.findElement(By.xpath(prop.getProperty("S2Passwordxpath"))).sendKeys(prop.getProperty("S2Password"));
		System.out.println("2");
		driver.findElement(By.xpath(prop.getProperty("S2Confirmpasswordxpath"))).sendKeys(prop.getProperty("S2Confirmpassword"));
		System.out.println("3");
		driver.findElement(By.xpath(prop.getProperty("S2SaveButtonxpath"))).click();
		System.out.println("User Is Added");
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

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
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("d1");
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
		System.out.println("d2");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		System.out.println("d3");
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button"));
		Button.click();
		Robot rb = new Robot();
		rb.delay(3000);
		StringSelection ss = new StringSelection("C:\\Users\\SHARMA JI\\eclipse-workspace\\1st_Week_Project_DataDriven\\src\\main\\java\\Config\\Upload Pic.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("d4");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(prop.getProperty("S2Firstname"));
		System.out.println("d5");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(prop.getProperty("S2Middlename"));
		System.out.println("d6");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(prop.getProperty("S2Lastname"));
		System.out.println("d7");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("22");
		System.out.println("d8");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
		System.out.println("d9");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("S2Username"));
		System.out.println("1");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("S2Password"));
		System.out.println("2");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("S2Confirmpassword"));
		System.out.println("3");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("User Is Added");
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("Logout Done");
	}
	
	@AfterTest
	public void CloseBrowser() {
		TearDown();
		System.out.println("Browser Is Closing");
	}

}

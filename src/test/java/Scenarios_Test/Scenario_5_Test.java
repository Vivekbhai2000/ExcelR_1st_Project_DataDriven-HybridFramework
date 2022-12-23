package Scenarios_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("1");
		driver.findElement(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")).click();
		System.out.println("2");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		System.out.println("3");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(prop.getProperty("S5Firstname"));
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(prop.getProperty("S5Middlename"));
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(prop.getProperty("S5Lastname"));
		System.out.println("4");
		
//		Space for Dropdown
//		WebElement Vacancy = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
//		Vacancy.click();
//		Select s = new Select(Vacancy);
//		s.selectByVisibleText("Associate IT Manager");
//		System.out.println("5");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]")).click();
		System.out.println("6");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("S5Email"));
		System.out.println("7");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("S5Number"));
		System.out.println("8");
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/div/div[1]")).click();
		Robot rb = new Robot();
		rb.delay(3000);
		StringSelection ss = new StringSelection("C:\\Users\\SHARMA JI\\eclipse-workspace\\1st_Week_Project_DataDriven\\src\\main\\java\\Config\\Sample.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("9");
		driver.findElement(By.xpath("//input[@placeholder='Enter comma seperated words...']")).sendKeys(prop.getProperty("S5Keywords"));
		System.out.println("10");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[2]/div/div[2]/div/div/input")).clear();
        System.out.println("11");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea")).sendKeys(prop.getProperty("S5Notes"));
		System.out.println("12");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span/i")).click();
		System.out.println("13");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Recruitment Added");
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

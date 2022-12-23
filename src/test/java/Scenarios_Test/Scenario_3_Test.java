package Scenarios_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Bases.OHRMBase;

public class Scenario_3_Test extends OHRMBase{
	
	@BeforeTest
	public void OpenBrowsere() {
		Intialization();
		System.out.println("Browser Is Opening");
	}
	
	@Test
	public void S3() throws AWTException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("S3Username"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("S3Password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(prop.getProperty("S3Firstname"));
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(prop.getProperty("S3Middlename"));
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(prop.getProperty("S3Lastname"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")).sendKeys(prop.getProperty("S3Nickname"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("S3OtherID"));
//		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("S3LicenseExpiryDate"));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i"));
		System.out.println("1");
		
//		Space for Dropdown
//		WebElement Nationality = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div"));
//		Nationality.click();
//		Select sel = new Select(Nationality);
//		sel.selectByVisibleText("Indian");
//		System.out.println("2");

//		Space for Dropdown
//		WebElement MaritalStatus = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div"));
//		MaritalStatus.click();
//		Select sel1 = new Select(MaritalStatus);
//		sel1.selectByVisibleText("Single");
//		System.out.println("3");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span")).click();
		System.out.println("4");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("S3MilitaryService"));
		System.out.println("5");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")).click();
		System.out.println("6");
		
//		Space for Dropdown
//		WebElement BloodType = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div/div[1]"));
//		BloodType.click();
//		Select sel2 = new Select(BloodType);
//		sel2.selectByVisibleText("B+");
//		System.out.println("7");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")).click();
		System.out.println("8");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[1]")).click();
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
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[2]/div/div/div/div[2]/textarea")).sendKeys(prop.getProperty("S3Comment"));
		System.out.println("10");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[3]/button[2]")).click();
		System.out.println("1st Done");
		
		WebElement ContactDetails = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a"));
		Actions act = new Actions(driver);
		act.scrollToElement(ContactDetails).click().build().perform();
		System.out.println("Enter Contact Details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("S3Street1"));
		System.out.println("123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("S3Street2"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")).sendKeys(prop.getProperty("S3City"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys(prop.getProperty("S3State"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")).sendKeys(prop.getProperty("S3ZipCode"));

//		Space for Dropdown
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("S3Home"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("S3Mobile"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input")).sendKeys(prop.getProperty("S3Work"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("S3WorkEmail"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("S3OtherEmail"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div[1]")).click();
		Robot rb1 = new Robot();
		rb1.delay(3000);
		StringSelection ss1 = new StringSelection("C:\\Users\\SHARMA JI\\eclipse-workspace\\1st_Week_Project_DataDriven\\src\\main\\java\\Config\\Sample.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/div/div/div/div[2]/textarea")).sendKeys("Contacts Details Done");
		System.out.println("2nd Done");
		
		WebElement EmergencyContactsDetails = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a"));
		Actions act1 = new Actions(driver);
		act1.scrollToElement(EmergencyContactsDetails).click().build().perform();
		System.out.println("Enter Emergency Contacts Details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("S3ContactdetialsName"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("S3ContactdetialsRelationship"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("S3ContactdetialsHomeTelephone"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("S3ContactdetialsMobile"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input")).sendKeys(prop.getProperty("S3ContactdetialsWorkTelephone"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[1]/div/div/div/div[2]/div/div[1]")).click();
		Robot rb2 = new Robot();
		rb2.delay(3000);
		StringSelection ss2 = new StringSelection("C:\\Users\\SHARMA JI\\eclipse-workspace\\1st_Week_Project_DataDriven\\src\\main\\java\\Config\\Sample.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[2]/div/div/div/div[2]/textarea")).sendKeys(prop.getProperty("S3ContactdetialsComment"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[3]/button[2]")).click();
		System.out.println("3rd done");
		
		WebElement DependentDetails = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[4]/a"));
		Actions act2 = new Actions(driver);
		act2.scrollToElement(DependentDetails).click().build().perform();
		System.out.println("Enter Dependent Details");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")).click();
		driver.findElement(By.xpath("")).sendKeys(prop.getProperty("S3DependentName"));
		
//		Space for Dropdown
//		driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.xpath("")).sendKeys(prop.getProperty("S3DependentDOB"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[1]/div/div/div/div[2]/div/div[1]")).click();
		Robot rb3 = new Robot();
		rb3.delay(3000);
		StringSelection ss3 = new StringSelection("C:\\Users\\SHARMA JI\\eclipse-workspace\\1st_Week_Project_DataDriven\\src\\main\\java\\Config\\Sample.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[2]/div/div/div/div[2]/textarea")).sendKeys(prop.getProperty("S3DependentComment"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[3]/button[2]")).click();
		System.out.println("4th Done");
		
		WebElement Immigrationdetails = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[5]/a"));
		Actions act3 = new Actions(driver);
		act3.scrollToElement(Immigrationdetails).click().build().perform();
		System.out.println("Enter Immigration details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("S3PassportNumber"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("S3PassportIssuedDate"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("S3PassportExpiryDate"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[4]/div/div[2]/input")).sendKeys(prop.getProperty("S3PassportEligibleStatus"));
		
//		Space for Dropdown
//		driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[6]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("S3PassportEligibleReviewDate"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[7]/div/div[2]/textarea")).sendKeys(prop.getProperty("S3PassportComments"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[1]/div/div/div/div[2]/div/div[1]")).click();
		Robot rb4 = new Robot();
		rb4.delay(3000);
		StringSelection ss4 = new StringSelection("C:\\Users\\SHARMA JI\\eclipse-workspace\\1st_Week_Project_DataDriven\\src\\main\\java\\Config\\Sample.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss4, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[2]/div/div/div/div[2]/textarea")).sendKeys(prop.getProperty("S3ImmigrationComment"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[3]/button[2]")).click();
		System.out.println("5th Done");
		
		WebElement Qualificationsdetails = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[10]/a"));
		Actions act4 = new Actions(driver);
		act4.scrollToElement(Qualificationsdetails).click().build().perform();
		System.out.println("Enter Qualifications Details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("S3WorkExperienceCompany"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("S3WorkExperienceJobTitle"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("S3WorkExperienceFrom"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("S3WorkExperienceTo"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[3]/div/div/div/div[2]/textarea")).sendKeys(prop.getProperty("S3WorkExperienceComment"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[4]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button")).click();
//		Space for Dropdown
//		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("S3EducationInstitute"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")).sendKeys(prop.getProperty("S3EducationMajor/Specialization"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys(prop.getProperty("S3EducationYear"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")).sendKeys(prop.getProperty("S3EducationGPA/Score"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("S3EducationStartDate"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("S3EducationEndDate"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[3]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/div/button")).click();
//		Space for Dropdown
//		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("S3SkillYearsofExperience"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[2]/div/div/div/div[2]/textarea")).sendKeys(prop.getProperty("S3SkillComment"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[3]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/div/button")).click();
//		Space for Dropdown
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[2]/div/div/div/div[2]/textarea")).sendKeys(prop.getProperty("S3LanguageComment"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[3]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/div/button")).click();
//		Space for Dropdown
//		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("S3LicenseNumber"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("S3LicenseIssuedDate"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("S3LicenseExpiryDate"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[3]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[7]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[7]/div/form/div[1]/div/div/div/div[2]/div/div[1]")).click();
		Robot rb5 = new Robot();
		rb5.delay(3000);
		StringSelection ss5 = new StringSelection("C:\\Users\\SHARMA JI\\eclipse-workspace\\1st_Week_Project_DataDriven\\src\\main\\java\\Config\\Sample.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss5, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[7]/div/form/div[2]/div/div/div/div[2]/textarea")).sendKeys(prop.getProperty("S3QualificationComment"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[7]/div/form/div[3]/button[2]")).click();
		System.out.println("Qualification Is Done");
		
		WebElement Membershipdetails = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[11]/a"));
		Actions act5 = new Actions(driver);
		act5.scrollToElement(Membershipdetails).click().build().perform();
		System.out.println("Enter Membership Details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")).click();
//		Space for Dropdown
//		driver.findElement(By.xpath("")).click();
//		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")).sendKeys(prop.getProperty("S3SubscriptionAmount"));
//		Space for Dropdown
//		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("S3SubscriptionCommenceDate"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("S3SubscriptionRenewalDate"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[1]/div/div/div/div[2]/div/div[1]")).click();
		Robot rb6 = new Robot();
		rb6.delay(3000);
		StringSelection ss6 = new StringSelection("C:\\Users\\SHARMA JI\\eclipse-workspace\\1st_Week_Project_DataDriven\\src\\main\\java\\Config\\Sample.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss6, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[2]/div/div/div/div[2]/textarea")).sendKeys(prop.getProperty("S3MembershipComment"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div/form/div[3]/button[2]")).click();
		System.err.println("Membership Is Done");
		
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("Scenario 3 Is Done");
	}
	
	@AfterTest
	public void CloseBrowser() {
		TearDown();
		System.out.println("Browser Is Closing");	
	}

}

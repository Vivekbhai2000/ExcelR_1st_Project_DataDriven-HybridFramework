package Scenarios_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		
//      Personal Details
		driver.findElement(By.xpath(prop.getProperty("S3Usernamexpath"))).sendKeys(prop.getProperty("S3Username"));
		driver.findElement(By.xpath(prop.getProperty("S3Passwordxpath"))).sendKeys(prop.getProperty("S3Password"));
		driver.findElement(By.xpath(prop.getProperty("S3LoginButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3ViewMyDetailsMenu"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3Firstnamexpath"))).sendKeys(prop.getProperty("S3Firstname"));
		driver.findElement(By.xpath(prop.getProperty("S3Middlenamexpath"))).sendKeys(prop.getProperty("S3Middlename"));
		driver.findElement(By.xpath(prop.getProperty("S3Lastnamexpath"))).sendKeys(prop.getProperty("S3Lastname"));
		driver.findElement(By.xpath(prop.getProperty("S3Nicknamexpath"))).sendKeys(prop.getProperty("S3Nickname"));
		driver.findElement(By.xpath(prop.getProperty("S3Nicknamexpath"))).sendKeys(prop.getProperty("S3OtherID"));
		driver.findElement(By.xpath(prop.getProperty("S3LicenseExpiryDatexpath"))).clear();
		driver.findElement(By.xpath(prop.getProperty("S3Nationalitydropdownbutton"))).click();
		List<WebElement> Nationality = driver.findElements(By.xpath(prop.getProperty("S3NationalityList")));
		for (int i = 0; i<Nationality.size(); i++) {
			if (Nationality.get(i).equals("Indian")) {
				Nationality.get(i).click();
			}
		}
		System.out.println("2");
		driver.findElement(By.xpath(prop.getProperty("S3MaritalStatusdropdownbutton"))).click();
		List<WebElement> MaritalStatus = driver.findElements(By.xpath(prop.getProperty("S3MaritalStatusList")));
		for (int i = 0; i<MaritalStatus.size(); i++) {
			if (MaritalStatus.get(i).equals("Single")) {
				MaritalStatus.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3GenderButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3MilitaryServicexpath"))).sendKeys(prop.getProperty("S3MilitaryService"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton1.1"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3BloodTypedropdownButton"))).click();
		List<WebElement> BloodType = driver.findElements(By.xpath(prop.getProperty("S3BloodTypeList")));
		for (int i = 0; i<BloodType.size(); i++) {
			if (BloodType.get(i).equals("B+")) {
				BloodType.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton1.2"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3PDAttachmentAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3PDSelectFileButton"))).click();
		Robot rb = new Robot();
		rb.delay(3000);
		StringSelection ss = new StringSelection(prop.getProperty("S3PDStringSelection"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath(prop.getProperty("S3PDCommentxpath"))).sendKeys(prop.getProperty("S3PDComment"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton1.3"))).click();
		System.out.println("Personal Details Done");

//		Contact Details
		WebElement ContactDetails = driver.findElement(By.xpath(prop.getProperty("S3ContactDetailsMenu")));
		Actions act = new Actions(driver);
		act.scrollToElement(ContactDetails).click().build().perform();
		System.out.println("Enter Contact Details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath(prop.getProperty("S3Street1xpath"))).sendKeys(prop.getProperty("S3Street1"));
		driver.findElement(By.xpath(prop.getProperty("S3Street2xpath"))).sendKeys(prop.getProperty("S3Street2"));
		driver.findElement(By.xpath(prop.getProperty("S3Cityxpath"))).sendKeys(prop.getProperty("S3City"));
		driver.findElement(By.xpath(prop.getProperty("S3Statexpath"))).sendKeys(prop.getProperty("S3State"));
		driver.findElement(By.xpath(prop.getProperty("S3ZipCodexpath"))).sendKeys(prop.getProperty("S3ZipCode"));
		driver.findElement(By.xpath(prop.getProperty("S3Countrydropdownbutton"))).click();
		List<WebElement> Country = driver.findElements(By.xpath(prop.getProperty("S3CountryList")));
		for (int i = 0; i<Country.size(); i++) {
			if (Country.get(i).equals("India")) {
				Country.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3Homexpath"))).sendKeys(prop.getProperty("S3Home"));
		driver.findElement(By.xpath(prop.getProperty("S3Mobilexpath"))).sendKeys(prop.getProperty("S3Mobile"));
		driver.findElement(By.xpath(prop.getProperty("S3Workxpath"))).sendKeys(prop.getProperty("S3Work"));
		driver.findElement(By.xpath(prop.getProperty("S3WorkEmailxpath"))).sendKeys(prop.getProperty("S3WorkEmail"));
		driver.findElement(By.xpath(prop.getProperty("S3OtherEmailxpath"))).sendKeys(prop.getProperty("S3OtherEmail"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton2.1"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3CDAttachmentAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3CDAddFile"))).click();
		Robot rb1 = new Robot();
		rb1.delay(3000);
		StringSelection ss1 = new StringSelection(prop.getProperty("S3CDStringSelection"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath(prop.getProperty("S3CDCommentxpath"))).sendKeys(prop.getProperty("S3CDComment"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton2.2"))).click();
		
//		Emergency Contacts Details
		WebElement EmergencyContactsDetails = driver.findElement(By.xpath(prop.getProperty("S3ECDMenu")));
		Actions act1 = new Actions(driver);
		act1.scrollToElement(EmergencyContactsDetails).click().build().perform();
		System.out.println("Enter Emergency Contacts Details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath(prop.getProperty("S3AssignECAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3ContactdetialsNamexpath"))).sendKeys(prop.getProperty("S3ContactdetialsName"));
		driver.findElement(By.xpath(prop.getProperty("S3ContactdetialsRelationshipxpath"))).sendKeys(prop.getProperty("S3ContactdetialsRelationship"));
		driver.findElement(By.xpath(prop.getProperty("S3ContactdetialsHomeTelephonexpath"))).sendKeys(prop.getProperty("S3ContactdetialsHomeTelephone"));
		driver.findElement(By.xpath(prop.getProperty("S3ContactdetialsMobilexpath"))).sendKeys(prop.getProperty("S3ContactdetialsMobile"));
		driver.findElement(By.xpath(prop.getProperty("S3ContactdetialsWorkTelephonexpath"))).sendKeys(prop.getProperty("S3ContactdetialsWorkTelephone"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton3.1"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3ECDAttachmentAddButton"))).click();
        driver.findElement(By.xpath(prop.getProperty("S3ECDSelectFilebutton"))).click();
		Robot rb2 = new Robot();		
		rb2.delay(3000);
		StringSelection ss2 = new StringSelection(prop.getProperty("S3ECDStringSelection"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath(prop.getProperty("S3ContactdetialsCommentxpath"))).sendKeys(prop.getProperty("S3ContactdetialsComment"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton3.2"))).click();
		System.out.println("Emergency Contacts Details done");
		
//		Dependent Details
		WebElement DependentDetails = driver.findElement(By.xpath(prop.getProperty("S3DDMenu")));
		Actions act2 = new Actions(driver);
		act2.scrollToElement(DependentDetails).click().build().perform();
		System.out.println("Enter Dependent Details");
		driver.findElement(By.xpath(prop.getProperty("S3AssignDependentAddbutton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3DependentNamexpath"))).sendKeys(prop.getProperty("S3DependentName"));
		driver.findElement(By.xpath(prop.getProperty("S3DDRelationshipDropdownButton"))).click();
		List<WebElement> Relationship = driver.findElements(By.xpath(prop.getProperty("S3DDRelationshipList")));
		for (int i = 0; i<Relationship.size(); i++) {
			if (Relationship.get(i).equals("Child")) {
				Relationship.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3DependentDOBxpath"))).sendKeys(prop.getProperty("S3DependentDOB"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton4.1"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3DDAttachmentAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3DDselectFileButton"))).click();
		Robot rb3 = new Robot();
		rb3.delay(3000);
		StringSelection ss3 = new StringSelection(prop.getProperty("S3DDStringSelection"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath(prop.getProperty("S3DependentCommentxpath"))).sendKeys(prop.getProperty("S3DependentComment"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton4.2"))).click();
		System.out.println("Dependent Done");
		
//		Immigration Details
		WebElement Immigrationdetails = driver.findElement(By.xpath(prop.getProperty("S3IDMenu")));
		Actions act3 = new Actions(driver);
		act3.scrollToElement(Immigrationdetails).click().build().perform();
		System.out.println("Enter Immigration details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath(prop.getProperty("S3AssignIRAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3PassportNumberxpath"))).sendKeys(prop.getProperty("S3PassportNumber"));
		driver.findElement(By.xpath(prop.getProperty("S3PassportIssuedDatexpath"))).sendKeys(prop.getProperty("S3PassportIssuedDate"));
		driver.findElement(By.xpath(prop.getProperty("S3PassportExpiryDatexpath"))).sendKeys(prop.getProperty("S3PassportExpiryDate"));
		driver.findElement(By.xpath(prop.getProperty("S3PassportEligibleStatusxpath"))).sendKeys(prop.getProperty("S3PassportEligibleStatus"));
		driver.findElement(By.xpath(prop.getProperty("S3IDIssuedBydropdownButton"))).click();
		List<WebElement> IssuedBy = driver.findElements(By.xpath(prop.getProperty("S3IDIssuedByList")));
		for (int i = 0; i<IssuedBy.size(); i++) {
			if (IssuedBy.get(i).equals("India")) {
				IssuedBy.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3PassportEligibleReviewDatexpath"))).sendKeys(prop.getProperty("S3PassportEligibleReviewDate"));
		driver.findElement(By.xpath(prop.getProperty("S3PassportCommentsxpath"))).sendKeys(prop.getProperty("S3PassportComments"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton5.1"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3IDAttachmentAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3IdSelectFileButton"))).click();
		Robot rb4 = new Robot();
		rb4.delay(3000);
		StringSelection ss4 = new StringSelection(prop.getProperty("S3IDStringSelection"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss4, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath(prop.getProperty("S3ImmigrationCommentxpath"))).sendKeys(prop.getProperty("S3ImmigrationComment"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton5.2"))).click();
		System.out.println("Immigration Details Done");
		
//		Qualifications Details
		WebElement Qualificationsdetails = driver.findElement(By.xpath(prop.getProperty("S3QDMenu")));
		Actions act4 = new Actions(driver);
		act4.scrollToElement(Qualificationsdetails).click().build().perform();
		System.out.println("Enter Qualifications Details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath(prop.getProperty("S3WorkExpAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3WorkExperienceCompanyxpath"))).sendKeys(prop.getProperty("S3WorkExperienceCompany"));
		driver.findElement(By.xpath(prop.getProperty("S3WorkExperienceJobTitlexpath"))).sendKeys(prop.getProperty("S3WorkExperienceJobTitle"));
		driver.findElement(By.xpath(prop.getProperty("S3WorkExperienceFromxpath"))).sendKeys(prop.getProperty("S3WorkExperienceFrom"));
		driver.findElement(By.xpath(prop.getProperty("S3WorkExperienceToxpath"))).sendKeys(prop.getProperty("S3WorkExperienceTo"));
		driver.findElement(By.xpath(prop.getProperty("S3WorkExperienceCommentxpath"))).sendKeys(prop.getProperty("S3WorkExperienceComment"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton6.1"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3QDEducationAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3QDLeveldropdownButton"))).click();
		List<WebElement> Level = driver.findElements(By.xpath(prop.getProperty("S3QDLevelList")));
		for (int i = 0; i<Level.size(); i++) {
			if (Level.get(i).equals("Bachelor's Degree")) {
				Level.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3EducationInstitutexpath"))).sendKeys(prop.getProperty("S3EducationInstitute"));
		driver.findElement(By.xpath(prop.getProperty("S3EducationMajor/Specializationxpath"))).sendKeys(prop.getProperty("S3EducationMajor/Specialization"));
		driver.findElement(By.xpath(prop.getProperty("S3EducationYearxpath"))).sendKeys(prop.getProperty("S3EducationYear"));
		driver.findElement(By.xpath(prop.getProperty("S3EducationGPA/Scorexpath"))).sendKeys(prop.getProperty("S3EducationGPA/Score"));
		driver.findElement(By.xpath(prop.getProperty("S3EducationStartDatexpath"))).sendKeys(prop.getProperty("S3EducationStartDate"));
		driver.findElement(By.xpath(prop.getProperty("S3EducationEndDatexpath"))).sendKeys(prop.getProperty("S3EducationEndDate"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton6.2"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3QDSkillsAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3QDSkilldropdownButton"))).click();
		List<WebElement> Skill = driver.findElements(By.xpath(prop.getProperty("S3QDSkillList")));
		for (int i = 0; i<Skill.size(); i++) {
			if (Skill.get(i).equals("Java")) {
				Skill.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3SkillYearsofExperiencexpath"))).sendKeys(prop.getProperty("S3SkillYearsofExperience"));
		driver.findElement(By.xpath(prop.getProperty("S3SkillCommentxpath"))).sendKeys(prop.getProperty("S3SkillComment"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton6.3"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3QDLanguageAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3QDLanguagedropdownButton"))).click();
		List<WebElement> Language = driver.findElements(By.xpath(prop.getProperty("S3QdLanguageList")));
		for (int i = 0; i<Language.size(); i++) {
			if (Language.get(i).equals("English")) {
				Language.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3QDFluencydropdownButton"))).click();
		List<WebElement> Fluency = driver.findElements(By.xpath(prop.getProperty("S3QDFluencyList")));
		for (int i = 0; i<Fluency.size(); i++) {
			if (Fluency.get(i).equals("Writing")) {
				Fluency.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3QDCompetencydropdownButton"))).click();
		List<WebElement> Competency = driver.findElements(By.xpath(prop.getProperty("S3QDCompetencyList")));
		for (int i = 0; i<Competency.size(); i++) {
			if (Competency.get(i).equals("Good")) {
				Competency.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3QDLanguageCommentxpath"))).sendKeys(prop.getProperty("S3QDLanguageComment"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton6.4"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3QDLicenseAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3QDLicenseTypeDropdownButton"))).click();
		List<WebElement> LicenseType = driver.findElements(By.xpath(prop.getProperty("S3QDLicenseTypeList")));
		for (int i = 0; i<LicenseType.size(); i++) {
			if (LicenseType.get(i).equals("Microsoft Certified Systems Engineer (MCSE)")) {
				LicenseType.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3LicenseNumberxpath"))).sendKeys(prop.getProperty("S3LicenseNumber"));
		driver.findElement(By.xpath(prop.getProperty("S3LicenseIssuedDatexpath"))).sendKeys(prop.getProperty("S3LicenseIssuedDate"));
		driver.findElement(By.xpath(prop.getProperty("S3LicenseExpiryDatexpath"))).sendKeys(prop.getProperty("S3LicenseExpiryDate"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton6.5"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3QDAddAttachmentButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3QDSelectFileButton"))).click();
		Robot rb5 = new Robot();
		rb5.delay(3000);
		StringSelection ss5 = new StringSelection(prop.getProperty("SeQDStringSelection"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss5, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath(prop.getProperty("S3QualificationCommentxpath"))).sendKeys(prop.getProperty("S3QualificationComment"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton6.6"))).click();
		System.out.println("Qualification Is Done");
		
//		Membership Details
		WebElement Membershipdetails = driver.findElement(By.xpath(prop.getProperty("S3MembershipMenu")));
		Actions act5 = new Actions(driver);
		act5.scrollToElement(Membershipdetails).click().build().perform();
		System.out.println("Enter Membership Details");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath(prop.getProperty("S3AssignMmbershipAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3MMembershipdropdownButton"))).click();
		List<WebElement> Membership = driver.findElements(By.xpath(prop.getProperty("SeMMembershipList")));
		for (int i = 0; i<Membership.size(); i++) {
			if (Membership.get(i).equals("British Computer Society (BCS)")) {
				Membership.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3MSubscriptionPaidBydropdownButton"))).click();
		List<WebElement> SubscriptionPaidBy = driver.findElements(By.xpath(prop.getProperty("S3MSubscriptionPaidByList")));
		for (int i = 0; i<SubscriptionPaidBy.size(); i++) {
			if (SubscriptionPaidBy.get(i).equals("Company")) {
				SubscriptionPaidBy.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3SubscriptionAmountxpath"))).sendKeys(prop.getProperty("S3SubscriptionAmount"));
		driver.findElement(By.xpath(prop.getProperty("S3MCurrencydropdownButton"))).click();
		List<WebElement> Currency = driver.findElements(By.xpath(prop.getProperty("S3MCurrencyList")));
		for (int i = 0; i<Currency.size(); i++) {
			if (Currency.get(i).equals("Indian Rupee")) {
				Currency.get(i).click();
			}
		}
		driver.findElement(By.xpath(prop.getProperty("S3SubscriptionCommenceDatexpath"))).sendKeys(prop.getProperty("S3SubscriptionCommenceDate"));
		driver.findElement(By.xpath(prop.getProperty("S3SubscriptionRenewalDatexpath"))).sendKeys(prop.getProperty("S3SubscriptionRenewalDate"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton7.1"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3MAttachmentAddButton"))).click();
		driver.findElement(By.xpath(prop.getProperty("S3MSelectFileButton"))).click();
		Robot rb6 = new Robot();
		rb6.delay(3000);
		StringSelection ss6 = new StringSelection(prop.getProperty("S3MStringSelection"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss6, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath(prop.getProperty("S3MembershipCommentxpath"))).sendKeys(prop.getProperty("S3MembershipComment"));
		driver.findElement(By.xpath(prop.getProperty("S3SaveButton7.2"))).click();
		System.err.println("Membership Is Done");
		
//		Logout
		driver.findElement(By.xpath(prop.getProperty("Logoutdropdownxpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("Logoutxpath"))).click();
		System.out.println("Scenario 3 Is Done");
	}
	
	@AfterTest
	public void CloseBrowser() {
		TearDown();
		System.out.println("Browser Is Closing");	
	}

}

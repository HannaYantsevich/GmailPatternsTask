package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailTest {

	private WebDriver driver;

	@BeforeClass(description = ("Start browser"))

	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/hanna_yantsevich/eclipse-workspace/Gmail/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void GmailTest() throws InterruptedException {

		GmailLoginPage gmailloginpage = new GmailLoginPage(driver);
		gmailloginpage.open();
		gmailloginpage.pressSigninButton();

		gmailloginpage.fillEmailIInput("HannaTest34@gmail.com");

		GmailPasswordPage gmailpasswordpage = gmailloginpage.pressNextButton();
		gmailpasswordpage.fillGmailPasswordInput("PasswordPassword");
		Thread.sleep(1000);
		GmailMainPage gmailmainpage = gmailpasswordpage.pressNextButton();

		gmailmainpage.pressComposeButton();
		gmailmainpage.recipentInput("h.yantsevich@gmail.com");
		gmailmainpage.subjectInput("Test");
		gmailmainpage.bodyInput("Hello, World!");
		gmailmainpage.saveAndCloseButton();
		Thread.sleep(1000);
		gmailmainpage.draftButton();
		Thread.sleep(1000);
		gmailmainpage.clickOnDraftEmail();
		gmailmainpage.sendButton();
		Thread.sleep(2000);
		gmailmainpage.sentButton();
		Thread.sleep(2000);
		gmailmainpage.draftsButton();
		gmailmainpage.noDraftsButton();
		gmailmainpage.imageButton();
		gmailmainpage.signOutButton();

	}

	@AfterClass(description = "Close browser")

	public void kill() {
		driver.quit();
	}

}
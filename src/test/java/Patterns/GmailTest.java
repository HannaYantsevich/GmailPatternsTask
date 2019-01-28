package Patterns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
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

		driver.get("https://www.google.com/gmail/about/#");

		GmailLoginPage gmailloginpage = new GmailLoginPage(driver);
		gmailloginpage.open();
		gmailloginpage.pressSigninButton();

		gmailloginpage.fillEmailIInput("HannaTest34@gmail.com");

		GmailPasswordPage gmailpasswordpage = gmailloginpage.pressNextButton();
		gmailpasswordpage.fillGmailPasswordInput("PasswordPassword");

		GmailMainPage gmailmainpage = gmailpasswordpage.pressNextButton();
		gmailmainpage.pressComposeButton();
		gmailmainpage.recipentInput("h.yantsevich@gmail.com");
		gmailmainpage.subjectInput("Test");
		gmailmainpage.bodyInput("Hello, World!");
		gmailmainpage.saveAndCloseButton();
		Thread.sleep(1000);
		gmailmainpage.draftButton();
		gmailmainpage.draftButton1();
		gmailmainpage.subjectResult();
		gmailmainpage.bodyResult();
		gmailmainpage.sendButton();
		Thread.sleep(2000);
		gmailmainpage.sentButton();
		Thread.sleep(2000);
		gmailmainpage.draftsButton();
		Thread.sleep(1000);
		gmailmainpage.noDraftsButton();
		gmailmainpage.imageButton();
		Thread.sleep(1000);
		gmailmainpage.signOutButton();
		
		
	}
	
	@AfterClass(description = "Close browser")

    public void kill(){
        driver.quit();
    }

}

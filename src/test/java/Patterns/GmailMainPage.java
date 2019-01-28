package Patterns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailMainPage extends AbstractedPage {

	private static final By COMPOSE_BUTTON_LOCATOR = By.xpath("//div[contains(text(),'Compose')]");
	private static final By RESIPENT_INPUT_LOCATOR = By.xpath("//textarea[@name='to']");
	private static final By SUBJECT_INPUT_LOCATOR = By.xpath("//input[@name='subjectbox']");
	private static final By BODY_INPUT_LOCATOR = By.xpath("//div[@class='Am Al editable LW-avf']");
	private static final By SAVE_AND_CLOSE_BUTTON_LOCATOR = By.xpath("//td[@class='Hm']/img[@class='Ha']");
	private static final By DRAFT_BUTTON_LOCATOR = By.xpath("//a[contains(text(), 'Drafts')]");
	private static final By DRAFT_BUTTON1_LOCATOR = (By.id(":9a"));
	private static final By BODY_RESULT_LOCATOR = By.xpath("//div[text()='Hello, World!']");
	private static final By SUBJECT_RESULT_LOCATOR = By.xpath("//div[text()='Test']");
	private static final By SEND_BUTTON_LOCATOR = By.xpath("//div[text()='Send']");
	private static final By SENT_MAIL_BUTTON_LOCATOR = By.xpath("//a[@href='https://mail.google.com/mail/#sent']");
	private static final By DRAFTS_BUTTON_LOCATOR = By.xpath("//a[contains(text(), 'Drafts')]");
	private static final By NO_DRAFTS_LOCATOR = By.xpath("//tr[@class='TD']/td[@class='TC']");
	private static final By IMAGE_BUTTON_LOCATOR = By.xpath(
			"//a[@href='https://accounts.google.com/SignOutOptions?hl=en&continue=https://mail.google.com/mail&service=mail']");
	private static final By SIGN_OUT_BUTTON_LOCATOR = By.xpath("//a[@class='gb_Aa gb_xg gb_Eg gb_ef gb_Tb']");

	public GmailMainPage(WebDriver driver) {
		super(driver);
		waitForElementVisible(COMPOSE_BUTTON_LOCATOR);
	}

	public void pressComposeButton() {
		waitForElementVisible(COMPOSE_BUTTON_LOCATOR);
		driver.findElement(COMPOSE_BUTTON_LOCATOR).click();
	}
	
	public void recipentInput(String recipientquery) {
		waitForElementVisible(RESIPENT_INPUT_LOCATOR);
		driver.findElement(RESIPENT_INPUT_LOCATOR).sendKeys(recipientquery);
	}
	
	public void subjectInput(String subjectquery) {
		waitForElementVisible(SUBJECT_INPUT_LOCATOR);
		driver.findElement(SUBJECT_INPUT_LOCATOR).sendKeys(subjectquery);;
	}
	
	public void bodyInput(String bodyquery) {
		waitForElementVisible(BODY_INPUT_LOCATOR);
		driver.findElement(BODY_INPUT_LOCATOR).sendKeys(bodyquery);;
	}
	
	public void saveAndCloseButton() {
		waitForElementVisible(SAVE_AND_CLOSE_BUTTON_LOCATOR);
		driver.findElement(SAVE_AND_CLOSE_BUTTON_LOCATOR).click();
	}
	
	public void draftButton (){
		waitForElementPresent(DRAFT_BUTTON_LOCATOR);
        driver.findElement (DRAFT_BUTTON_LOCATOR).click();
    }
	
	public void draftButton1 (){
		waitForElementVisible(DRAFT_BUTTON1_LOCATOR);
        driver.findElement (DRAFT_BUTTON1_LOCATOR).click();
    }
	
	public void bodyResult (){
		waitForElementVisible(BODY_RESULT_LOCATOR);
        driver.findElement (BODY_RESULT_LOCATOR);
    }
	
	public void subjectResult (){
		waitForElementVisible(SUBJECT_RESULT_LOCATOR);
        driver.findElement (SUBJECT_RESULT_LOCATOR);
    }
	
	public void sendButton (){
        waitForElementVisible(SEND_BUTTON_LOCATOR);
        driver.findElement (SEND_BUTTON_LOCATOR).click();
    }
	
	public void sentButton (){
        waitForElementVisible(SENT_MAIL_BUTTON_LOCATOR);
        driver.findElement (SENT_MAIL_BUTTON_LOCATOR).click();
    }
	
	public void draftsButton (){
		waitForElementVisible(DRAFTS_BUTTON_LOCATOR);
        driver.findElement (DRAFTS_BUTTON_LOCATOR).click();
    }
	
	public void noDraftsButton() {
		waitForElementVisible(NO_DRAFTS_LOCATOR);
        driver.findElement (NO_DRAFTS_LOCATOR).click();
		
	}
	
	public void imageButton (){
        waitForElementVisible(IMAGE_BUTTON_LOCATOR);
        driver.findElement (IMAGE_BUTTON_LOCATOR).click();
    }
	
	 public void signOutButton (){
	        waitForElementVisible(SIGN_OUT_BUTTON_LOCATOR);
	        driver.findElement (SIGN_OUT_BUTTON_LOCATOR).click();
	    }

	
}

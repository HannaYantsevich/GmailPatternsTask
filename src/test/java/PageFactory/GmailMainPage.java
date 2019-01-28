package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailMainPage extends AbstractedPage {

	@FindBy(xpath = "//div[contains(text(),'Compose')]")
	private WebElement composeButton;

	@FindBy(xpath = "//textarea[@name='to']")
	private WebElement recipientInput;

	@FindBy(xpath = "//input[@name='subjectbox']")
	private WebElement subjectInput;

	@FindBy(xpath = "//div[@class='Am Al editable LW-avf']")
	private WebElement bodyInput;

	@FindBy(xpath = "//td[@class='Hm']/img[@class='Ha']")
	private WebElement saveAndClose;

	@FindBy(xpath = "//a[contains(text(), 'Drafts')]")
	private WebElement draftButton;

	@FindBy(id = ":9a")
	private WebElement draftButton1;

	@FindBy(xpath = "//div[text()='Send']")
	private WebElement sendButton;

	@FindBy(xpath = "//a[@href='https://mail.google.com/mail/#sent']")
	private WebElement sentButton;

	@FindBy(xpath = "//a[contains(text(), 'Drafts')]")
	private WebElement draftsButton;

	@FindBy(xpath = "//tr[@class='TD']/td[@class='TC']")
	private WebElement noDrafts;

	@FindBy(xpath = "//a[@href='https://accounts.google.com/SignOutOptions?hl=en&continue=https://mail.google.com/mail&service=mail']")
	private WebElement imageButton;

	@FindBy(xpath = "//a[@class='gb_Aa gb_xg gb_Eg gb_ef gb_Tb']")
	private WebElement signOutButton;

	public GmailMainPage(WebDriver driver) {
		super(driver);
	}

	public void pressComposeButton() {
		composeButton.click();
	}

	public void recipentInput(String recipientquery) {
		recipientInput.sendKeys(recipientquery);
	}

	public void subjectInput(String subjectquery) {
		subjectInput.sendKeys(subjectquery);
		;
	}

	public void bodyInput(String bodyquery) {
		bodyInput.sendKeys(bodyquery);
	}

	public void saveAndCloseButton() {
		saveAndClose.click();
	}

	public void draftButton() {
		draftButton.click();
	}

	public void draftButton1() {
		draftButton1.click();
	}

	public void sendButton() {
		sendButton.click();
	}

	public void sentButton() {
		sentButton.click();
	}

	public void draftsButton() {
		draftsButton.click();
	}

	public void noDraftsButton() {
		noDrafts.click();

	}

	public void imageButton() {
		imageButton.click();
	}

	public void signOutButton() {
		signOutButton.click();
	}

}

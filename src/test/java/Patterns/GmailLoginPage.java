package Patterns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailLoginPage extends AbstractedPage {

	public GmailLoginPage(WebDriver driver) {
		super(driver);

	}

	private static final String URL = "https://www.google.com/gmail/about/#";
	private static final By SIGNIN_BUTTON_LOCATOR = By.xpath(
			"//div[@class='gmail-nav__nav-links-wrap']/a[@class ='gmail-nav__nav-link gmail-nav__nav-link__sign-in']");
	private static final By EMAIL_INPUT_LOCATOR = By.cssSelector("input#identifierId.whsOnd.zHQkBf");
	private static final By NEXT_BUTTON_LOCATOR = By.id("identifierNext");

	public GmailLoginPage open() {
		driver.get(URL);
		return this;
	}

	public void pressSigninButton() {
		waitForElementVisible(SIGNIN_BUTTON_LOCATOR);
		driver.findElement(SIGNIN_BUTTON_LOCATOR).click();
	}

	public void fillEmailIInput(String query) {
		waitForElementVisible(EMAIL_INPUT_LOCATOR);
		driver.findElement(EMAIL_INPUT_LOCATOR).sendKeys(query);
	}

	public GmailPasswordPage pressNextButton() {
		waitForElementVisible(NEXT_BUTTON_LOCATOR);
		driver.findElement(NEXT_BUTTON_LOCATOR).click();
		return new GmailPasswordPage(driver);

	}

}

package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage extends AbstractedPage {
	private static final String URL = "https://www.google.com/gmail/about/#";

	public GmailLoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//div[@class='gmail-nav__nav-links-wrap']/a[@class ='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")
	private WebElement signInButton;

	@FindBy(css = "input#identifierId.whsOnd.zHQkBf")
	private WebElement emailInput;

	@FindBy(id = "identifierNext")
	private WebElement nextButton;

	public GmailLoginPage open() {
		driver.get(URL);
		return this;
	}

	public void pressSigninButton() {
		signInButton.click();
	}

	public void fillEmailIInput(String query) {
		emailInput.sendKeys(query);
	}

	public GmailPasswordPage pressNextButton() {
		nextButton.click();
		return new GmailPasswordPage(driver);

	}

}

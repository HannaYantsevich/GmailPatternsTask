package Patterns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailPasswordPage extends AbstractedPage {

	public GmailPasswordPage(WebDriver driver) {
		super(driver);
	}

	private static final By PASSWORD_INPUT_LOCATOR = By.xpath("//div[@class='Xb9hP']/input[@type='password']");
	private static final By NEXT_BUTTON_LOCATOR = By.id("passwordNext");

	public void fillGmailPasswordInput(String query) {
		waitForElementVisible(PASSWORD_INPUT_LOCATOR);
		driver.findElement(PASSWORD_INPUT_LOCATOR).sendKeys(query);

	}

	public GmailMainPage pressNextButton() {
		waitForElementVisible(NEXT_BUTTON_LOCATOR);
		driver.findElement(NEXT_BUTTON_LOCATOR).click();
		return new GmailMainPage(driver);
	}
}
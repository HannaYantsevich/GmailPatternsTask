package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPasswordPage extends AbstractedPage {

	public GmailPasswordPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='Xb9hP']/input[@type='password']")
	private WebElement passwordInput;

	@FindBy(xpath = "//*[@id='passwordNext']")
	private WebElement nextButton;

	public void fillGmailPasswordInput(String query) {
		passwordInput.sendKeys(query);

	}

	public GmailMainPage pressNextButton() {
		nextButton.click();
		return new GmailMainPage(driver);
	}
}
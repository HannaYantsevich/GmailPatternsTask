package PageFactory;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

public class AbstractedPage {

	private Logger log = Logger.getLogger(AbstractedPage.class);

	protected WebDriver driver;
	private static final int WAIT_FOR_ELEMENT_SECONDS = 10;

	public AbstractedPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public boolean isElementExists(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			log.info("Element with locator " + by + " does not exist");
			return false;
		}
	}

	protected void waitForElementVisible(By locator) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}

	protected void waitForElementPresent(By locator) {
		new WebDriverWait(driver, WAIT_FOR_ELEMENT_SECONDS)
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

	}

	public void moveToElement(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public void waitForElementAndClick(WebDriver driver, By by) {
        new WebDriverWait(driver, 15).ignoring(StaleElementReferenceException.class, WebDriverException.class)
                .until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

}

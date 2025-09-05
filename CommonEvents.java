package coreUtilities.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonEvents {

    private WebDriver driver;

    public CommonEvents(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Click on an element
     * @param locator
     */
    public void click(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            element.click();
        } catch (Exception e) {
            throw new RuntimeException("Unable to click on element: " + locator, e);
        }
    }

    /**
     * Verify element is displayed
     * @param locator
     * @return true if element is displayed, else false
     */
    public boolean isDisplayed(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Get page title
     * @return current page title
     */
    public String getTitle() {
        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get page title", e);
        }
    }

    /**
     * Get text of an element
     * @param locator
     * @return text of the element
     */
    public String getText(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.getText();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get text from element: " + locator, e);
        }
    }

    /**
     * Send keys to an element
     * @param locator
     * @param text
     */
    public void sendKeys(By locator, String text) {
        try {
            WebElement element = driver.findElement(locator);
            element.clear();
            element.sendKeys(text);
        } catch (Exception e) {
            throw new RuntimeException("Unable to send keys to element: " + locator, e);
        }
    }

    /**
     * Check if element is enabled
     * @param locator
     * @return true if enabled, else false
     */
    public boolean isEnabled(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

	public void navigateTo(String url) {
		driver.get(url);
	}
}

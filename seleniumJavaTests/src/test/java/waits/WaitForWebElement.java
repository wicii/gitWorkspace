package waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWebElement {

   private WebDriver driver;

    public WaitForWebElement(WebDriver driver){
        this.driver = driver;
    }

    private WebDriverWait getWebDriverWait() {
        return new WebDriverWait(driver,10);
    }

    public void waitForElementToBeVisible(WebElement webElement){
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitForElementToBeClickable(WebElement webElement){
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitForElementToBeInvisible(WebElement webElement){
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.invisibilityOf(webElement));
    }
}

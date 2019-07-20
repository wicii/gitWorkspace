package pages.MainPageObject;

import logger.LogManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import waits.WaitForWebElement;

public class MainPageObjectActions {

    private WebDriver driver;
    private MainPageObjectElements mainPageObjectElements;
    private WaitForWebElement waitForWebElement;
    private Actions action;
    private JavascriptExecutor javascriptExecutor;
    private String boarderHilight = "'3px solid red'";

    public MainPageObjectActions(WebDriver driver){
        this.driver=driver;
        mainPageObjectElements = new MainPageObjectElements(driver);
        waitForWebElement = new WaitForWebElement(driver);
        action = new Actions(driver);
        javascriptExecutor = (JavascriptExecutor) driver;
    }

    public void hoverOverAccountsButtonOnMainPage()  {
        waitForWebElement.waitForElementToBeClickable(mainPageObjectElements.getAccountButton());
        action.moveToElement(mainPageObjectElements.getAccountButton()).build().perform();
    }

    public void clickOnPersonalAccountsButtonOnMainPage(){
        javascriptExecutor.executeScript("arguments[0].style.border=" + boarderHilight, mainPageObjectElements.getPersonalAccountsButton());
        javascriptExecutor.executeScript("arguments[0].style.border=" + boarderHilight, mainPageObjectElements.getAccountButton());
        LogManager.info("Clicked on " + mainPageObjectElements.getPersonalAccountsButton().getText());
        hoverOverAccountsButtonOnMainPage();
        waitForWebElement.waitForElementToBeClickable(mainPageObjectElements.getPersonalAccountsButton());
        javascriptExecutor.executeScript("arguments[0].click();",mainPageObjectElements.getPersonalAccountsButton());
        Assert.assertEquals("Wybierz konto osobiste",mainPageObjectElements.getPrivateAccountsPageTitle().getText());
    }

    public void hoverOverEachSubMenuDropdownButton(){
        waitForWebElement.waitForElementToBeClickable(mainPageObjectElements.getAccountButton());
        for (WebElement element : mainPageObjectElements.getDropdownSubMenuElements()) {
            action.moveToElement(element).build().perform();
            LogManager.info("Hovered over : "+ element.getText());
        }
    }
}

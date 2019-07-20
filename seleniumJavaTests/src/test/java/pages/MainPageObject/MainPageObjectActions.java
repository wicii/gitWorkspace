package pages.MainPageObject;

import logger.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import waits.WaitForWebElement;


public class MainPageObjectActions {

    private WebDriver driver;
    private MainPageObjectElements mainPageObjectElements;
    private WaitForWebElement waitForWebElement;
    private Actions action;

    public MainPageObjectActions(WebDriver driver){
        this.driver=driver;
        mainPageObjectElements = new MainPageObjectElements(driver);
        waitForWebElement = new WaitForWebElement(driver);
        action = new Actions(driver);
    }

    public void clickAccountsButtonOnMainPage(){
        LogManager.info("Clicking on Accounts button");
        waitForWebElement.waitForElementToBeVisible(mainPageObjectElements.getAccountButton());
        mainPageObjectElements.getAccountButton().click();
    }

    public void hoverOverAccountsButtonOnMainPage(){
        LogManager.info("Displaying dropdown menu");

        waitForWebElement.waitForElementToBeVisible(mainPageObjectElements.getAccountButton());
        action.moveToElement(mainPageObjectElements.getAccountButton()).build().perform();
    }

    public void hoverOverEachSubMenuDropdownButton(){
        LogManager.info("Hovered over : ");
        waitForWebElement.waitForElementToBeVisible(mainPageObjectElements.getAccountButton());
        for (WebElement element : mainPageObjectElements.getDropdownSubMenuElements()) {
            action.moveToElement(element).build().perform();
            LogManager.info("Hovered over : "+ element);
        }
    }


    public MainPageObjectActions locateCreditsButton(){
        waitForWebElement.waitForElementToBeVisible(mainPageObjectElements.getCreditsButton());
        return this;
    }
}

package pages.MainPageObject;

import logger.LogManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.ObjectPageFoundation;
import waits.WaitForWebElement;

public class MainPageObjectActions extends ObjectPageFoundation {

    private MainPageObjectElements mainPageObjectElements;

    public MainPageObjectActions(WebDriver driver){
        this.driver=driver;
        mainPageObjectElements = new MainPageObjectElements(driver);
        waitForWebElement = new WaitForWebElement(driver);
        action = new Actions(driver);
        javascriptExecutor = (JavascriptExecutor) driver;
    }

    public void hoverOverAccountsButtonOnMainPage()  {
        action.moveToElement(mainPageObjectElements.getAccountButton()).build().perform();
    }

    public void clickOnPersonalAccountsButtonOnMainPage(){
        LogManager.info("Clicked on " + mainPageObjectElements.getPersonalAccountsButton().getText());
        hoverOverAccountsButtonOnMainPage();
        javascriptExecutor.executeScript("arguments[0].click();",mainPageObjectElements.getPersonalAccountsButton());
        Assert.assertEquals("Wybierz konto osobiste",mainPageObjectElements.getPrivateAccountsPageTitle().getText());
    }

    public void hoverOverEachSubMenuDropdownButton(){
        for (WebElement element : mainPageObjectElements.getDropdownSubMenuElements()) {
            action.moveToElement(element).build().perform();
            LogManager.info("Hovered over : "+ element.getText());
        }
    }

    public void openSearchForm(){
        mainPageObjectElements.getSearchButton().click();
        Assert.assertTrue(mainPageObjectElements.getSearchForm().isDisplayed());
    }

    public void performSearchOnMainPage(String text){
        LogManager.info("User performs search on main page with " + text +" word.");
        mainPageObjectElements.getSearchForm().sendKeys(text);
        Assert.assertTrue(mainPageObjectElements.getSearchForm().isDisplayed());

        for (WebElement element: mainPageObjectElements.getSearchResults()) {
            LogManager.info("Input text: " + text + ", search result: " + element.getText());
            if(!element.getText().toLowerCase().contains(text.toLowerCase())){
                Assert.assertFalse(true);
            }
        }
    }

    public void closeSearchForm(){
        LogManager.info("User closes search form.");
        javascriptExecutor.executeScript("arguments[0].click();",mainPageObjectElements.getCloseSearchFormButton());
        waitForWebElement.waitForElementToBeInvisible(mainPageObjectElements.getSearchForm());
        Assert.assertFalse(mainPageObjectElements.getSearchForm().isDisplayed());
    }

    public void gotToLoginPagePrivateAccout(){
        LogManager.info("User goes to login page from main page");
        waitForWebElement.waitForElementToBeClickable(mainPageObjectElements.getLogInButton());
        mainPageObjectElements.getLogInButton().click();
        waitForWebElement.waitForElementToBeVisible(mainPageObjectElements.getLoginForm());
        Assert.assertTrue(mainPageObjectElements.getLoginForm().isDisplayed());
    }
}

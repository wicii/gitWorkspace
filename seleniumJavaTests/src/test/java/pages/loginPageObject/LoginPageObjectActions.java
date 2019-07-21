package pages.loginPageObject;

import logger.LogManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.ObjectPageFoundation;
import waits.WaitForWebElement;

public class LoginPageObjectActions extends ObjectPageFoundation {

    private LoginPageObjectElements loginPageObjectElements;

    public LoginPageObjectActions(WebDriver driver){
        this.driver = driver;
        loginPageObjectElements = new LoginPageObjectElements(driver);
        waitForWebElement = new WaitForWebElement(driver);
        action = new Actions(driver);
        javascriptExecutor = (JavascriptExecutor) driver;
    }

    public void putUserNameIntoLoginForm(String username){
        LogManager.info("User puts his id into login form");
        loginPageObjectElements.getUserName().sendKeys(username);
    }

    public void putUserPasswordIntoLoginForm(String password){
        LogManager.info("User puts his password into login form");
        loginPageObjectElements.getUserPassword().sendKeys(password);
    }

    public void userClicksOnEnabledSubmitButton(){
        LogManager.info("User clicked on submit button ");
        Assert.assertTrue(loginPageObjectElements.getSubmitButtonEnabled().isDisplayed());
        loginPageObjectElements.getSubmitButtonEnabled().click();
    }

    public void assertOnTooShortInputs(){
        Assert.assertTrue(loginPageObjectElements.getSubmitButtonDisabled().isDisplayed());
    }

    public void assertOnAcceptedInput(){
        Assert.assertTrue(loginPageObjectElements.getSubmitButtonEnabled().isDisplayed());
    }

    public void checkProperMessageAfterFailedLoginAttempt(){
        waitForWebElement.waitForElementToBeVisible(loginPageObjectElements.getErrorMessageAfterFailedLoginAttepmt());
        Assert.assertEquals("Nieprawidłowy identyfikator lub hasło.",loginPageObjectElements.getErrorMessageAfterFailedLoginAttepmt().getText());
    }
}

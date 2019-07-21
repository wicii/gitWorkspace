package pages.loginPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class LoginPageObjectElements {

    LoginPageObjectElements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "userID")
    private WebElement userName;

    @FindBy(id = "pass")
    private WebElement userPassword;

    @FindBy(xpath = "//button[@id=\"submitButton\"][@class=\"btn\"]")
    private WebElement loginSubmitButtonEnabled;

    @FindBy(xpath = "//button[@id=\"submitButton\"][@class=\"btn disabled\"]")
    private WebElement loginSubmitButtonDisabled;

    @FindBy(css = "#errorMessage")
    private WebElement messageAfterFailedLoginAttempt;

    WebElement getUserName(){
        return userName;
    }

    WebElement getUserPassword(){
        return userPassword;
    }

    WebElement getSubmitButtonEnabled() {
        return loginSubmitButtonEnabled;
    }

    WebElement getSubmitButtonDisabled(){
        return loginSubmitButtonDisabled;
    }

    WebElement getErrorMessageAfterFailedLoginAttepmt(){
        return messageAfterFailedLoginAttempt;
    }
}

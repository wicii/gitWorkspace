package pages.loginPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectElements {

    private WebDriver driver;

    public LoginPageObjectElements(WebDriver driver){
        this.driver=driver;
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

    public WebElement getUserName(){
        return userName;
    }

    public WebElement getUserPassword(){
        return userPassword;
    }

    public WebElement getSubmitButtonEnabled() {
        return loginSubmitButtonEnabled;
    }

    public WebElement getSubmitButtonDisabled(){
        return loginSubmitButtonDisabled;
    }

    public WebElement getErrorMessageAfterFailedLoginAttepmt(){
        return messageAfterFailedLoginAttempt;
    }
}

package tests.loginPageTests;

import navigation.PageNavigation;
import org.testng.annotations.Test;
import pages.loginPageObject.LoginPageObjectActions;
import tests.TestFoundations;
import urls.AppURLs;

public class UserLoginTests extends TestFoundations {

    @Test
    public void asUserISeeLoginButtonDisabledWithTooShortCreds(){
        LoginPageObjectActions loginPageObjectActions = new LoginPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        pageNavigation.navigateToPage(AppURLs.getPrivateAccountsLoginPage());
        loginPageObjectActions.putUserNameIntoLoginForm("abc");
        loginPageObjectActions.putUserPasswordIntoLoginForm("123");
        loginPageObjectActions.assertOnTooShortInputs();
    }

    @Test
    public void asUserISeeSubmitButtonEnabledOnAcceptedInput(){
        LoginPageObjectActions loginPageObjectActions = new LoginPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        pageNavigation.navigateToPage(AppURLs.getPrivateAccountsLoginPage());
        loginPageObjectActions.putUserNameIntoLoginForm("avcdefghijwada");
        loginPageObjectActions.putUserPasswordIntoLoginForm("wdadawawfawfw");
        loginPageObjectActions.assertOnAcceptedInput();
    }

    @Test
    public void asUserIWantToBeInformedAfterFailedLoginAttempt(){
        LoginPageObjectActions loginPageObjectActions = new LoginPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        pageNavigation.navigateToPage(AppURLs.getPrivateAccountsLoginPage());
        loginPageObjectActions.putUserNameIntoLoginForm("FakeUserName");
        loginPageObjectActions.putUserPasswordIntoLoginForm("FakeUserPassword");
        loginPageObjectActions.userClicksOnEnabledSubmitButton();
        loginPageObjectActions.checkProperMessageAfterFailedLoginAttempt();
    }
}

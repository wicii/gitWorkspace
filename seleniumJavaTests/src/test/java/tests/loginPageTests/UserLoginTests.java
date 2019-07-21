package tests.loginPageTests;

import navigation.PageNavigation;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.loginPageObject.LoginPageObjectActions;
import tests.TestFoundations;
import urls.AppURLs;

public class UserLoginTests extends TestFoundations {

    @Parameters({"tooShortUsername", "tooShortUserPassword"})
    @Test
    public void asUserISeeLoginButtonDisabledWithTooShortCreds(@Optional("abc") String tooShortUsername, @Optional("zaq") String tooShortUserPassword){
        LoginPageObjectActions loginPageObjectActions = new LoginPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        pageNavigation.navigateToPage(AppURLs.getPrivateAccountsLoginPage());
        loginPageObjectActions.putUserNameIntoLoginForm(tooShortUsername);
        loginPageObjectActions.putUserPasswordIntoLoginForm(tooShortUserPassword);
        loginPageObjectActions.assertOnTooShortInputs();
    }

    @Parameters({"invalidUsername", "invalidUserPassword"})
    @Test
    public void asUserISeeSubmitButtonEnabledOnAcceptedInput(@Optional("fakeUsername") String invalidUsername, @Optional("FakeUserPassword") String invalidUserPassword){
        LoginPageObjectActions loginPageObjectActions = new LoginPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        pageNavigation.navigateToPage(AppURLs.getPrivateAccountsLoginPage());
        loginPageObjectActions.putUserNameIntoLoginForm(invalidUsername);
        loginPageObjectActions.putUserPasswordIntoLoginForm(invalidUserPassword);
        loginPageObjectActions.assertOnAcceptedInput();
    }

    @Parameters({"invalidUsername", "invalidUserPassword"})
    @Test
    public void asUserIWantToBeInformedAfterFailedLoginAttempt(@Optional("fakeUserName") String invalidUsername, @Optional("FakeUserName") String invalidUserPassword){
        LoginPageObjectActions loginPageObjectActions = new LoginPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        pageNavigation.navigateToPage(AppURLs.getPrivateAccountsLoginPage());
        loginPageObjectActions.putUserNameIntoLoginForm(invalidUsername);
        loginPageObjectActions.putUserPasswordIntoLoginForm(invalidUserPassword);
        loginPageObjectActions.userClicksOnEnabledSubmitButton();
        loginPageObjectActions.checkProperMessageAfterFailedLoginAttempt();
    }
}

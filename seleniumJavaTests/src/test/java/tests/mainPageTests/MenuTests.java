package tests.mainPageTests;

import logger.LogManager;
import navigation.PageNavigation;
import org.testng.annotations.Test;
import pages.MainPageObject.MainPageObjectActions;
import tests.TestFoundations;
import urls.AppURLs;

public class MenuTests extends TestFoundations {

    @Test
    public void asUserIWantToBeRedirectedToLoginPage(){
        MainPageObjectActions mainPageObjectActions = new MainPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        LogManager.startTestCase("User is redirected to Login page");
        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.gotToLoginPagePrivateAccout();
        LogManager.endTestCase();
    }
}

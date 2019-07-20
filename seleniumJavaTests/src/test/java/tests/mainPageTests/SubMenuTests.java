package tests.mainPageTests;

import logger.LogManager;
import navigation.PageNavigation;
import org.testng.annotations.Test;
import pages.MainPageObject.MainPageObjectActions;
import tests.TestFoundations;
import urls.AppURLs;

public class SubMenuTests extends TestFoundations {

    @Test
    public void asUserIWantToBeRedirectedAfterClickingAccountsButton(){
        MainPageObjectActions mainPageObjectActions = new MainPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        LogManager.startTestCase("User is redirected after clicking on Accuonts button");
        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.clickAccountsButtonOnMainPage();
    }

    @Test
    public void displayDropDownOptionsOnAccountsButton(){
        MainPageObjectActions mainPageObjectActions = new MainPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        LogManager.startTestCase("User is redirected after clicking on Accuonts button");
        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.hoverOverAccountsButtonOnMainPage();
    }
}

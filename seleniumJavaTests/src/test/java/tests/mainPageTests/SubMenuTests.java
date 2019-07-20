package tests.mainPageTests;

import logger.LogManager;
import navigation.PageNavigation;
import org.apache.log4j.Logger;
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
    public void displayDropDownOptionsOnEachSubmenuDropDownButton(){
        MainPageObjectActions mainPageObjectActions = new MainPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        LogManager.startTestCase("User is redirected after clicking on Accuonts button");
        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.hoverOverEachSubMenuDropdownButton();
    }

    @Test
    public void displayDropDownOnAccountsButton(){
        MainPageObjectActions mainPageObjectActions = new MainPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        LogManager.startTestCase("User is redirected after clicking on Accuonts button");
        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.hoverOverAccountsButtonOnMainPage();
    }
}

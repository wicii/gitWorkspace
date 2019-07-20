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

        LogManager.startTestCase("User is redirected after clicking on Personal Accuonts button");
        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.clickOnPersonalAccountsButtonOnMainPage();
        LogManager.endTestCase();
    }

    @Test
    public void displayDropDownOptionsOnEachSubmenuDropDownButton(){
        MainPageObjectActions mainPageObjectActions = new MainPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        LogManager.startTestCase("User sees all options in dropdown from submenus");
        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.hoverOverEachSubMenuDropdownButton();
        LogManager.endTestCase();
    }

    @Test
    public void displayDropDownOnAccountsButton(){
        MainPageObjectActions mainPageObjectActions = new MainPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        LogManager.startTestCase("User is redirected after clicking on Accuonts button");
        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.hoverOverAccountsButtonOnMainPage();
        LogManager.endTestCase();
    }

    @Test
    public void asUserIWantToSeeSearchResults(){
        MainPageObjectActions mainPageObjectActions = new MainPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        LogManager.startTestCase("User sees search form");
        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.asUserIWantToOpenPageSearch();
        mainPageObjectActions.performSearchOnMainPage("Kredyt");
    }

    @Test
    public void asUserIWantToCloseSearchForm(){
        MainPageObjectActions mainPageObjectActions = new MainPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);
        LogManager.startTestCase("User closes search form");
        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.asUserIWantToOpenPageSearch();

        mainPageObjectActions.closeSearchForm();
    }
}

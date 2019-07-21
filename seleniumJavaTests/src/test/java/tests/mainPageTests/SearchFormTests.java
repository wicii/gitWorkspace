package tests.mainPageTests;

import logger.LogManager;
import navigation.PageNavigation;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.MainPageObject.MainPageObjectActions;
import tests.TestFoundations;
import urls.AppURLs;

public class SearchFormTests extends TestFoundations {

    @Parameters({"keyWord"})
    @Test
    public void asUserIWantToSeeSearchResults(@Optional("Kredyty") String keyWord){
        MainPageObjectActions mainPageObjectActions = new MainPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        LogManager.startTestCase("User sees search form");
        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.openSearchForm();
        mainPageObjectActions.performSearchOnMainPage(keyWord);
    }

    @Test
    public void asUserIWantToCloseSearchForm(){
        MainPageObjectActions mainPageObjectActions = new MainPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        LogManager.startTestCase("User closes search form");
        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.openSearchForm();
        mainPageObjectActions.closeSearchForm();
    }
}

package tests;

import navigation.PageNavigation;
import org.testng.annotations.Test;
import pages.MainPageObject.MainPageObjectActions;
import urls.AppURLs;

public class MainPageTests extends TestFoundations {

    @Test
    public void mainPageTest(){
        MainPageObjectActions mainPageObjectActions = new MainPageObjectActions(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);

        pageNavigation.navigateToPage(AppURLs.getMainPageURL());
        mainPageObjectActions.locateAccountButton("Konta");
    }
}

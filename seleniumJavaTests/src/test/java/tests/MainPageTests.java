package tests;

import navigation.PageNavigation;
import org.testng.annotations.Test;
import pages.MainPageObject;
import urls.AppURLs;

public class MainPageTests extends TestFoundations {

    @Test
    public void mainPageTest(){
        MainPageObject mainPage = new MainPageObject(driver);
        PageNavigation navigateTo = new PageNavigation(driver);
        navigateTo.navigateToPage(AppURLs.getMainPageURL());
    }
}

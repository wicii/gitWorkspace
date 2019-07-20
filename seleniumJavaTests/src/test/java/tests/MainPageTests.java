package tests;

import org.testng.annotations.Test;
import pages.MainPageObject;
import urls.AppURLs;

public class MainPageTests extends TestFoundations {

    @Test
    public void mainPageTest() throws InterruptedException {
        MainPageObject mainPage = new MainPageObject(driver);
        mainPage.navigateToPage(AppURLs.getMainPageURL());
    }
}

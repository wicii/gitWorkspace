package tests;

import navigation.PageNavigation;
import org.testng.annotations.Test;
import pages.PrivateBankingPageObject;
import urls.AppURLs;

public class PrivateBankingPageTests extends TestFoundations {

    @Test
    public void privateBankingTests(){
        PrivateBankingPageObject privateBankingPageObject = new PrivateBankingPageObject(driver);
        PageNavigation pageNavigation = new PageNavigation(driver);
        pageNavigation.navigateToPage(AppURLs.getPrivetBankingPage());
    }
}

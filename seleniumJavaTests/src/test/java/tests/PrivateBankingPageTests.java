package tests;

import navigation.PageNavigation;
import org.testng.annotations.Test;
import urls.AppURLs;

public class PrivateBankingPageTests extends TestFoundations {

    @Test
    public void privateBankingTests(){
        PageNavigation pageNavigation = new PageNavigation(driver);
        pageNavigation.navigateToPage(AppURLs.getPrivetBankingPage());
    }
}

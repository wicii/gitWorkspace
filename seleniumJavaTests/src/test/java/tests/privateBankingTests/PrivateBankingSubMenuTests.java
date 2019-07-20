package tests.privateBankingTests;

import navigation.PageNavigation;
import org.testng.annotations.Test;
import tests.TestFoundations;
import urls.AppURLs;

public class PrivateBankingSubMenuTests extends TestFoundations {

    @Test
    public void privateBankingTests(){
        PageNavigation pageNavigation = new PageNavigation(driver);
        pageNavigation.navigateToPage(AppURLs.getPrivetBankingPage());
    }
}

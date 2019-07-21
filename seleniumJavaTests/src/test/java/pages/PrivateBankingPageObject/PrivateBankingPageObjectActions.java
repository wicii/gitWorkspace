package pages.PrivateBankingPageObject;

import org.openqa.selenium.WebDriver;
import pages.ObjectPageFoundation;
import waits.WaitForWebElement;

public class PrivateBankingPageObjectActions extends ObjectPageFoundation {

    private PrivateBankingPageObjectElements privateBankingPageObjectElements;

    public PrivateBankingPageObjectActions(WebDriver driver){
        this.driver = driver;
        privateBankingPageObjectElements = new PrivateBankingPageObjectElements(driver);
        waitForWebElement = new WaitForWebElement(driver);
    }
}

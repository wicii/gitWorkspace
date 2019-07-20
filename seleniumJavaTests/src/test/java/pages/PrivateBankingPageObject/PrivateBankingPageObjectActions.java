package pages.PrivateBankingPageObject;

import org.openqa.selenium.WebDriver;
import waits.WaitForWebElement;

public class PrivateBankingPageObjectActions {

    private WebDriver driver;
    private PrivateBankingPageObjectElements privateBankingPageObjectElements;
    private WaitForWebElement waitForWebElement;

    public PrivateBankingPageObjectActions(WebDriver driver){
        this.driver = driver;
        privateBankingPageObjectElements = new PrivateBankingPageObjectElements(driver);
        waitForWebElement = new WaitForWebElement(driver);
    }
}

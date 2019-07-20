package pages.MainPageObject;

import org.openqa.selenium.WebDriver;
import waits.WaitForWebElement;

public class MainPageObjectActions {

    private WebDriver driver;
    private MainPageObjectElements mainPageObjectElements;
    private WaitForWebElement waitForWebElement;

    public MainPageObjectActions(WebDriver driver){
        this.driver=driver;
        mainPageObjectElements = new MainPageObjectElements(driver);
        waitForWebElement = new WaitForWebElement(driver);
    }

    public MainPageObjectActions locateAccountButton(String buttonName){
        waitForWebElement.waitForElementToBeVisible(mainPageObjectElements.getAccountButton());
        return this;
    }

    public MainPageObjectActions locateCreditsButton(String buttonName){
        waitForWebElement.waitForElementToBeVisible(mainPageObjectElements.getCreditsButton());
        return this;
    }
}

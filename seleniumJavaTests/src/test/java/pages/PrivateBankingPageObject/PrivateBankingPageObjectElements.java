package pages.PrivateBankingPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

class PrivateBankingPageObjectElements {

    private WebDriver driver;

    PrivateBankingPageObjectElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

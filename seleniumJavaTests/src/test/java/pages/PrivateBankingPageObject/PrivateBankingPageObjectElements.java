package pages.PrivateBankingPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrivateBankingPageObjectElements {

    private WebDriver driver;

    public PrivateBankingPageObjectElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

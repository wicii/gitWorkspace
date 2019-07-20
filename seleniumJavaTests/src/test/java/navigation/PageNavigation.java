package navigation;

import logger.LogManager;
import org.openqa.selenium.WebDriver;

public class PageNavigation {

    private WebDriver driver;

    public PageNavigation(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToPage(String pageURL){
        LogManager.info("Opening " + pageURL);
        driver.navigate().to(pageURL);
    }
}

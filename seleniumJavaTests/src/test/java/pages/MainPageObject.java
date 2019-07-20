package pages;

import org.openqa.selenium.WebDriver;

public class MainPageObject {

    private WebDriver driver;

    public MainPageObject(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToPage(String pageURL) throws InterruptedException {
        driver.navigate().to(pageURL);
    }
}

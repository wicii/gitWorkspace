package pages;

import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToPage(String pageURL, WebDriver driver){
        driver.navigate().to(pageURL);
    }
}

package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser implements DriverFactory {

    @Override
    public WebDriver getWebDriver(){
        System.setProperty(DriverPaths.getDriverTypeByName("firefox"), DriverPaths.getDriverPath("firefox"));
        return new FirefoxDriver();
    }
}

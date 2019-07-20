package driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements DriverFactory {

    @Override
    public WebDriver getWebDriver() {
        System.setProperty(DriverPaths.getDriverTypeByName("chrome"), DriverPaths.getDriverPath("chrome"));
        return new ChromeDriver();
    }
}
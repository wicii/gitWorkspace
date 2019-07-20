package driver;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverCaps {
    public static void configureDriver(WebDriver driver){
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
    }
}

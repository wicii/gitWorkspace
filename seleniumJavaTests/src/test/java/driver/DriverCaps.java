package driver;

import org.openqa.selenium.WebDriver;

public class DriverCaps {
    public static void configureDriver(WebDriver driver){
        driver.manage().window().maximize();
    }
}

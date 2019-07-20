package tests;

import driver.DriverCaps;
import driver.DriverFactory;
import driver.DriverFactoryProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestFoundations {

    public WebDriver driver;


    @BeforeMethod
    public void prepareDriver(){
        DriverFactory driverFactory = DriverFactoryProvider.getDriverFactory("chrome");
        driver = driverFactory.getWebDriver();
        DriverCaps.configureDriver(driver);
    }

    @AfterMethod
    public void driverShutDown(){
        driver.close();
        driver.quit();
    }
}

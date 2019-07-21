package tests;

import driver.DriverCaps;
import driver.DriverFactory;
import driver.DriverFactoryProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestFoundations {

    public WebDriver driver;

    @BeforeClass
    public void prepareDriver(){
        DriverFactory driverFactory = DriverFactoryProvider.getDriverFactory("chrome");
        driver = driverFactory.getWebDriver();
        DriverCaps.configureDriver(driver);
    }

    @AfterClass
    public void driverShutDown(){
        driver.close();
        driver.quit();
    }
}

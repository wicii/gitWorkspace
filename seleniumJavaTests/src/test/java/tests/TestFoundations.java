package tests;

import driver.DriverCaps;
import driver.DriverFactory;
import driver.DriverFactoryProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class TestFoundations {

    public WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void prepareDriver(@Optional("chrome") String browser){
        DriverFactory driverFactory = DriverFactoryProvider.getDriverFactory(browser);
        driver = driverFactory.getWebDriver();
        DriverCaps.configureDriver(driver);
    }

    @AfterClass
    public void driverShutDown(){
        driver.close();
        driver.quit();
    }
}

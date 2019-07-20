package tests;

import driver.DriverFactory;
import driver.DriverFactoryProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;
import urls.AppURLs;

public class MainPageTests {

    public WebDriver driver;

    @BeforeMethod
    public void prepareDriver(){
        DriverFactory driverFactory = DriverFactoryProvider.getDriverFactory("chrome");
        WebDriver driver = driverFactory.getWebDriver();
        driver.manage().window().maximize();
        driver.navigate().to(AppURLs.getMainPageURL());
    }
    @Test
    public void mainPageTest(){

    }
    @AfterMethod
    public void driverShutDown(){
        driver.close();
        driver.quit();
    }
}

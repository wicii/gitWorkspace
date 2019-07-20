package driver;

public class DriverFactoryProvider {

    public static DriverFactory getDriverFactory(String driver){
        switch(driver){
            case "chrome":
                return new ChromeBrowser();
            case "firefox":
                return new FireFoxBrowser();
            default: throw new IllegalArgumentException();
        }
    }
}

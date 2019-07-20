package driver;

class DriverPaths {

    protected static String getDriverTypeByName(String driverName){

        switch(driverName) {
            case "chrome":
                return "webdriver.chrome.driver";

            case "firefox":
                return "webdriver.firefox.driver";

            default : throw new IllegalArgumentException();
        }
    }

    protected static String getDriverPath(String driverPath){

        switch(driverPath){
            case "chrome":
                return "C:\\drivers\\chromedriver.exe";

            case "firefox":
                return "path to FF";

            default : throw new IllegalArgumentException();
        }
    }
}

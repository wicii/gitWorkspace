package logger;

import org.apache.log4j.Logger;

public class LogManager {

    private static Logger Log = Logger.getLogger(LogManager.class.getName());

    public static void startTestCase(String sTestCaseName) {
        Log.info("Starting: " + sTestCaseName);

    }

    public static void endTestCase() {
        Log.info("TestCase Ended");
    }

    public static void info(String message) {
        Log.info(message);
    }
}

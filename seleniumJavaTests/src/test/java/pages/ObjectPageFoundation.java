package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import waits.WaitForWebElement;

public class ObjectPageFoundation {

    protected WebDriver driver;
    protected WaitForWebElement waitForWebElement;
    protected Actions action;
    protected JavascriptExecutor javascriptExecutor;
}

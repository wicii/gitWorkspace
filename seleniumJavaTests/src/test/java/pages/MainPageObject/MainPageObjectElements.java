package pages.MainPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageObjectElements {

    private WebDriver driver;

    public MainPageObjectElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class=\"submenu\"]//a[text()=\"Konta\"]")
    private WebElement accountDropDownButton;

    @FindBy(xpath = "//ul[@class=\"submenu\"]//a[text()=\"Kredyty\"]")
    private WebElement creditsDropDownButton;

    public WebElement getAccountButton(){
        return accountDropDownButton;
    }

    public WebElement getCreditsButton(){
        return creditsDropDownButton;
    }
}

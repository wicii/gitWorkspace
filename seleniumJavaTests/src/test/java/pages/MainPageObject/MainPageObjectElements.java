package pages.MainPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPageObjectElements {

    private WebDriver driver;

    public MainPageObjectElements(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class=\"submenu\"]//a[text()=\"Konta\"]")
    private static WebElement accountDropDownButton;

    @FindBy(xpath = "//ul[@class=\"submenu\"]//a[text()=\"Kredyty\"]")
    private WebElement creditsDropDownButton;

    @FindBy(xpath = "//ul[@class=\"submenu\"]//li[@class=\"dropdown\"]")
    private List<WebElement> dropdownSubMenuElements;

    @FindBy(xpath = "//a[@href=\"/indywidualny/konta/konta-osobiste/\"]")
    private WebElement personalAccountsButton;

    @FindBy (xpath = "//span[contains(text(),\"Wybierz konto osobiste\")]")
    private WebElement privateAccountsPageTitle;

    public WebElement getAccountButton(){
        return accountDropDownButton;
    }

    public WebElement getCreditsButton(){
        return creditsDropDownButton;
    }

    public List<WebElement> getDropdownSubMenuElements(){
        return dropdownSubMenuElements;
    }

    public WebElement getPersonalAccountsButton(){
        return personalAccountsButton;
    }

    public WebElement getPrivateAccountsPageTitle(){
        return privateAccountsPageTitle;
    }
}

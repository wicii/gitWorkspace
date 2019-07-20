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

    @FindBy(xpath = "//a[@title=\"Szukaj w serwisie\"]")
    private WebElement openSearchFormButton;

    @FindBy(xpath = "//input[@title=\"Czego szukasz?\"]")
    private WebElement searchForm;

    @FindBy(xpath = "//div[@id=\"output\"]//div")
    private List<WebElement> searchResults;

    @FindBy(xpath = "//button//span[\"Zamknij wyszukiwarkę\"]")
    private WebElement closeSearchForm;

    public WebElement getAccountButton(){
        return accountDropDownButton;
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

    public WebElement getSearchButton(){
        return openSearchFormButton;
    }

    public WebElement getSearchForm(){
        return searchForm;
    }

    public List<WebElement> getSearchResults(){
        return searchResults;
    }

    public WebElement getCloseSearchFormButton(){
        return closeSearchForm;
    }
}

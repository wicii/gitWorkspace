package pages.MainPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

class MainPageObjectElements {

    MainPageObjectElements(WebDriver driver){
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

    @FindBy(css = "#log-in")
    private WebElement logInButton;

    @FindBy(xpath = "//form[@id=\"loginForm\"]")
    private WebElement logInForm;

    WebElement getAccountButton(){
        return accountDropDownButton;
    }

    List<WebElement> getDropdownSubMenuElements(){
        return dropdownSubMenuElements;
    }

    WebElement getPersonalAccountsButton(){
        return personalAccountsButton;
    }

    WebElement getPrivateAccountsPageTitle(){
        return privateAccountsPageTitle;
    }

    WebElement getSearchButton(){
        return openSearchFormButton;
    }

    WebElement getSearchForm(){
        return searchForm;
    }

    List<WebElement> getSearchResults(){
        return searchResults;
    }

    WebElement getCloseSearchFormButton(){
        return closeSearchForm;
    }

    WebElement getLogInButton(){
        return logInButton;
    }

    WebElement getLoginForm(){
        return logInForm;
    }
}

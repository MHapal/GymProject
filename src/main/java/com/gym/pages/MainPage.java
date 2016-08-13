package com.gym.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mhap on 09.08.2016.
 */
public class MainPage extends Page {

    //    public WebDriver driver = new ChromeDriver();
    public MainPage(WebDriver driver) {
        super(driver);
    }

    //Locators for elements on the main page
    @FindBy(xpath = ".//*[@id='header']/div[2]/div[2]/h1/span/a")
    public WebElement mainHeader;

    @FindBy(id = "menu-item-54")
    public WebElement kotiButton;

    @FindBy(id = "menu-item-53")
    public WebElement palvelutButton;

    @FindBy(id = "menu-item-52")
    public WebElement hinnastoButton;

    @FindBy(id = "menu-item-51")
    public WebElement aikataulutButton;

    @FindBy(id = "menu-item-50")
    public WebElement uutisetButton;

    @FindBy(id = "menu-item-49")
    public WebElement kuvatButton;

    @FindBy(id = "menu-item-48")
    public WebElement ohjaajatButton;

    @FindBy(id = "menu-item-47")
    public WebElement yhteystiedotButton;




    public String getMainHeader(WebElement title) {
        return mainHeader.getText();

    }


}

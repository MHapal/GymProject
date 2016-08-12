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

    public String getMainHeader(WebElement title) {
        return mainHeader.getText();

    }


}

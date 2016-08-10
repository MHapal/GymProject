package com.gym.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mhap on 09.08.2016.
 */
public abstract class Page {

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    protected WebDriver driver;

    @FindBy(css = "#lang_choice_polylang-2")
    public WebElement langSelector;

}

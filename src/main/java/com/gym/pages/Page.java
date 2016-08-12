package com.gym.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mhap on 09.08.2016.
 */
public abstract class Page {

    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(id = "lang_choice_polylang-2")
    public WebElement langSelector;

   public List<String> languages() {
       List<WebElement> languages = langSelector.findElements(By.tagName("option"));
       List<String> langs = new LinkedList<String>();
       for (int i = 0; i < languages.size(); i++) {
           langs.add(languages.get(i).getText());
       }
       return langs;
   }
}





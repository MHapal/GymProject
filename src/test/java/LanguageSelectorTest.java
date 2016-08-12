import com.gym.pages.MainPage;
import com.gym.utils.ConfigProperties;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mhap on 10.08.2016.
 * Test case to verify if the language selector is visible
 */
public class LanguageSelectorTest extends BasicTestCase {

    private MainPage mainPage;
    final static Logger LOG = Logger.getLogger(LanguageSelectorTest.class);

    @Test
    private void verifyMainPage() throws Exception {
        driver.get(ConfigProperties.getProperty("main_url"));
        LOG.info("Page is opened");

        MainPage mainPage = new MainPage(driver);

        //Check if the selector is visible
        Assert.assertTrue(mainPage.langSelector.isDisplayed(), "The Language Selector is not Displayed");
        //Check if multiple selection can be made
        Select langSelect = new Select(mainPage.langSelector);
        Assert.assertFalse(langSelect.isMultiple(),"Multiple Selection Can be made in the Language Selector");
        //Check if there are two options in the list
        Assert.assertEquals(2, langSelect.getOptions().size(), "The number of languages is not equal to 2");
        //Check if the laguages available are correct ones
        List<String> expLangs =  Arrays.asList("Suomi", "Svenska");
        Assert.assertEquals(expLangs,mainPage.languages(), "The options in the Language drop don are incorrect");

    }

}

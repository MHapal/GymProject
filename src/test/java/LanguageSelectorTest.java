import com.gym.pages.MainPage;
import com.gym.utils.ConfigProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

/**
 * Created by mhap on 10.08.2016.
 * Test case to verify if the language selector is visible
 */
public class LanguageSelectorTest extends BasicTestCase {

    private MainPage mainPage;
    final static Logger LOG = Logger.getLogger(VerifyMainPageTest.class);
    public static String[] listOfLangs = {"Svenska", "Suomi"};

    @Test
    private void verifyMainPage() throws Exception {
        driver.get(ConfigProperties.getProperty("main_url"));
        LOG.error("Page is opened");

        MainPage mainPage = new MainPage(driver);

        //Check if the selector is visible
        Assert.assertTrue(mainPage.langSelector.isDisplayed(), "The Language Selector is not Displayed");

    }

}

import com.gym.pages.MainPage;
import com.gym.utils.ConfigProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

/**
 * Created by mhap on 09.08.2016.
 * Test case to verify the Web Page Title
 */


public class VerifyMainPageTest extends BasicTestCase {

    private MainPage mainPage;
    final static Logger LOG = Logger.getLogger(VerifyMainPageTest.class);
    public static String title = "gym - Just another WordPress site";

    @Test
    private void verifyMainPage() throws Exception {
        driver.get(ConfigProperties.getProperty("main_url"));
        LOG.info("Page is opened");

        //Check the page title
        Assert.assertEquals(driver.getTitle(), title);
        LOG.error("Title is correct");

    }

}


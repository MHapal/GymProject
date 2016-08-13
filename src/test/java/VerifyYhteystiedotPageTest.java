import com.gym.pages.MainPage;
import com.gym.pages.YhteystiedotPage;
import com.gym.utils.ConfigProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

/**
 * Created by Mykola on 8/13/2016.
 */
public class VerifyYhteystiedotPageTest extends BasicTestCase {

    private MainPage mainPage;
    private YhteystiedotPage yhteystiedotPage;
    final static Logger LOG = Logger.getLogger(VerifyMainPageTest.class);
    public static String title = "yhteystiedot | gym";

    @Test
    private void verifyYhteystiedotPageTest()throws Exception{
        driver.get(ConfigProperties.getProperty("main_url"));
        LOG.info("Page is opened");

        MainPage mainPage = new MainPage(driver);
        YhteystiedotPage yhteystiedotPage = new YhteystiedotPage(driver);

        mainPage.yhteystiedotButton.click();
        Assert.assertEquals(driver.getTitle(),title);
    }
}

import com.gym.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by mhap on 09.08.2016.
 */


public class VerifyMainPageTest extends BasicTestCase {

    private MainPage mainPage;

    @Test
    public void verifyMainPage()throws Exception{
        mainPage.open();
    }




    }


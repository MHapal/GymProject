import com.gym.utils.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by mhap on 09.08.2016.
 */
public class BasicTestCase {
    protected static WebDriver driver;
    protected WebDriver getWebDriver(){
        if (driver == null){
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);
        }
        return driver;
    }
    @AfterTest
    public void tearDown()throws Exception{
        driver.quit();
    }
}



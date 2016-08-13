import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


/**
 * Created by mhap on 09.08.2016.
 */
public class BasicTestCase {
    protected static WebDriver driver;


    public BasicTestCase() {
        System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Selenium/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }
}



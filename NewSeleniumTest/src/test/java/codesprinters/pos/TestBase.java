package codesprinters.pos;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;



/**
 * Created by holkins on 2017-05-30.
 */
public abstract class TestBase {

    private final String PROP_NAME = "webdriver.gecko.driver";
    private final String DRIVER_PATH = "C:\\drivers\\old\\geckodriver.exe";

    protected WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty(PROP_NAME, DRIVER_PATH);

        driver = new FirefoxDriver();

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void testTeardown() {
        if (driver!=null) {
            driver.close(); // changed from driver.quit(); - bug
        }
    }

}

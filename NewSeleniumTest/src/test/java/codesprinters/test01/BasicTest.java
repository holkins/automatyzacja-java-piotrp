package codesprinters.test01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

/**
 * Created by holkins on 2017-05-29.
 */
public class BasicTest {

    @Test
    public void verifyIfGoogleFindsCodeSprinters() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // czy strona sie zaladowala w 10s (czas na zaladowanie wszystkich watkow), jesli nie to ubija test(?)
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("Code Sprinters");
        googleSearchBox.sendKeys(Keys.ENTER);
        WebElement codeSprinters = driver.findElement(By.xpath("//a[text()='Code Sprinters -']"));
        codeSprinters.click();
        Thread.sleep(2000);

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        Thread.sleep(2000);
        Assert.assertEquals(currentURL, "http://agileszkolenia.pl/" );


        if (driver!=null){
            driver.quit();
        }

    }



}
